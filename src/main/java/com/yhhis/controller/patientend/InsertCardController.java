package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.Patients;
import com.his.server.WebServices;
import com.wxapi.WxApiCall.WxApiCall;
import com.wxapi.model.RequestModel;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.UserDome;
import com.yhhis.common.util.CardUtil;
import com.yhhis.common.util.Util;
import com.yhhis.common.wxSDK.WeixinException;
import com.yhhis.common.wxSDK.component.MessageComponent;
import com.yhhis.common.wxSDK.pojo.TemplateData;
import com.yhhis.common.wxSDK.pojo.TemplateMessage;
import com.yhhis.common.wxSDK.pojo.Weixin;
import com.yhhis.dao.SequenceDao;
import com.yhhis.service.PatientsService;
import com.yhhis.service.impl.RedisServiceImpl;
import com.yhhis.service.impl.WxConfig;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("builbin")
public class InsertCardController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsertCardController.class);
    private static int i = 1;
    @Resource
    WebServices webServices;
    @Resource
    private PatientsService patientsService;
    @Autowired
    private RedisServiceImpl redisService;
    @Resource
    private SequenceDao sequenceDao;
    @Autowired
    private WxConfig wxConfig;

    @RequestMapping(value = "/Verified", method = RequestMethod.POST)
    @ResponseBody
    public String Verified(@RequestParam("openid") String openid, @RequestParam("Name") String name, @RequestParam("IdNumber") String idnum) {
        CommonResult commonResult;
        String s = redisService.get(openid);
        String message = "";
        RequestModel model = new RequestModel();
        model.setGwUrl(wxConfig.getId_Url());
        model.setAppkey(wxConfig.getId_Appkey());
        Map queryMap = new HashMap();
        queryMap.put("cardno", idnum); //访问参数
        queryMap.put("name", name); //访问参数
        model.setQueryParams(queryMap);
        WxApiCall call = new WxApiCall();
        call.setModel(model);
        if (s == null) {
            redisService.setTime(openid, (++i) + "", 60L);
            message = call.request();
        } else {
            int s1 = Integer.parseInt(redisService.get(openid));
            if (s1 <= 3) {
                redisService.setTime(openid, (++i) + "", 60L);
                message = call.request();
            } else {
                System.out.println("------------------频繁操作，请一个小时之后进行操作-------------");
                message = "频繁操作，请一个小时之后进行操作";
                i = 1;
                commonResult = CommonResult.failed(message);
                LOGGER.debug("Verified fail:{}", message);
                return JSON.toJSONString(commonResult);
            }
        }
        return message;
    }


    @RequestMapping(value = "insertCard", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public CommonResult insertCard(@RequestBody Patients patients, @RequestParam("code") String code) {
        CommonResult commonResult = null;
        com.yhhis.common.entity.Patients newpatinent = new com.yhhis.common.entity.Patients();
        //验证身份证
        UserDome IDinfo = CardUtil.getRequest(patients.getIdno());
        //获取验证码
        String redis_code = redisService.get("phone_" + patients.getPhone());
        if (IDinfo != null && redis_code != code) {
            //首先查询HIS个人信息
            String obj = webServices.getCardno(patients.getIdno(), patients.getName(), patients.getPhone());
            JSONArray arry = JSONArray.fromObject(obj);

            newpatinent.setName(patients.getName());
            newpatinent.setIdno(patients.getIdno());
            newpatinent.setOpenid(patients.getOpenid());
            newpatinent.setSex(IDinfo.getSex());
            newpatinent.setBirthdate(IDinfo.getBirthday());
            newpatinent.setAdress(IDinfo.getArea());
            newpatinent.setStauts(1);// 1代表可用,0禁用
            if (arry.size() == 0) {
                String cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
                int i = webServices.getCardCount(cardNo);
                while (i > 0) {
                    cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
                    i = webServices.getCardCount(cardNo);
                }
                patients.setAdress(IDinfo.getArea());
                patients.setSex(IDinfo.getSex());
                patients.setBirthdate(IDinfo.getBirthday());
                patients.setStauts(0);
                patients.setCardno(cardNo);
                // 向his建卡添加
                webServices.addCardno(patients);
                //TODO  发送模板操作还未完成
                newpatinent.setCardno(cardNo);
                newpatinent.setPhone(patients.getPhone());
                boolean flag = patientsService.newPatient(newpatinent);
                if (flag) {
                    TemplateMessage templateMessage = new TemplateMessage();
                    List<TemplateData> paras = new ArrayList<TemplateData>();
                    paras.add(new TemplateData("first", "(恭喜成功)", "#000000"));
                    paras.add(new TemplateData("keyword1", patients.getCardno(), "#000000"));
                    paras.add(new TemplateData("keyword2", patients.getName(), "#000000"));
                    paras.add(new TemplateData("remark", Util.getTime("yyyy-MM-dd HH:mm"), "#000000"));
                    templateMessage.setOpenid(patients.getOpenid());
                    templateMessage.setTemplateId(WxConfig.REG_TEMPLATE_ID);
                    templateMessage.setData(paras);
                    Weixin weixin = new Weixin();
                    MessageComponent messageComponent = new MessageComponent(weixin);
                    try {
                        MessageComponent.sendTemplateMessage(templateMessage);
                        commonResult = CommonResult.success("建卡成功");
                        LOGGER.debug("insertCard success:{}", patients);
                    } catch (WeixinException e) {
                        LOGGER.debug("insertCard success:{}", e);
                    }
                } else {
                    commonResult = CommonResult.failed("建卡失败");
                    LOGGER.debug("insertCard failed:{}", patients);
                }
            } else {
                JSONObject jsonObject = arry.getJSONObject(0);
                String phone = (String) jsonObject.get("phone");
                String cardno = (String) jsonObject.get("cardno");
                newpatinent.setCardno(cardno);
                newpatinent.setPhone(phone);
                Integer patientsByIdnoAndName = patientsService.getPatientsByIdnoAndName(patients.getIdno());
                if (patientsByIdnoAndName == null) {
                    patientsService.newPatient(newpatinent);
                    commonResult = CommonResult.success("建卡成功");
                    LOGGER.debug("insertCard success:{}", patients);
                } else if (patientsByIdnoAndName == 0) {
                    patientsService.updateOpenid(patients.getOpenid(), patients.getIdno());
                    commonResult = CommonResult.success("获取卡号成功！");
                    LOGGER.debug("insertCard success:{}", IDinfo + "----" + redis_code);
                } else {
                    commonResult = CommonResult.failed("建卡重复");
                    LOGGER.debug("insertCard failed:{}", patients);
                }
            }
//            if (cardno == null) {
//
//            } else {
//
//            }
        } else {
            commonResult = CommonResult.failed("验证码或者身份证验证失败");
            LOGGER.debug("insertCard failed:{}", IDinfo + "----" + redis_code);
        }
        return commonResult;
    }
//            Integer patientsByIdnoAndName = patientsService.getPatientsByIdnoAndName(patients.getIdno());
//            if (patientsByIdnoAndName == null || patientsByIdnoAndName == 0) {
//
//                newpatinent.setCardno(cardno);
//                newpatinent.setName(patients.getName());
//                newpatinent.setIdno(patients.getIdno());
//                newpatinent.setPhone(patients.getPhone());
//                newpatinent.setOpenid(patients.getOpenid());
//                newpatinent.setSex(IDinfo.getSex());
//                newpatinent.setBirthdate(IDinfo.getBirthday());
//                newpatinent.setAdress(IDinfo.getArea());
//                newpatinent.setStauts(1);// 1代表可用,0禁用
//                if () {
//                    String cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
//                    int i = webServices.getCardCount(cardNo);
//                    while (i > 0) {
//                        cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
//                        i = webServices.getCardCount(cardNo);
//                    }
//                    patients.setAdress(IDinfo.getArea());
//                    patients.setSex(IDinfo.getSex());
//                    patients.setBirthdate(IDinfo.getBirthday());
//                    patients.setStauts(0);
//                    patients.setCardno(cardNo);
//                    // 向his建卡添加
//                    webServices.addCardno(patients);
//                    //TODO  发送模板操作还未完成
//                    newpatinent.setCardno(cardNo);
//                    boolean flag = patientsService.newPatient(newpatinent);
//                    if (flag) {
//                        TemplateMessage templateMessage = new TemplateMessage();
//                        List<TemplateData> paras = new ArrayList<TemplateData>();
//                        paras.add(new TemplateData("first", "(恭喜成功)", "#000000"));
//                        paras.add(new TemplateData("keyword1", patients.getCardno(), "#000000"));
//                        paras.add(new TemplateData("keyword2", patients.getName(), "#000000"));
//                        paras.add(new TemplateData("remark", Util.getTime("yyyy-MM-dd HH:mm"), "#000000"));
//                        templateMessage.setOpenid(patients.getOpenid());
//                        templateMessage.setTemplateId(WxConfig.REG_TEMPLATE_ID);
//                        templateMessage.setData(paras);
//
//                        Weixin weixin = new Weixin();
//                        MessageComponent messageComponent = new MessageComponent(weixin);
////                        try {
////                            messageComponent.sendTemplateMessage(templateMessage);
////                        } catch (WeixinException e) {
////                            e.printStackTrace();
////                        }
//                        try {
//                            MessageComponent.sendTemplateMessage(templateMessage);
//                            commonResult = CommonResult.success("建卡成功");
//                            LOGGER.debug("insertCard success:{}", patients);
//                        } catch (WeixinException e) {
//                            LOGGER.debug("insertCard success:{}", e);
//                        }
//                    } else {
//                        commonResult = CommonResult.failed("建卡失败");
//                        LOGGER.debug("insertCard failed:{}", patients);
//                    }
//                } else if (cardno!="0") {
//                    patientsService.newPatient(newpatinent);
//                    commonResult = CommonResult.success("建卡成功");
//                    LOGGER.debug("insertCard success:{}", patients);
//                } else {
//                    patientsService.updateOpenid(patients.getOpenid(), patients.getIdno());
//                    commonResult = CommonResult.success("获取卡号成功！");
//                    LOGGER.debug("insertCard success:{}", IDinfo + "----" + redis_code);
//                }
//            } else {
//                commonResult = CommonResult.failed("建卡失败");
//                LOGGER.debug("insertCard failed:{}", patients);
//            }
//        } else {
//            commonResult = CommonResult.failed("验证码或者身份证验证失败");
//            LOGGER.debug("insertCard failed:{}", IDinfo + "----" + redis_code);
//        }
////    /**
////     * 建卡
////     *
////     * @param response
////     * @param request
////     */
////    @RequestMapping(value = "insertCard", method = RequestMethod.POST)
////    @ResponseBody
////    public void insertCard(HttpServletResponse response, HttpServletRequest request) {
////        response.setCharacterEncoding("UTF-8");
////        response.setContentType("text/html;charset=UTF-8");
////        PrintWriter writer = null;
////        Map<String, Object> map = new HashMap<String, Object>();
////        String idno = request.getParameter("idno");// 身份证
////        String name = request.getParameter("name");// 姓名
////        String openid = request.getParameter("openid");// openid
////        String phone = request.getParameter("phone");// 手机号
////        String code = request.getParameter("code");// 验证码
////        Patients patient = new Patients();
////        com.his.server.Patients newpatient = new com.his.server.Patients();
////        try {
////            writer = response.getWriter();
////            String redisvalue = redisService.get("phone_" + phone);
////            UserDome IDinfo = CardUtil.getRequest(idno);
////            if (code.equals(redisvalue) && IDinfo != null) {
////                Integer status = patientsService.getPatientsByIdnoAndName(idno);
////                if (status == null) {
////                    String resultlist = webServices.getCardno(idno, name);
////                    if ("0".equals(resultlist)) {
////                        String cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
////                        int i = webServices.getCardCount(cardNo);
////                        while (i > 0) {
////                            cardNo = Util.RanDomten() + sequenceDao.getSequenceNo();
////                            i = webServices.getCardCount(cardNo);
////                        }
////                        newpatient.setCardno(cardNo);
////                        newpatient.setName(name);
////                        newpatient.setIdno(idno);
////                        newpatient.setPhone(phone);
////                        newpatient.setOpenid(openid);
////                        newpatient.setSex(IDinfo.getSex());
////                        newpatient.setBirthdate(IDinfo.getBirthday());
////                        newpatient.setAdress(IDinfo.getArea());
////                        newpatient.setStauts(0);
////
////                        patient.setCardno(cardNo);
////                        patient.setName(name);
////                        patient.setIdno(idno);
////                        patient.setPhone(phone);
////                        patient.setOpenid(openid);
////                        patient.setSex(IDinfo.getSex());
////                        patient.setBirthdate(IDinfo.getBirthday());
////                        patient.setAdress(IDinfo.getArea());
////                        patient.setStauts(1);// 1代表可用,0禁用
////                        // 向his建卡添加
////                        webServices.addCardno(newpatient);
////                        boolean flag = patientsService.newPatient(patient);
////                        if (flag) {
////                            map.put(ReturnCode.data, patient);
////                            map.put(ReturnCode.message, "建卡成功。");
////                            map.put(ReturnCode.status, "1");
////                            // 建卡成功发送模板
////                            WxTemplate.sendRegistersTemplate(openid, cardNo, name);
////                        } else {
////                            map.put(ReturnCode.data, "");
////                            map.put(ReturnCode.message, "建卡失败！");
////                            map.put(ReturnCode.status, "0");
////                        }
////                    } else if ("-1".equals(resultlist)) {
////                        map.put(ReturnCode.data, "");
////                        map.put(ReturnCode.message, "建卡失败！");
////                        map.put(ReturnCode.status, "-1");
////                    } else {
////                        Patients resultPatient = getPatients(resultlist, idno, openid);
////                        patientsService.newPatient(resultPatient);
////                        map.put(ReturnCode.data, resultPatient);
////                        map.put(ReturnCode.message, "获取卡号成功。");
////                        map.put(ReturnCode.status, "1");
//////						WxTemplate.sendRegistersTemplate(openid, resultPatient.getCardno(), name);
////
////                        TemplateMessage templateMessage = new TemplateMessage();
////                        List<TemplateData> paras = new ArrayList<TemplateData>();
////                        paras.add(new TemplateData("first", "(恭喜成功)", "#000000"));
////                        paras.add(new TemplateData("keyword1", resultPatient.getCardno(), "#000000"));
////                        paras.add(new TemplateData("keyword2", resultPatient.getName(), "#000000"));
////                        paras.add(new TemplateData("keyword3", "remark", "#000000"));
////                        templateMessage.setOpenid(openid);
////                        templateMessage.setTemplateId(WxConfig.REG_TEMPLATE_ID);
////                        templateMessage.setData(paras);
////                        MessageComponent.sendTemplateMessage(templateMessage);
////                    }
////                } else if (status == 0) {
////                    patientsService.updateOpenid(openid, idno);
////                    String resultlist = webServices.getCardno(idno, name);
////                    Patients resultPatient = getPatients(resultlist, idno, openid);
////                    map.put(ReturnCode.data, resultPatient);
////                    map.put(ReturnCode.message, "获取卡号成功。");
////                    map.put(ReturnCode.status, "1");
////                    // 建卡成功发送模板
//////					WxTemplate.sendRegistersTemplate(openid, resultPatient.getCardno(), name);
////                    TemplateMessage templateMessage = new TemplateMessage();
////                    List<TemplateData> paras = new ArrayList<TemplateData>();
////                    paras.add(new TemplateData("first", "(恭喜注册成功)", "#000000"));
////                    paras.add(new TemplateData("keyword1", resultPatient.getCardno(), "#000000"));
////                    paras.add(new TemplateData("keyword2", resultPatient.getName(), "#000000"));
////                    paras.add(new TemplateData("keyword3", "remark", "#000000"));
////                    templateMessage.setOpenid(openid);
////                    templateMessage.setTemplateId(WxConfig.REG_TEMPLATE_ID);
////                    templateMessage.setData(paras);
////                    MessageComponent.sendTemplateMessage(templateMessage);
////                    return;
////                } else if (status == 1) {
////                    map.put(ReturnCode.data, "1");
////                    map.put(ReturnCode.message, "该账号已建卡，请勿重复建卡。");
////                    map.put(ReturnCode.status, "1");
////                    writer.print(JSON.toJSONString(map));
////                    writer.flush();
////                    writer.close();
////                    return;
////                }
////            } else {
////                map.put(ReturnCode.data, "");
////                map.put(ReturnCode.message, "验证码或者身份证验证失败");
////                map.put(ReturnCode.status, "0");
////            }
////        } catch (Exception e) {
////            logger.info("url:insertCard。message: 判断本地是否有卡号 没有卡号去his查询 如果有 拉去信息存档，没有新建卡异常。===请到日志中查询异常信息。===");
////            logger.error(e.getMessage(), e);
////            map.put(ReturnCode.data, "");
////            map.put(ReturnCode.message, "建卡失败！");
////            map.put(ReturnCode.status, "-1");
////            e.printStackTrace();
////        } finally {
////            writer.print(JSON.toJSONString(map));
////            writer.flush();
////            writer.close();
////        }
////    }
//
////    /**
////     * com.his 返回数据 处理为对象
////     *
////     * @param result
////     * @return
////     */
////    public Patients getPatients(String result, String idno, String openid) {
////        Patients patient = new Patients();
////        Map<String, Object> jsonStrToMap = Util.jsonStrToMap(result);
////        Map<String, Object> jsonStrToArray = Util.jsonStrToArray(jsonStrToMap.get("data").toString());
////        Object cardno = jsonStrToArray.get("cardno");
////        if (cardno != null) {
////            patient.setCardno(cardno.toString());
////        }
////        Object names = jsonStrToArray.get("name");
////        if (names != null) {
////            patient.setName(names.toString());
////        }
////        Object phones = jsonStrToArray.get("phone");
////        if (phones != null) {
////            patient.setPhone(phones.toString());
////        }
////        Object sex = jsonStrToArray.get("sex");
////        if (sex != null) {
////            patient.setSex(sex.toString());
////        }
////        patient.setIdno(idno);
////        patient.setOpenid(openid);
////        Object birthdate = jsonStrToArray.get("birthdate");
////        // 当前获取的是时间戳
////        if (birthdate != null) {
////            String timeBylong = Util.getTimeBylong(birthdate.toString());
////            patient.setBirthdate(timeBylong);
////        }
////        Object address = jsonStrToArray.get("address");
////        if (address != null) {
////            patient.setAdress(address.toString());
////        }
////        patient.setStauts(1);// 1代表可用,0禁用
////        return patient;
////    }
}
