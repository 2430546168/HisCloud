package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.entity.PageBean;
import com.yhhis.common.entity.Patients;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.PatientsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 编号3
 * 患者电子卡
 */
@Controller
@RequestMapping("/card")
public class PatientsController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;
    @Resource
    private PatientsService patientsService;

    /**
     * 绑卡操作--根据用户名name和cardno
     * 如果存在可以进行绑卡操作
     * 不存在 不能进行操作
     *
     * @param response
     * @param request
     */
    @RequestMapping(value = "/getCard", method = RequestMethod.POST)
    @ResponseBody
    public void getCard(HttpServletResponse response, HttpServletRequest request) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        Map<String, Object> map = new HashMap<String, Object>();
        String openid = request.getParameter("openid");//患者的微信id号
        String name = request.getParameter("name");//患者姓名
        String cardno = request.getParameter("cardno");//患者就诊卡号
        try {
            writer = response.getWriter();
            List<Map<String, Object>> patient = patientsService.getBindPatient(cardno, name, openid);//查询是否有当前卡号
            if (patient != null && patient.size() > 0) {
                map.put(ReturnCode.data, "1");
                map.put(ReturnCode.message, "绑卡成功");
                map.put(ReturnCode.status, "1");
            } else {
                //否者不可进行绑卡操作
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "暂无卡号,请进行建卡操作");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "绑卡出现异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:getCard。message:绑卡操作异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 查询所有电子卡--根据openid
     *
     * @param response
     * @param request
     */
    @RequestMapping(value = "/getAllCards", method = RequestMethod.POST)
    @ResponseBody
    public void getAllCards(HttpServletResponse response, HttpServletRequest request) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        Map<String, Object> map = new HashMap<String, Object>();
        String openid = request.getParameter("openid");//患者的openid
        List<Patients> patients = null;
        try {
            writer = response.getWriter();
            patients = patientsService.getAllCards(openid);//查询所有的电子卡
            if (patients != null) {
                map.put(ReturnCode.data, patients);
                map.put(ReturnCode.message, "查询电子卡成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "查询电子卡失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "查询电子卡异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:getAllCards。message:查询所有电子卡--根据openid异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 解绑操作--根据卡号cardno
     *
     * @param response
     * @param request
     */
    @RequestMapping(value = "/UntiedCard", method = RequestMethod.POST)
    @ResponseBody
    public void UntiedCard(HttpServletResponse response, HttpServletRequest request) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        Map<String, Object> map = new HashMap<String, Object>();
        String cardno = request.getParameter("cardno");
        Patients patient = new Patients();
        //卡的状态
        String status = request.getParameter("status");
        Integer st = (int) Float.parseFloat(status);
        patient.setCardno(cardno);
        patient.setStauts(st);
        try {
            writer = response.getWriter();
            int count = patientsService.UntiedCard(patient);//修改患者电子卡转态
            if (count > 0) {
                if (st == 1) {
                    //是解绑
                    map.put(ReturnCode.data, "1");
                    map.put(ReturnCode.message, "电子解绑卡成功");
                    map.put(ReturnCode.status, "1");
                } else {
                    map.put(ReturnCode.data, "1");
                    map.put(ReturnCode.message, "电子卡激活成功");
                    map.put(status, "1");
                }
                map.put(ReturnCode.data, "1");
                map.put(ReturnCode.message, "解绑电子卡成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "解绑电子卡失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "解绑电子卡异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:UntiedCard。message: 解绑操作--根据卡号cardno异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);

        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 点击预约做页面跳转
     *
     * @param request/card/getCards
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "getCards", method = RequestMethod.POST)
    public void getCards(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String openid = request.getParameter("openid");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            /**
             * 1、查询本地的电子卡表
             */
            List<Patients> patients = patientsService.getPatientsByOpenid(openid);
            if (patients.size() != 0) {
                map.put(ReturnCode.data, patients);
                map.put(ReturnCode.message, "页面跳转首页");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "页面跳转到身份证页面");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            logger.info("url:getCards。message: 点击预约做页面跳转异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }


    }

    /**
     * PC端查询患者列表
     *
     * @param request
     * @param response
     * @param page
     */
    @RequestMapping(value = "/findpatientslist", method = RequestMethod.POST)
    @ResponseBody
    public void getPCPatients(HttpServletRequest request, HttpServletResponse response, PageBean page) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            writer = response.getWriter();
            page.setCount(patientsService.getPatientsCount());
            List<Map<String, Object>> result = patientsService.getPatientsPage(page.getBegin(), page.getPageSize());
            int count = patientsService.getPatientsCount();
            // 查询总条数
            if (result != null && result.size() > 0) {
                map.put("pageCount", page.getPageCount());// 总页数
                map.put("nowPage", page.getNowPage());// 当前页
                map.put("count", count);// 当前页
                map.put(ReturnCode.data, result);
                map.put(ReturnCode.message, "患者管理列表获取成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "患者管理列表获取失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "患者管理列表获取异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:findpatientslist。message: PC端查询患者列表异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }

    }
}
