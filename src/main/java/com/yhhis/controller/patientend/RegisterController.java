package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.his.server.PatientRegister;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.WxPlayOrderEntity;
import com.yhhis.common.entity.WxpayOrdersEntity;
import com.yhhis.common.util.NoTools;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.common.util.Util;
import com.yhhis.controller.wxpay.WxTemplate;
import com.yhhis.service.WXPayService;
import com.yhhis.service.WxpayOrdersService;
import com.yhhis.service.impl.RedisServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 患者挂号
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    RedisServiceImpl redisServiceImpl;
    @Resource
    WebServices webServices;
    @Resource
    private WXPayService wxPayService;
    @Autowired
    private WxpayOrdersService wxpayOrdersService;


    //TODO
    @RequestMapping(value = "/getAllTradeno", method = RequestMethod.POST)
    @ResponseBody
    public Object getAllTradeno(@RequestParam String createTime) throws ParseException {
        String registerCanRefundPatients = webServices.getRegisterCanRefundPatients();
        JSONArray jsonArray = JSONArray.parseArray(registerCanRefundPatients);
        String string = "";
        for (int i = 1; i < jsonArray.size(); i++) {
            WxPlayOrderEntity entity = (WxPlayOrderEntity) jsonArray.get(i);
            string = entity.getCardno();
        }
//        CommonResult commonResult;
//        List<Map<String, Object>> allTradeno = wxpayOrdersService.getAllTradeno(createTime);
//        commonResult = CommonResult.success(allTradeno);
//        logger.debug("getOpenid success:{}", allTradeno);
        return string;
    }

    /**
     * 添加挂号信息 和 修改本地挂号状态为 已支付 1
     *
     * @RequestParam("orderno") String orderno, @RequestParam("cardno") String cardno, @RequestParam("hosdoccode") String hosdoccode
     * TODO
     */

    @RequestMapping(value = "/addRegister", method = RequestMethod.POST)
    @ResponseBody
    public void addRegister(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String orderno = request.getParameter("orderno");// 订单号
        String cardno = request.getParameter("cardno");// 卡号
        String hosdoccode = request.getParameter("hosdoccode");// 挂号医生编号
        WxpayOrdersEntity wxpayOrders = new WxpayOrdersEntity();
        PrintWriter writer = null;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        // 查询当前订单详情 添加到his
        String redisResult = redisServiceImpl.get("order_" + cardno + "_" + hosdoccode);
        List<HashMap> order = JSON.parseArray("[" + redisResult + "]", HashMap.class);
        int fee = (int) (Float.parseFloat(order.get(0).get("registerfee").toString()) * 100);
        try {
            writer = response.getWriter();
            // 根据的订单号查询本地订单
            if (redisResult != null && !redisResult.equals("")) {
                // 向his插入挂号信息
                String regdate = order.get(0).get("regdate").toString();// 就诊日期
                String regcode = order.get(0).get("regcode").toString();
                String amorpm = order.get(0).get("amorpm").toString();
                cardno = order.get(0).get("cardno").toString();
                String name = order.get(0).get("name").toString();
                String sex = order.get(0).get("sex").toString();
                String age = Util.getAge(order.get(0).get("birthdate").toString());
                Integer inage = Integer.parseInt(age.trim());
                String hosdepcode = order.get(0).get("hosdepcode").toString();
                hosdoccode = order.get(0).get("hosdoccode").toString();
                Double registerfee = Double.parseDouble(order.get(0).get("registerfee").toString());
                String openid = order.get(0).get("openid").toString();
                String hosdepname = order.get(0).get("hosdepname").toString();
                String hosdocname = order.get(0).get("hosdocname").toString();
                Integer visitno = Integer.parseInt(order.get(0).get("visitno").toString());
                String clinicno = order.get(0).get("clinicno").toString();
                // 新加 当支付成功后 把对应的redis信息清除
                /**
                 * TODO
                 */
                //visitno, clinicno, regdate, orderno, regcode, amorpm, cardno, name, sex, inage, "自费", hosdepcode, hosdoccode, registerfee
                PatientRegister register = new PatientRegister();
                register.setVisitno(visitno);
                register.setClinicno(clinicno);
                register.setRegdate(regdate);
                register.setAge(inage);
                register.setRegcode(regcode);
                register.setAmorpm(amorpm);
                register.setCardno(cardno);
                register.setName(name);
                register.setSex(sex);
                register.setChargetype("自费");
                register.setHosdepcode(hosdepcode);
                register.setDoccode(hosdoccode);
                register.setRegistfee(registerfee);
                register.setRcptno(orderno);
                int i = webServices.register(register);
                if (i > 0) {
                    // com.his 挂号成功删除redis 缓存信息
                    redisServiceImpl.delete("order_" + cardno + "_" + hosdoccode);
                    /**
                     * 修改本地订单状态 根据订单号修改为已支付
                     */
                    wxpayOrders.setTradeno(orderno);
                    wxpayOrders.setVisitno(visitno.toString());
                    wxpayOrders.setType("微信挂号");
                    wxpayOrdersService.updateOrdersStatus(wxpayOrders);
                    // 删除redis 缓存订单集合中的订单
                    String redisOrders = redisServiceImpl.get("order_" + cardno + "_");
                    List<HashMap> jsonStrToArray = JSON.parseArray("[" + redisOrders + "]", HashMap.class);
                    String insertRedis = "";
                    for (int j = 0; j < jsonStrToArray.size(); j++) {
                        Object tradeno = jsonStrToArray.get(j).get("tradeno");
                        String redisTradeno = "";
                        if (tradeno != null) {
                            redisTradeno = tradeno.toString();
                        }
                        String tradenos = redisTradeno;
                        // 存入不是当前订单的信息，清除当前支付的订单信息
                        if (!tradenos.equals(orderno)) {
                            insertRedis += jsonStrToArray.get(j).toString() + ",";
                        }
                    }
                    // 更新缓存订单信息
                    if (!insertRedis.equals("")) {
                        redisServiceImpl.setTime("order_" + cardno + "_", insertRedis, 5L);
                    } else {
                        redisServiceImpl.delete("order_" + cardno + "_");
                    }
                    resultMap.put(ReturnCode.data, "");
                    resultMap.put(ReturnCode.message, "挂号成功");
                    resultMap.put(ReturnCode.status, "1");
                    String guahaotime = getTime(hosdoccode, regdate);
                    // 发送挂号模板通知
                    WxTemplate.sendStrationsTemplate(openid, name, hosdepname, hosdocname, guahaotime, "");
                } else {
                    resultMap.put(ReturnCode.data, "");
                    resultMap.put(ReturnCode.message, "挂号失败！");
                    resultMap.put(ReturnCode.status, "0");
                    // 退费 删除订单
                    Map<String, String> map = wxPayService.reFund(fee, orderno);// 退款
                    if (map.get("return_code").equals("SUCCESS") && map.get("result_code").equals("SUCCESS")
                            || map == null) {
                        // 失败也删除当前订单
                        redisServiceImpl.delete("order_" + cardno + "_" + hosdoccode);
                    }
                }
            } else {
                // 订单超时
                resultMap.put(ReturnCode.data, "");
                resultMap.put(ReturnCode.message, "挂号失败，订单已超时！");
                resultMap.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            resultMap.put(ReturnCode.data, "");
            resultMap.put(ReturnCode.message, "挂号异常！");
            resultMap.put(ReturnCode.status, "-1");
            Map<String, String> map = wxPayService.reFund(fee, orderno);// 退款
            if (map.get("return_code").equals("SUCCESS") && map.get("result_code").equals("SUCCESS") || map == null) {
                redisServiceImpl.delete("order_" + cardno + "_" + hosdoccode);// 删除redis
                // 订单缓存
            }
            LOGGER.info("url:addRegister。message:加挂号信息 和 修改本地挂号状态为 已支付 1异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(resultMap));
            writer.flush();
            writer.close();
        }

    }
    //TODO
//    @RequestMapping(value = "/Work", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult Work(@RequestBody WxPlayOrderEntity wxPlayOrderEntity) throws Exception {
//        CommonResult commonResult;
//        String birthdate = Util.getBirthDateByIDNo(wxPlayOrderEntity.getIdno());
//        String tradeno = NoTools.getInstance().getWXTradeNo();//// 支付的订单号
//        String am = Util.getTime("yyyy-MM-dd HH:mm:ss");
//        wxPlayOrderEntity.setAge(Util.getAge(birthdate));
//        wxPlayOrderEntity.setBirthdate(birthdate);
//        wxPlayOrderEntity.setCardname("微信支付");
//        wxPlayOrderEntity.setTradeno(tradeno);
//        wxPlayOrderEntity.setStarttime(am);
//        String visitNo = webServices.getVisitNo();
//        wxPlayOrderEntity.setVisitno(visitNo);
//        wxPlayOrderEntity.setClinicno(webServices.getClinicNo(visitNo));
//        String orders = JSONArray.toJSONString(wxPlayOrderEntity);
//        // 将卡号+医生编号为key,value 为订单号 5L定时5分钟
//        redisServiceImpl.setTime("order_" + wxPlayOrderEntity.getCardno() + "_" + wxPlayOrderEntity.getHosdoccode(), orders, 5L);
//        redisServiceImpl.get("order_" + wxPlayOrderEntity.getCardno() + "_");
//        if (redisOrder != null && !redisOrder.equals("")) {
//            orders = orders + "," + redisOrder;
//            if (orders.endsWith(",")) {
//                orders = orders.substring(0, orders.length() - 1);
//            }
//        }
//        //未支付订单查询时使用
//        redisServiceImpl.setTime("order_" + wxPlayOrderEntity.getCardno() + "_", orders, 5L);
//
//        return null;
//    }


    /**
     * 患者进行挂号 reids 缓存
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/Work", method = RequestMethod.POST)
    @ResponseBody
    public void Work(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
//        String tradeno = NoTools.getInstance().getWXTradeNo();//// 支付的订单号
        String openid = request.getParameter("openid");
        String cardNo = request.getParameter("cardNo");// 患者卡号
        String name = request.getParameter("name");// 患者姓名
        String sex = request.getParameter("sex");// 患者性别
        String id_no = request.getParameter("id_no");// 患者身份证号
        String regDate = request.getParameter("regDate");// 就诊日期
        String hosdepcode = request.getParameter("hosdepcode");// 挂号科室编码
        String hosdepname = request.getParameter("hosdepname");// 挂号科室名称
        String hosdocname = request.getParameter("hosdocname");// 挂号医生姓名
        String hosdoccode = request.getParameter("hosdoccode");// 挂号医生编号
        String regcode = request.getParameter("regcode");// 号源编码
        String regname = request.getParameter("regcode");// 号源名称
        String amprom = request.getParameter("TimeRegion");// 是白天还是昼夜
        String registerFee = request.getParameter("registerFee");// 挂号费用
        String birthdate = Util.getBirthDateByIDNo(id_no);
        String visitNo = webServices.getVisitNo();
        String clinicNo = webServices.getClinicNo(visitNo);//支付的订单号
        try {
            writer = response.getWriter();
            // 本地添加挂号信息 状态为0 未付款
            String am = Util.getTime("yyyy-MM-dd HH:mm:ss");
            WxPlayOrderEntity order = new WxPlayOrderEntity();
            order.setAge(Util.getAge(birthdate)); // *******
            order.setAmorpm(amprom);// 白天还是昼夜
            order.setBirthdate(birthdate);
            order.setCardname("微信支付");
            order.setCardno(cardNo);
            order.setHosdepcode(hosdepcode);
            order.setHosdepname(hosdepname);
            order.setHosdoccode(hosdoccode);
            order.setHosdocname(hosdocname);
            order.setIdno(id_no);
            order.setName(name);
            order.setOpenid(openid);
            order.setRegcode(regcode);
            order.setRegdate(regDate);
            order.setRegisterfee(registerFee + ""); // 挂号支付费用
            order.setRegname(regname);
            order.setSex(sex);
            order.setStarttime(am); // 挂号时间
            order.setTradeno(clinicNo);
            order.setVisitno(visitNo);
            order.setClinicno(clinicNo);
            String orders = JSONArray.toJSONString(order);
            // 将卡号+医生编号为key,value 为订单号 5L定时5分钟
            redisServiceImpl.setTime("order_" + cardNo + "_" + hosdoccode, orders, 5L);
            String redisOrder = redisServiceImpl.get("order_" + cardNo + "_");
            if (redisOrder != null && !redisOrder.equals("")) {
                orders = orders + "," + redisOrder;
                if (orders.endsWith(",")) {
                    orders = orders.substring(0, orders.length() - 1);
                }
            }
            redisServiceImpl.setTime("order_" + cardNo + "_", orders, 5L);// 未支付订单查询时使用
            // 挂号列表
            // 确保是否已经存入redis
            String resultRedis = redisServiceImpl.get("order_" + cardNo + "_" + hosdoccode);
            if (resultRedis != null && !resultRedis.equals("")) {
                // 将对象转为json字符串
                map.put(ReturnCode.data, clinicNo);
                map.put(ReturnCode.message, "挂号成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, clinicNo);
                map.put(ReturnCode.message, "挂号失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "挂号异常");
            map.put(ReturnCode.status, "-1");
            LOGGER.info("url:Work。message:患者进行挂号 加本地异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 获取redis 缓存挂号订单
     *
     * @param cardno 患者卡号
     * @return
     */
    @RequestMapping(value = "/getRegisterRedis", method = RequestMethod.POST)
    @ResponseBody
    public String getRegisterRedis(@RequestParam("cardno") String cardno) {
        String redisOrder = redisServiceImpl.get("order_" + cardno + "_");
        if (redisOrder != null && !redisOrder.equals("")) {
            redisOrder = "[" + redisOrder + "]";
        } else {
            redisOrder = "";
        }
        return redisOrder;
    }

    /**
     * 挂号就诊记录 改成 查询his 客户端 TODO
     *
     * @param patientId 患者卡号
     * @throws IOException
     */
    @RequestMapping(value = "/getRegisterInfo", method = RequestMethod.POST)
    @ResponseBody
    public String getRegisterInfo(@RequestParam("patientId") String patientId, @RequestParam("time") String time) {
        String result = webServices.findRegisterOrders(patientId, time);
        return result;
    }

    /**
     * 挂号验证 如果当前患者已经挂过号 就不能从新挂号
     *
     * @param cardno   患者卡号
     * @param doctorno 医生编码
     */
    @RequestMapping(value = "/getVerification", method = RequestMethod.POST)
    @ResponseBody
    public void getVerification(HttpServletResponse response, @RequestParam("cardno") String cardno, @RequestParam("doctorno") String doctorno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String cardno = request.getParameter("cardno");// 患者卡号
//        String doctorno = request.getParameter("doctorno");// 医生编码
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            // 1：如redis 查找是否当前卡号存在信息 如果有提示有未支付订单
            // 2：如果没有 前端不做提示只需操作挂号流程
            String result = redisServiceImpl.get("order_" + cardno + "_" + doctorno);
            if (result != null && !result.equals("")) {
                map.put(ReturnCode.data, result);
                map.put(ReturnCode.message, "您存在未支付订单。");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, result);
                map.put(ReturnCode.message, "可以挂号");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "异常");
            map.put(ReturnCode.status, "-1");
            LOGGER.info("url:getVerification。getRegisterInfo:挂号时验证redis是否存在订单。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    @RequestMapping(value = "/getTradenoVisitno", method = RequestMethod.POST)
    @ResponseBody
    public void getTradenoVisitno(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String visitnos = request.getParameter("visitnoArr");
        String type = request.getParameter("type");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String, String>> results = new ArrayList<Map<String, String>>();
        WxpayOrdersEntity order = new WxpayOrdersEntity();
        String[] splits = visitnos.split(",");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            for (int i = 0; i < splits.length; i++) {
                order = wxpayOrdersService.getTradenoVisitno(splits[i], type);
                if (order != null) {
                    Map<String, String> result = new HashMap<String, String>();
                    result.put("tradeno", order.getTradeno());
                    result.put("visitno", order.getVisitno());
                    results.add(result);
                }
            }
            map.put(ReturnCode.data, results);
            map.put(ReturnCode.message, "成功");
            map.put(ReturnCode.status, "1");
        } catch (IOException e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "异常");
            map.put(ReturnCode.status, "-1");
            LOGGER.info("url:getTradenoVisitno。");
            LOGGER.error(e.getMessage(), e);
            e.printStackTrace();
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 挂号退号
     */
    @RequestMapping(value = "/registeredRefund", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult registeredRefund(@RequestParam("tradeno") String tradeno, @RequestParam("fee") String fee, @RequestParam("visitdate") String visitdate, @RequestParam("cardno") String cardno, @RequestParam("visitno") String visitno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String tradeno = request.getParameter("tradeno");
//        String fee = request.getParameter("fee");
//        String visitdate = request.getParameter("visitdate");
//        String cardno = request.getParameter("cardno");
//        String visitno = request.getParameter("visitno");
//        Map<String, Object> map = new HashMap<String, Object>();
//        PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
        CommonResult commonResult = null;
        int price = (int) (Float.parseFloat(fee) * 100);
        String result = webServices.registerRefundWx(visitdate, cardno, visitno);
        switch (result) {
            case "1":
                wxPayService.reFund(price, tradeno);
                commonResult = CommonResult.success("");
                LOGGER.debug("registeredRefund success:{}", "");
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "成功");
//                map.put(ReturnCode.status, "1");
                break;
            case "0":
                commonResult = CommonResult.failed("");
                LOGGER.debug("registeredRefund exception:{}", "");
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "webservice发生异常");
//                map.put(ReturnCode.status, "-1");
                break;
            case "-1":
                commonResult = CommonResult.failed("");
                LOGGER.debug("registeredRefund exception:{}", "");
                break;
        }
        return commonResult;
//        } catch (IOException e) {
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "异常");
//            map.put(ReturnCode.status, "-1");
//            logger.info("url:registeredRefund");
//            logger.error(e.getMessage(), e);
//            e.printStackTrace();
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
    }


    public String getTime(String doctorno, String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date();//此时date为当前的时间
        Date s2 = sdf1.parse(time + " 08:00:00");
        Date s3 = sdf1.parse(time + " 12:00:00");
        Date s4 = sdf1.parse(time + " 14:30:00");
        Date s5 = sdf1.parse(time + " 17:00:00");
        Date b = sdf.parse(time);
        Date now = new Date();
        String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
        JSONObject jsonObject = JSONObject.parseObject(result);
        int num = jsonObject.get("number").hashCode();
        if (b.before(date)) {
            if (num == 0) {
                Date s1 = new Date();
                if (!s1.after(s2)) {
                    s2 = new Date(s2.getTime() + 900000 * (num + 1));
                    System.out.println(sdf.format(s2));
                    return (sdf2.format(s2) + "之前过来就诊");
                } else if (!s2.after(s1) && !s3.before(s1)) {
                    s1 = new Date(s1.getTime() + 900000 * (num + 1));
                    return (sdf2.format(s1) + "之前过来就诊");
                } else if (!s3.after(s1) && !s4.before(s1)) {
                    s4 = new Date(s4.getTime() + 900000 * (num + 1));
                    return (sdf2.format(s4) + "之前过来就诊");
                } else if (!s4.after(s1) && !s5.before(s1)) {
                    s1 = new Date(s1.getTime() + 900000 * (num + 1));
                    return (sdf2.format(s1) + "之前过来就诊");
                }
            } else if (num <= 16) {
                String registtime = jsonObject.get("registtime").toString();
                Date s1 = sdf1.parse(registtime);
                if (s2.after(s1)) {
                    s2 = new Date(s2.getTime() + 900000 * num);
                    System.out.println(sdf.format(s2));
                    return (sdf2.format(s2) + "之前过来就诊");
                } else if (!s1.before(s2) && !new Date(s1.getTime() + 900000).after(s3)) {
                    if (now.before(new Date(s1.getTime()))) {
                        s1 = new Date(s1.getTime() + 900000);
                        return (sdf2.format(s1) + "之前过来就诊");
                    } else if (now.after(s4)) {
                        s1 = new Date(now.getTime() + 900000);
                        if (s1.after(s5)) {
                            return "医生可能即将下班，请及时就诊或退款";
                        }
                        return (sdf2.format(s1) + "之前过来就诊");
                    } else if (now.after(s3) && now.before(s4)) {
                        return (sdf2.format(s4) + "之前过来就诊");
                    } else {
                        return (sdf2.format(s4) + "之前过来就诊");
                    }
                } else if (!new Date(s1.getTime() + 900000).before(s3) && !new Date(s1.getTime() + 900000).after(s4)) {
                    if (now.before(new Date(s1.getTime()))) {
                        s1 = new Date(s1.getTime() + 900000);
                        return (sdf2.format(s1) + "之前过来就诊");
                    } else if (now.after(s4)) {
                        s1 = new Date(now.getTime() + 900000);
                        if (s1.after(s5)) {
                            return "医生可能即将下班，请及时就诊或退款";
                        }
                        return (sdf2.format(s1) + "之前过来就诊");
                    } else if (now.after(s3) && now.before(s4)) {
                        return (sdf2.format(s4) + "之前过来就诊");
                    } else {
                        return (sdf2.format(s4) + "之前过来就诊");
                    }
//                    s4 = new Date(s4.getTime() + 900000 );
//                    return (sdf2.format(s4) + "之前过来就诊");
                } else if (!s1.before(s4) && !new Date(s1.getTime() + 900000).after(s5)) {
                    if (now.before(new Date(s1.getTime()))) {
                        s1 = new Date(s1.getTime() + 900000);
                        return (sdf2.format(s1) + "之前过来就诊");
                    } else {
                        s1 = new Date(now.getTime() + 900000);
                        if (s1.after(s5)) {
                            return "医生可能即将下班，请及时就诊或退款";
                        }
                        return (sdf2.format(s1) + "之前过来就诊");
                    }
//                    s1 = new Date(s1.getTime() + 900000 );
//                    return (sdf2.format(s1) + "之前过来就诊");
                }
            } else if (num > 16 && num < 27) {
                String registtime = jsonObject.get("registtime").toString();
                Date s1 = sdf1.parse(registtime);
                if (s2.after(s1)) {
                    s4 = new Date(s4.getTime() + 900000 * (num - 17));
                    if (s4.after(now)) {
                        return (sdf2.format(s4) + "之前过来就诊");
                    } else if (s4.before(now) && s5.after(new Date(now.getTime() + 900000))) {
                        return (sdf2.format(new Date(now.getTime() + 900000)) + "之前过来就诊");
                    } else {
                        return "医生可能即将下班，请及时就诊或退款";
                    }
                } else if (!s1.before(s2) && !new Date(now.getTime() + 900000).after(s3)) {
                    now = new Date(now.getTime() + 900000);
                    return (sdf2.format(now) + "之前过来就诊");
                } else if (!now.after(s4)) {
                    s4 = new Date(s4.getTime() + 900000);
                    return (sdf2.format(s4) + "之前过来就诊");
                } else if (!now.before(s4) && !new Date(s1.getTime() + 900000).after(s5)) {
                    now = new Date(now.getTime() + 900000);
                    return (sdf2.format(now) + "之前过来就诊");
                }
            }
//            System.out.println(true);
//            String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
//            JSONObject jsonObject = JSONObject.parseObject(result);
//            num = jsonObject.get("number").hashCode();
//            Date s1;
//            if (num == 0) {
//                s1 = date;
//            } else {
//                String registtime = jsonObject.get("registtime").toString();
//                s1 = sdf1.parse(registtime);
//            }
//
//            if (s1.before(s2) && new Date(s2.getTime() + 900000 * (num + 1)).before(s3)) {
//                s2 = new Date(s2.getTime() + 900000 * (num + 1));
//                System.out.println(sdf.format(s2));
//                return (sdf2.format(s2) + "之前过来就诊");
//            } else if (s1.after(s2) && s1.before(s3)) {
//                s1 = new Date(s1.getTime() + 900000);
//                System.out.println(sdf1.format(s1));
//                return (sdf2.format(s1) + "之前过来就诊");
//            } else if (s1.after(s3) && s1.before(s4)) {
//                s4 = new Date(s4.getTime() + 900000);
//                System.out.println(sdf1.format(s4));
//                return (sdf2.format(s4) + "之前过来就诊");
//            } else if (s1.after(s3) && new Date(s1.getTime() + 900000).before(s5)) {
//                s1 = new Date(s1.getTime() + 900000);
//                System.out.println(sdf1.format(s1));
//                return (sdf2.format(s1) + "之前过来就诊");
//            } else if (s1.before(s5)) {
//                System.out.println("不准挂号");
//                return "不准挂号";
//            }
        } else {
//            String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
//            JSONObject jsonObject = JSONObject.parseObject(result);
//            int num = jsonObject.get("number").hashCode();
            if (!s3.before(new Date(s2.getTime() + 900000 * num))) {
                s2 = new Date(s2.getTime() + 900000 * num);
                System.out.println(sdf.format(s2));
                return (sdf2.format(s2) + "之前过来就诊");
            } else if (!s4.before(new Date(s3.getTime() + 900000 * (num - 17)))) {
                s4 = new Date(s4.getTime() + 900000 * (num - 17));
                System.out.println(sdf.format(s4));
                return (sdf2.format(s4) + "之前过来就诊");
            }
        }
        return "医生可能即将下班，请及时就诊或退款";
    }
}