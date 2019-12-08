package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.util.QRCodeUtil;
import com.yhhis.common.util.TicketSignature;
import com.yhhis.common.util.WeiXinJsApiTicketUtil;
import com.yhhis.service.impl.RedisServiceImpl;
import com.yhhis.service.impl.WxConfig;
import net.sf.json.JSONObject;
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

@Controller
public class SweepCodeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SweepCodeController.class);
    @Autowired
    WxConfig wxconfig;
    @Autowired
    private RedisServiceImpl redisService;
    @Resource
    private WebServices webServices;

    /**
     * 扫二维码 调用摄像头
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/SweepCode", method = RequestMethod.POST)
    @ResponseBody
    public void WxConfig(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String url = request.getParameter("url");//前端传的url地址
        String ticket = WeiXinJsApiTicketUtil.getWeixinJsapiTicket();
        JSONObject sign = TicketSignature.sign(ticket, url);
//        String ticket = WxUtils.getTicket();
//        Map<String, String> sign = Sign.sign(ticket, url);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            sign.put("appId", wxconfig.getAppID());
        } catch (IOException e) {
            LOGGER.info("url:SweepCode。message:扫二维码 调用摄像头异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(sign));
            writer.flush();
            writer.close();
        }
    }

    /**
     * @throws IOException
     */
    @RequestMapping(value = "/getDoctorSourceInfo", method = RequestMethod.POST)
    @ResponseBody
    public String getDoctorSourceInfo(@RequestParam("docCode") String docCode) {
        String result = webServices.getDoctorSourceInfo(docCode);
        if (result != null) {
            return result;
        } else {
            LOGGER.debug("getDoctorSourceInfo failed:{}", result);
            return result;
        }
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String docCode = request.getParameter("docCode");//医生编码
//        String result = "";
//        try {
//            writer = response.getWriter();
//            result = webServices.getDoctorSourceInfo(docCode);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 生成二维码
     *
     * @param depCode 科室编码
     * @param depname 科室姓名
     * @param docName 医生姓名
     * @param docCode 医生编码
     */
    @RequestMapping(value = "/QRCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult QRCode(@RequestParam("depCode") String depCode, @RequestParam("depname") String depname, @RequestParam("docName") String docName, @RequestParam("docCode") String docCode) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String depCode = request.getParameter("depCode");//科室编码
//        String depname = request.getParameter("depname");//科室姓名
//        String docName = request.getParameter("docName");//医生姓名
//        String docCode = request.getParameter("docCode");//医生编码
        CommonResult commonResult;
        String imgs = redisService.get("qrcode_" + docCode);
        if (imgs == null) {
            QRCodeUtil qrCodeUtil = new QRCodeUtil();
            imgs = qrCodeUtil.getQRCode(depCode, depname, docName, docCode);
            redisService.setTime("qrcode_" + docCode, imgs, 1L * 60 * 24);//将二维码放到redis里面
            commonResult = CommonResult.success(imgs);
            LOGGER.debug("QRCode success:{}", imgs);
        } else {
            commonResult = CommonResult.success(imgs);
            LOGGER.debug("QRCode success:{}", imgs);
        }
        return commonResult;
//        try {
//            writer = response.getWriter();
//            imgs = redisService.get("qrcode_" + docCode);
//            if (imgs == null) {
//                imgs = QRCodeUtil.getQRCode(depCode, depname, docName, docCode);
//                redisService.setTime("qrcode_" + docCode, imgs, 1L * 60 * 24);//将二维码放到redis里面
//            }
//        } catch (IOException e) {
//            logger.info("url:SweepCode。message:获取医生二维码异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(imgs);
//            writer.flush();
//            writer.close();
//        }
    }
}
