package com.yhhis.controller.Doctorend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.Code;
import com.yhhis.common.util.ReturnCode;
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
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("doctor")
public class DoctorLoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoctorLoginController.class);
    @Resource
    WebServices webServices;
    @Autowired
    RedisServiceImpl redisServiceImpl;

    /**
     * 医生退出  清除session 和redis  测试用
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/DoctorSignOut", method = RequestMethod.POST)
    public void DoctorSignOut(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            request.getSession().removeAttribute("doccode");//清除session
        } catch (Exception e) {
            LOGGER.info("url:DoctorSignOut。message:医生退出异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print("1");
            writer.flush();
            writer.close();
        }
    }

    /**
     * 医生登录判断session的值
     *
     * @throws IOException
     */
    @RequestMapping(value = "/getDoctorSession", method = RequestMethod.POST)
    public void getDoctorSession(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        /**
         * 1、判断Session裡面是否有code
         */
        try {
            writer = response.getWriter();
            String doctorCode = (String) request.getSession().getAttribute("doccode");
            if (doctorCode != null) {
                map.put(ReturnCode.data, doctorCode);
                map.put(ReturnCode.message, "session成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "session失敗");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            LOGGER.info("url:getDoctorSession。message:医生登录判断session的值异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 医生登录
     *
     * @param request
     * @param response
     * @throws IOException
     * @RequestParam("doccode")String doccode, @RequestParam("password")String password, @RequestParam("phone")String phone, @RequestParam("phonecode")String phonecode
     */
    @RequestMapping(value = "/doctorlogin", method = RequestMethod.POST)
    public void doctorLogin(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String doccode = request.getParameter("doccode");//医生编号
        String password = request.getParameter("password");//医生编号 新加
        String phone = request.getParameter("phone");//手机号 新加
        String phonecode = request.getParameter("phonecode");//手机验证码 新加
        CommonResult commonResult;
        PrintWriter writer = null;
        String result = "";
        try {
            writer = response.getWriter();
            Map<String, Object> map = new HashMap<>();
            //1:先判断手机号和验证码是否匹配
            String redisvalue = redisServiceImpl.get("phone_" + phone);
            if (phonecode.equals(redisvalue)) {
                result = webServices.getDoctorLogin(doccode, password, phone);
                Code code = JSON.parseObject(result, Code.class);
                if (code.getStatus() == 1) {
                    request.getSession().setAttribute("doccode", doccode);
                }
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "验证码错误!");
                map.put(ReturnCode.status, "2");
                result = JSON.toJSONString(map);
            }
        } catch (Exception e) {
            LOGGER.info("url:doctorlogin。message:医生登录异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }

    /**
     * 医生登录
     *
     * @param request
     * @param idNo        身份证号
     * @param userName    患者姓名
     * @param phoneNumber 患者手机号
     * @return
     */

    @RequestMapping(value = "/doctorlogins", method = RequestMethod.POST)
    @ResponseBody
    public String doctorlogins(HttpServletRequest request, @RequestParam String idNo, @RequestParam String userName, @RequestParam String phoneNumber) {
        String result = webServices.doctorAndPatientLoginChange(userName, phoneNumber, idNo);
        Code code = JSON.parseObject(result, Code.class);
        if (code.getStatus() == 1) {
            request.getSession().setAttribute("doccode", userName);
        }
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String doccode = request.getParameter("doccode");//医生编号
//        String password = request.getParameter("password");//医生编号 新加
//        String phone = request.getParameter("phone");//手机号 新加
//        String phonecode = request.getParameter("phonecode");//手机验证码 新加
//        PrintWriter writer = null;
//        String result="";
//        try {
//            writer = response.getWriter();
//            Map<String,Object> map=new HashMap<>();
//            //1:先判断手机号和验证码是否匹配
//            String redisvalue = redisServiceImpl.get("phone_"+phone);
//            if(phonecode.equals(redisvalue)){
//                result=webServices.getDoctorLogin(doccode,password,phone);
//                Code code=JSON.parseObject(result,Code.class);
//                if (code.getStatus()==1){
//                    request.getSession().setAttribute("doccode",doccode);
//                }
//            }else{
//                map.put(ReturnCode.data,"");
//                map.put(ReturnCode.message, "验证码错误!");
//                map.put(ReturnCode.status, "2");
//                result=JSON.toJSONString(map);
//            }
//        } catch (Exception e) {
//            logger.info("url:doctorlogin。message:医生登录异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(),e);
//        }finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }
}
