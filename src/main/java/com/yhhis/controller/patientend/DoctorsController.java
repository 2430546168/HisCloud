package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.ReturnCode;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tempurl.NWebservice;
import org.tempurl.NWebserviceSoap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * 编号2 医生排班
 *
 * @author 小贵
 */
@Controller
@RequestMapping("/doctors")
public class DoctorsController {
    protected Logger logger = Logger.getLogger(this.getClass());

    @Resource
    WebServices webServices;

    /**
     * 获取医生的个人详情信息
     *
     * @param request
     * @param response
     * @
     */
    @RequestMapping(value = "/getdoctor", method = RequestMethod.POST)
    @ResponseBody
    public void getDoctor(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        String result = "";
        try {
            writer = response.getWriter();
            String doccode = request.getParameter("doccode");
            result = webServices.getDoctorInfo(doccode);
        } catch (Exception e) {
            logger.info("url:getdoctor。message:获取医生的个人详情信息异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }

    /**
     * 修改医生个人信息
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/updateDoctorInfo", method = RequestMethod.POST)
    @ResponseBody
    public void updateDoctorInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String expertjob = request.getParameter("expertjob");
        String doctorno = request.getParameter("doctorno");
        PrintWriter writer = response.getWriter();
        String result = webServices.updateDoctorInfo(expertjob, doctorno);
        writer.print(result);
        writer.flush();
        writer.close();
    }

    // 获取医生编码和名称 根据卡号 当前时间 状态为5（开检查开化验和开处方的状态） 或 1（已付款挂号订单）
    @RequestMapping(value = "/getDoctorInfo", method = RequestMethod.POST)
    @ResponseBody
    public void getDoctorInfo(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String cardno = request.getParameter("cardno");
        String result = "";
        PrintWriter writer = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            writer = response.getWriter();
            result = webServices.findfailureDoctor(cardno);
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "获取医生编码和名称异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:getDoctorInfo。message:获取医生编码和名称 根据卡号 当前时间异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }

    /**
     * 医生排班信息
     * TODO
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/getDocSche", method = RequestMethod.POST)
    @ResponseBody
    public void getDocSche(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String departid = request.getParameter("departid");
        PrintWriter writer = null;
        String result = "";
        try {
            writer = response.getWriter();
            /**
             * 查询科室对应的医生
             */
            NWebserviceSoap Bing = new NWebservice().getNWebserviceSoap();
            String str = Bing.getregdoctlist("<Request>　\n" + "  <TypeID></TypeID>\n" + "<DeptID>" + departid
                    + "</DeptID>\n" + "  <UserID></UserID>\n" + "</Request>\n");
            // 将XML转化json对象
            JSONObject xmlJSONObj = XML.toJSONObject(str);
            result = xmlJSONObj.toString(4);
            com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(result);
        } catch (Exception e) {
            logger.info("url:getDocSche。message:医生排班信息异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }

    /**
     * 医生7天排班信息
     */
    @RequestMapping(value = "/getDocSches", method = RequestMethod.POST)
    @ResponseBody
    public String getDocSches(@RequestParam("doccode") String doccode, @RequestParam("departid") String departid) {
        String result = webServices.getAppointmentRegistInfo(doccode, departid);
        return result;
    }
}
