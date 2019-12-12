package com.yhhis.controller.Doctorend;

import com.his.server.PatientCheck;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.Patients;
import com.yhhis.controller.wxpay.WxTemplate;
import com.yhhis.service.PatientsService;
import com.yhhis.service.impl.RedisServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("check")
public class CheckController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckController.class);

    @Autowired
    private RedisServiceImpl redisService;
    @Resource
    private WebServices webServices;
    @Autowired
    private PatientsService patientsService;

    /**
     * 根据卡号查询openid
     *
     * @param cardno 患者卡号
     * @return
     */
    @RequestMapping(value = "/getOpenid", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getOpenid(@RequestParam(value = "cardno", required = false) String cardno) {
        CommonResult commonResult;
        Patients patients = patientsService.getOpenid(cardno);
        if (patients != null) {
            commonResult = CommonResult.success(patients);
            LOGGER.debug("getOpenid success:{}", patients);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("getOpenid failed:{}", patients);
        }
        return commonResult;
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		Map<String, Object> map = new HashMap<String, Object>();
//		PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
//            String cardno = request.getParameter("cardno");
//            Patients openid = patientsService.getOpenid(cardno);
//            if (openid != null) {
//                map.put(ReturnCode.data, openid.getOpenid());
//                map.put(ReturnCode.message, "获取openid成功。");
//                map.put(ReturnCode.status, "1");
//            } else {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "暂无openid。");
//                map.put(ReturnCode.status, "0");
//            }
//        } catch (Exception e) {
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "获取openid异常。");
//            map.put(ReturnCode.status, "-1");
//            logger.info("url:getOpenid。message:根据卡号查询openid异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 未交费 查询患者检查的记录
     */
    @RequestMapping(value = "/getBeforeOneCheckNoPay", method = RequestMethod.POST)
    @ResponseBody
    public String getBeforeOneCheckNoPay(@RequestParam(value = "cardno") String cardno, @RequestParam(value = "reqdeptcode") String reqdeptcode, @RequestParam(value = "doctorcode") String doctorcode) {
        String result = webServices.getBeforeOneCheckNoPay(cardno, reqdeptcode, doctorcode);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String cardno = request.getParameter("cardno");
//        String reqdeptcode = request.getParameter("reqdeptcode");
//        String doctorcode = request.getParameter("doctorcode");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            result = webServices.getBeforeOneCheckNoPay(cardno, reqdeptcode, doctorcode);
//        } catch (Exception e) {
//            LOGGER.info("url:getBeforeOneCheckNoPay。message:未交费 查询患者检查的记录异常。===请到日志中查询异常信息。===");
//            LOGGER.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 删除检查项目 delPrescription
     *
     * @RequestParam("serialno") String serialno, @RequestParam("cardno") String cardno, @RequestParam("reqdept") String reqdept, @RequestParam("reqphysician") String reqphysician, @RequestParam("doctoruser") String doctoruser, @RequestParam("visitno") String visitno, @RequestParam("visitdate") String visitdate, @RequestParam("clinicno") String clinicno
     */
    @RequestMapping(value = "delCheckItem", method = RequestMethod.POST)
    @ResponseBody
    public String delCheckItem(@RequestBody PatientCheck patientcheck) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String serial_no = request.getParameter("serialno");
//        String cardno = request.getParameter("cardno");
//        String reqdept = request.getParameter("reqdept");
//        String reqphysician = request.getParameter("reqphysician");
//        String doctoruser = request.getParameter("doctoruser");
//        String visitno = request.getParameter("visitno");
//        String visitdate = request.getParameter("visitdate");
//        String clinicno = request.getParameter("clinicno");
//        PrintWriter writer = response.getWriter();
//        writer.print(webServices.delCheckItem(serial_no, cardno, reqdept, reqphysician, doctoruser, visitno, visitdate,
//                clinicno));
//        writer.flush();serialno, cardno, reqdept, reqphysician, doctoruser, visitno, visitdate, clinicno
//        writer.close();
        String result = webServices.delCheckItem(patientcheck);
        return result;
    }

    /**
     * 检查结果接口
     *
     * @param cardno    患者卡号
     * @param reportime
     * @return
     */
    @RequestMapping(value = "getCheckResult", method = RequestMethod.POST)
    @ResponseBody
    public String getCheckResult(@RequestParam("cardno") String cardno, @RequestParam("reportime") String reportime, @RequestParam("size") int size) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String cardno = request.getParameter("cardno");
//        String reportime = request.getParameter("reportime");
//        PrintWriter writer = response.getWriter();
//        writer.print(webServices.getCheckResult(cardno, reportime));
//        writer.flush();
//        writer.close();
        String result = webServices.getCheckResult(cardno, reportime, size);
        return result;
    }

    /**
     * 临床诊断
     *
     * @param cardno    患者卡号
     * @param visitdate 就诊时间
     * @param doctorno  医生编码
     */
    @RequestMapping(value = "/getOutpMrDiagDesc", method = RequestMethod.POST)
    @ResponseBody
    public String getOutpMrDiagDesc(@RequestParam("cardno") String cardno, @RequestParam("visitdate") String visitdate, @RequestParam("doctorno") String doctorno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        String cardno = request.getParameter("cardno");// 患者卡号
//        String visitdate = request.getParameter("visitdate");// 就诊日期
//        String doctorno = request.getParameter("doctorno");// 医生编号
//        writer.print(webServices.getOutpMrDiagDesc(cardno, visitdate, doctorno));
//        writer.flush();
//        writer.close();
        String result = webServices.getOutpMrDiagDesc(cardno, visitdate, doctorno);
        return result;
    }

    /**
     * 检查类别
     * TODO
     */
    @RequestMapping(value = "/getcheckclass", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getCheckClass() {
        String result = redisService.get("checkClass");
        CommonResult commonResult = CommonResult.success(result);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        writer.print(redisService.get("checkClass"));
//        writer.flush();
//        writer.close();
        return commonResult;
    }

    /**
     * 获取执行科室名称
     *
     * @param deptcode 科室编码
     * @return
     */
    @RequestMapping(value = "/getdeptname", method = RequestMethod.POST)
    @ResponseBody
    public String getDeptName(@RequestParam("deptcode") String deptcode) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        String deptcode = request.getParameter("deptcode");// 科室编号
//        writer.print(webServices.getDeptName(deptcode));
//        writer.flush();
//        writer.close();
        String result = webServices.getDeptName(deptcode);
        return result;
    }

    /**
     * 根据类别查执行科室和检查子类
     *
     * @param classname 子类类别
     * @return
     */
    @RequestMapping(value = "/getsubclass", method = RequestMethod.POST)
    @ResponseBody
    public String getSubclass(@RequestParam("classname") String classname) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        // 根据检查类别名称查找子类
