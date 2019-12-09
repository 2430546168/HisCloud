package com.yhhis.controller.Doctor;

import com.his.server.Prescription;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.wxSDK.pojo.TemplateData;
import com.yhhis.common.wxSDK.pojo.TemplateMessage;
import com.yhhis.service.impl.WxConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("prescription")
public class PrescribingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrescribingController.class);
    @Resource
    WebServices webServices;

    /**
     * 获取中药组合处方
     *
     * @param departcode 科室编码
     * @param doctorno   医生编码
     */
    @RequestMapping(value = "/getMakeUpPrescribe", method = RequestMethod.POST)
    @ResponseBody
    public String getMakeUpPrescribe(@RequestParam("departcode") String departcode, @RequestParam("doctorno") String doctorno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String departcode = request.getParameter("departcode");//科室编码
//            String doctorno = request.getParameter("doctorno");//医生编码
        String result = webServices.getMakeUpPrescribe(departcode, doctorno);
//        } catch (Exception e) {
//            logger.info("url:getMakeUpPrescribe。message:获取中药组合处方 异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 获取中药处方对应的药品
     *
     * @param procjectid 处方编码
     * @param doctorno   医生编码
     */

    @RequestMapping(value = "/getChineseMedicine", method = RequestMethod.POST)
    @ResponseBody
    public String getChineseMedicine(@RequestParam("procjectid") String procjectid, @RequestParam("doctorno") String doctorno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String procjectid = request.getParameter("procjectid");//处方编码
//            String doctorno = request.getParameter("doctorno");//医生编码
        String result = webServices.getChineseMedicine(procjectid, doctorno);
//        } catch (Exception e) {
//            logger.info("url:getChineseMedicine。message:获取中药处方对应的药品异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }


    /**
     * 查询未缴费的药品处方记录
     *
     * @param cardno    患者卡号
     * @param orderedby
     * @param doctorno
     */
    @RequestMapping(value = "/getBeforeOneDrugNoPay", method = RequestMethod.POST)
    @ResponseBody
    public String getBeforeOneDrugNoPay(@RequestParam("cardno") String cardno, @RequestParam("orderedby") String orderedby, @RequestParam("doctorno") String doctorno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String cardno = request.getParameter("cardno");
//            String orderedby = request.getParameter("orderedby");
//            String doctorno = request.getParameter("doctorno");
        String result = webServices.getBeforeOneDrugNoPay(orderedby, doctorno, cardno);
//        } catch (Exception e) {
//            logger.info("url:getBeforeOneDrugNoPay。message:查询未缴费的药品处方记录异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 医生删除患者未付费的处方
     *
     * @return
     * @RequestParam("orderclass") String orderclass, @RequestParam("cardno") String cardno, @RequestParam("visitdate") String visitdate, @RequestParam("visitno") String visitno, @RequestParam("serialno") String serialno, @RequestParam("docname") String docname, @RequestParam("doccode") String doccode, @RequestParam("clinicno") String clinicno
     */
    @RequestMapping(value = "delPrescribing", method = RequestMethod.POST)
    @ResponseBody
    public String delPrescribing(@RequestBody Prescription prescription) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String orderclass = request.getParameter("orderclass");// A西药 B中药 A
//            String patientid = request.getParameter("cardno");// 患者卡号 01906034
//            String visitdate = request.getParameter("visitdate");// 就诊日期 2019-07-17
//            String visitno = request.getParameter("visitno");// 就诊序号 48586
//            String serialno = request.getParameter("serialno");// 流水号 5046525
//            String doctor = request.getParameter("docname");// 医生姓名 曲博
//            String doctorno = request.getParameter("doccode");// 医生编号 0000QB
//            String clinicno = request.getParameter("clinicno");// 门诊号 2019071748586
        //orderclass, cardno, visitdate, visitno, serialno, docname, doccode, clinicno TODO
        String result = webServices.delPrescribing(prescription);
        return result;
    }

    /**
     * 获取中药
     *
     * @return
     */
    @RequestMapping(value = "/chinesemedicine", method = RequestMethod.POST)
    @ResponseBody
    public String ChineseMedicine() {
        String result = webServices.getValue();
        return result;
    }

    /**
     * 获取药品规格
     *
     * @param itemcode 药品规格
     * @param itemspec
     */

    @RequestMapping(value = "/specification", method = RequestMethod.POST)
    @ResponseBody
    public String Specification(@RequestParam("itemcode") String itemcode, @RequestParam("itemspec") String itemspec) {
        String result = webServices.getDrug(itemcode, itemspec);
        return result;
    }

    /**
     * 获取西药
     */
    @RequestMapping(value = "/westernmedicine", method = RequestMethod.POST)
    @ResponseBody
    public String WesternMedicine() {
        String result = webServices.getWestern();
        return result;
    }

    /**
     * 获取门诊医生的 使用频次信息
     *
     * @return
     */
    @RequestMapping(value = "/frequency", method = RequestMethod.POST)
    @ResponseBody
    public String Frequency() {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
        String result = webServices.getDrugDosage();
//        } catch (Exception e) {
//            logger.info("url:frequency。message:获取门诊医生的 使用频次信息异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 药品的 用药途径
     *
     * @return
     */
    @RequestMapping(value = "/channel", method = RequestMethod.POST)
    @ResponseBody
    public String Channel() {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
        String result = webServices.getDrugUsage();
//        } catch (Exception e) {
//            logger.info("url:channel。message:药品的 用药途径异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 通过医生编号获取 付款未就诊的患者信息
     * 医生对应所有下面的患者 包括开药方
     * @param request
     * @param response
     */
    /*
     * @RequestMapping(value = "/getpatientbydoccode", method = RequestMethod.POST)
     * public void Getpatientbydoccode(HttpServletRequest request,
     * HttpServletResponse response) { response.setCharacterEncoding("UTF-8");
     * response.setContentType("text/html;charset=UTF-8"); // 医生编号 String doccode =
     * request.getParameter("doccode"); Map<String, Object> map = new
     * HashMap<String, Object>(); List<Map<String, Object>> list = null; PrintWriter
     * writer = null; try { writer = response.getWriter(); list =
     * wxPlayOrderEntityService.getPatientInfoByDocCode(doccode); if (list != null
     * && list.size() > 0) { map.put(ReturnCode.data, list);
     * map.put(ReturnCode.message, "查询支付待就诊患者信息成功！"); map.put(ReturnCode.status,
     * "1"); } else { map.put(ReturnCode.data, ""); map.put(ReturnCode.message,
     * "暂无患者信息！"); map.put(ReturnCode.status, "0"); } } catch (Exception e) {
     * map.put(ReturnCode.data, ""); map.put(ReturnCode.message, "查询支付待就诊患者信息异常！");
     * map.put(ReturnCode.status, "-1"); logger.
     * info("url:getpatientbydoccode。message:通过医生编号获取 付款未就诊的患者信息异常。===请到日志中查询异常信息。==="
     * ); logger.error(e.getMessage(),e); } finally {
     * writer.print(JSON.toJSONString(map)); writer.flush(); writer.close(); } }
     */


    /**
     * 开处方
     * <p>
     * //     * @param outs
     * //     * @param starttime 挂号订单时间
     * //     * @param visitno   就诊序号
     * //     * @param clinicno  门诊号
     * //     * @param openid
     * //     * @param cardno    患者卡号
     * //     * @param orderby   就诊科室
     * //     * @param depname   科室名称
     * //     * @param docname   医生名称
     * //     * @param doccode   医生编码
     * //     * @param itemclass 项目类别
     * TODO 开处方未完成
     */
    @RequestMapping(value = "prescribe", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult prescribe(@RequestBody Prescription prescription, @RequestParam("openid") String openid, @RequestParam("starttime") String starttime) {
        CommonResult commonResult;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(starttime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String orderdate2 = df2.format(date);// 订单时间
        String orderdate = df.format(new Date());// 开单时间 当前时间
        prescription.setVisitdate(orderdate);
        prescription.setVisitdate2(orderdate2);
        String serialNo = webServices.addPrescription(prescription);
        //返回不为0时成功 否则然会流水号
        if (!serialNo.equals("0")) {
//            map.put(ReturnCode.data, "");
//                    map.put(ReturnCode.message, "开处方成功。");
//                    map.put(ReturnCode.status, "1");
//                    if (!openid.equals("0")) {
//                        WxTemplate.sendprescriptionTemplate(openid, depname, docname, orderdate, serialNo);
            TemplateMessage templateMessage = new TemplateMessage();
            List<TemplateData> paras = new ArrayList<TemplateData>();
            paras.add(new TemplateData("first", "您的处方已经开具！", "#000000"));
            paras.add(new TemplateData("keyword1", "滦平妇幼保健医院", "#000000"));
            paras.add(new TemplateData("keyword2", prescription.getOrderby(), "#000000"));
            paras.add(new TemplateData("keyword3", prescription.getDoctor(), "#000000"));
            paras.add(new TemplateData("keyword4", prescription.getVisitdate(), "#000000"));
            paras.add(new TemplateData("keyword5", prescription.getSerialno(), "#000000"));
            paras.add(new TemplateData("remark", "感谢您的使用", "#000000"));
            templateMessage.setOpenid(openid);
            templateMessage.setTemplateId(WxConfig.PRESCRIPTION_SUCCESS_ID);
            templateMessage.setData(paras);
            commonResult = CommonResult.success("开处方成功");
            LOGGER.debug("prescribe success:{}", prescription);
        } else {
            commonResult = CommonResult.failed("开处方失败");
            LOGGER.debug("prescribe failed:{}", prescription);
        }
        return commonResult;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String outss = request.getParameter("outs");
//        String starttime = request.getParameter("starttime");// 挂号订单时间
//        String visitno = request.getParameter("visitno");//////// 就诊序号
//        String clinicno = request.getParameter("clinicno");//////// 门诊号
//        Map<String, Object> map = new HashMap<String, Object>();
//        String openid = request.getParameter("openid");// 患者openid 需要查询获取
//        String cardno = request.getParameter("cardno");// 患者卡号
//        String orderby = request.getParameter("orderby");// 就诊的科室 10010502
//        String depname = request.getParameter("depname");// 科室名称
//        String docname = request.getParameter("docname");// 医生名称
//        String doccode = request.getParameter("doccode");// 医生编码
//        String itemclass = request.getParameter("itemclass");// 项目类别 A是西药 B 中药
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
//        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
//        PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(starttime);
//            String orderdate2 = df2.format(date);// 订单时间
//            String orderdate = df.format(new Date());// 开单时间 当前时间
//            String serialNo = webServices.addPrescription(cardno, orderdate, visitno, orderby, docname, clinicno, doccode, outss, itemclass, orderdate2);
//            //返回不为0时成功 否则然会流水号
//            if (!serialNo.equals("0")) {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "开处方成功。");
//                map.put(ReturnCode.status, "1");
//                if (!openid.equals("0")) {
//                    WxTemplate.sendprescriptionTemplate(openid, depname, docname, orderdate, serialNo);
//                }
//            } else {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "开处方失！");
//                map.put(ReturnCode.status, "0");
//            }
//        } catch (Exception e) {
//            LOGGER.info("url:prescribe。message:开处方异常。===请到日志中查询异常信息。===");
//            LOGGER.error(e.getMessage(), e);
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "开处方异常！");
//            map.put(ReturnCode.status, "-1");
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
    }
}