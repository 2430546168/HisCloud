package com.yhhis.controller.Doctorend;

import com.his.server.Medicalrecord;
import com.his.server.WebServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("medicalrecord")
public class MedicalRecordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MedicalRecordController.class);
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    WebServices webServices;

    /**
     * 查询患者病史
     *
     * @param cardno 患者卡号
     * @return
     */
    @RequestMapping(value = "/MegetMedicalLast", method = RequestMethod.POST)
    @ResponseBody
    public String MegetMedicalLast(@RequestParam("cardno") String cardno) {
        String result = webServices.getMedicalLast(cardno);
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String cardno = request.getParameter("cardno");// 患者卡号
//            result = webServices.getMedicalLast(cardno);
//        } catch (Exception e) {
//            logger.info("url:MegetMedicalLast。message:查询患者病史异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 查询当天所有病历 --患者端
     *
     * @param patientid 患者卡号
     * @param visitdate 就诊日期
     */
    @RequestMapping(value = "/getTheSameDayMedicalrecordAll", method = RequestMethod.POST)
    @ResponseBody
    public String getTheSameDayMedicalrecordAll(@RequestParam("patientid") String patientid, @RequestParam("visitdate") String visitdate) {
        String result = webServices.getTheSameDayMedicalrecordAll(patientid, visitdate);
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String patientid = request.getParameter("patientid");// 患者卡号
//        String visitdate = request.getParameter("visitdate");// 就诊日期
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            result = webServices.getTheSameDayMedicalrecordAll(patientid, visitdate);
//        } catch (Exception e) {
//            logger.info("url:getTheSameDayMedicalrecordAll。message:查询当前所有病历--患者端异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 查询当前病历--医生端
     *
     * @param patientid 患者卡号
     * @param visitdate 就诊日期
     * @param doccode   医生卡号
     * @param visitno   就诊序号
     */
    @RequestMapping(value = "/getthesamedayoutpmr", method = RequestMethod.POST)
    @ResponseBody
    public String getTheSameDayOutpMr(@RequestParam("patientid") String patientid, @RequestParam("visitdate") String visitdate, @RequestParam("doccode") String doccode, @RequestParam("visitno") String visitno) {
        String result = webServices.getTheSameDayOutpMr(patientid, visitdate, doccode, visitno);
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String patientid = request.getParameter("patientid");// 患者卡号
//        String visitdate = request.getParameter("visitdate");// 就诊日期
//        String doccode = request.getParameter("doccode");// 医生编号
//        String visitno = request.getParameter("visitno");// 就诊序号
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            result = webServices.getTheSameDayOutpMr(patientid, visitdate, doccode, visitno);
//        } catch (Exception e) {
//            logger.info("url:getthesamedayoutpmr。message:查询当前病历--医生端异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 获取病历 所有信息
     *
     * @param patientid 患者卡号
     * @param visitdate 就诊时间
     */
    @RequestMapping(value = "/getmedicalrecord", method = RequestMethod.POST)
    @ResponseBody
    public String getmedicalrecord(@RequestParam("patientid") String patientid, @RequestParam("visitdate") String visitdate, @PathParam("size") int size) {
        String result = webServices.getMedicalrecordAll(patientid, visitdate, size);
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String patientid = request.getParameter("patientid");
//        String vistdate = request.getParameter("visitdate");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            result = webServices.getMedicalrecordAll(patientid, vistdate);
//        } catch (Exception e) {
//            logger.info("url:getmedicalrecord。message:获取病历 所有信息异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 开病历
     * TODO
     *
     * @param medicalrecord
     * @return
     */
    @RequestMapping(value = "/insertmedicalrecord", method = RequestMethod.POST)
    @ResponseBody
    // @OnMessage
    public String insertmedicalrecord(@RequestBody Medicalrecord medicalrecord) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
        String result = webServices.insertMedicalrecord(medicalrecord);
        return result;
//        } catch (Exception e) {
//            LOGGER.info("url:insertmedicalrecord。message:开病历异常。===请到日志中查询异常信息。===");
//            LOGGER.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 修改病历
     * TODO
     *
     * @param medicalrecord 病历对象
     */
    @RequestMapping(value = "/updatemedicalrecord", method = RequestMethod.POST)
    @ResponseBody
    public String updatemedicalrecord(@RequestBody Medicalrecord medicalrecord) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
        String result = webServices.updateMedicalrecord(medicalrecord);
//        } catch (Exception e) {
//            LOGGER.info("url:updatemedicalrecord。message:修改病历异常。===请到日志中查询异常信息。===");
//            LOGGER.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }
}