//        String classname = request.getParameter("classname");// 根据名字查询子类
//        writer.print(webServices.getSubclass(classname));
//        writer.flush();
//        writer.close();
        String result = webServices.getSubclass(classname);
        return result;
    }

    /**
     * 根据检查类别名称和检查子类名称查找项目名称
     *
     * @param examclassname    检查类别名称
     * @param examsubclassname
     */
    @RequestMapping(value = "/getcheckthreeclass", method = RequestMethod.POST)
    @ResponseBody
    public String getEntryname(@RequestParam("examclassname") String examclassname, @RequestParam("examsubclassname") String examsubclassname) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        // 根据检查类别名称和检查子类名称查找项目名称
//        String examclass = request.getParameter("examclassname");// 检查类别名称
//        String examsubclass = request.getParameter("examsubclassname");// 检查类别名称
//        writer.print(webServices.getEntryname(examclass, examsubclass));
//        writer.flush();
//        writer.close();
        String result = webServices.getEntryname(examclassname, examsubclassname);
        return result;
    }

    /**
     * 开检查
     * TODO
     *
     * @param position  地址
     * @param username  患者姓名
     * @param items     子项目名称
     * @param openid    微信openid
     * @param checkdata
     * @param visitdate 就诊日期
     */
    @RequestMapping(value = "/patientcheckup", method = RequestMethod.POST)
    @ResponseBody
    public String checkup(@RequestParam("position") String position, @RequestParam("username") String username, @RequestParam("items") String items, @RequestParam("openid") String openid, @RequestParam("checkdata") String checkdata, @RequestParam("visitdate") String visitdate) {
        String remarkText = "请您到" + position + "检查科检查。";
        String firstText = "您的检查已经开具！";
        JSONArray array = JSONArray.fromObject(checkdata);
        List<PatientCheck> list = (List<PatientCheck>) JSONArray.toList(array, new PatientCheck(), new JsonConfig());
        String result = webServices.openPrescription(visitdate, "自费", list);
        WxTemplate.sendCheckTemplate(username, visitdate, items, result, openid, remarkText, firstText);
        return "";
    }
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        Map<String, Object> map = new HashMap<String, Object>();
//        String position = request.getParameter("position");// 地址
//
//        String username = request.getParameter("username");// 患者姓名
//        String items = request.getParameter("items");// 子项目名称
//        String openid = request.getParameter("openid");//
//
//        ///////////// 模板通知信息 结束///////////////
//        String checkdata = request.getParameter("checkdata");
//        String visitdate = request.getParameter("visitdate");
//        JSONArray array = null;
//        List<PatientCheck> list = null;
//        PrintWriter writer = null;
//        String resultserialno = "";
//        try {
//            writer = response.getWriter();
//            if (checkdata != "" && checkdata != null) {
//                array = JSONArray.fromObject(checkdata);
//                list = (List<PatientCheck>) JSONArray.toList(array, new PatientCheck(), new JsonConfig());
//                resultserialno = webServices.openPrescription(visitdate, "自费", list);
//                if (!resultserialno.equals("0")) {
//                    // 开检查成功发送模板 orderby就诊科室
//                    map.put(ReturnCode.data, "");
//                    map.put(ReturnCode.message, "开检查成功。");
//                    map.put(ReturnCode.status, "1");
//                    if (!openid.equals("0")) {
//                        WxTemplate.sendCheckTemplate(username, visitdate, items, resultserialno, openid, remarkText,firstText);
//                    }
//                } else {
//                    map.put(ReturnCode.data, "");
//                    map.put(ReturnCode.message, "开检查失败！");
//                    map.put(ReturnCode.status, "0");
//                }
//            }
//        } catch (IOException e) {
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "开检查异常！");
//            map.put(ReturnCode.status, "-1");
//            e.printStackTrace();
//            LOGGER.info("url:patientcheckup。message:开检查异常异常。===请到日志中查询异常信息。===");
//            LOGGER.error(e.getMessage(), e);
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
//    }
}
