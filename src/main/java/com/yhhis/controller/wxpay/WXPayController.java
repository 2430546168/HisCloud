package com.yhhis.controller.wxpay;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.entity.WxpayOrdersEntity;
import com.yhhis.common.sdk.WXPayUtil;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.common.util.Util;
import com.yhhis.service.WXPayService;
import com.yhhis.service.WxpayOrdersService;
import com.yhhis.service.impl.RedisServiceImpl;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WXPayController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;
    @Autowired
    RedisServiceImpl redisServiceImpl;
    @Resource
    private WXPayService wxPayService;
    @Autowired
    private WxpayOrdersService wxpayOrdersService;

    // 下单
    @RequestMapping("/wxnewpay")
    @ResponseBody
    public void getConfig(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String callback = request.getParameter("callback");
        PrintWriter writer = response.getWriter();
        String openid = request.getParameter("openid");
        String body = request.getParameter("body");
        String tradeno = request.getParameter("tradeno");
        int fee = (int) (Float.parseFloat(request.getParameter("fee")) * 100);
        // TODO
        if (fee == 0) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tradeno", tradeno);
            writer.print(callback + "(" + JSON.toJSONString(map) + ")");
            writer.flush();
            writer.close();
        } else {
            // 得到全部路径
            String requestUrl = request.getRequestURL().toString();
            // 得到不包含host（ip地址）的路径
            String requestUri = request.getRequestURI();
            String domain = requestUrl.replace(requestUri, "");
            String ip = Util.getIpAddr(request);

            /**
             * 统一下单的方法 支付
             */
            System.out.println(openid + "-----" + body + "---------" + fee + "---------" + domain + "---------" + ip + "---------" + tradeno);
            HashMap<String, String> paysign = wxPayService.unifiedOrder(openid, body, fee, domain, ip, tradeno);
            JSONObject res = JSONObject.fromObject(paysign);
            logger.info(res);
            System.out.println(res);
            writer.print(res);
            writer.flush();
            writer.close();
        }
    }


    /**
     * TODO 患者端 总项目收费回调
     */
    @RequestMapping("/cfpaynotify")
    @ResponseBody
    public void pcpaynotify(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        InputStream is = request.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String buffer = null;
        StringBuffer sb = new StringBuffer();
        while ((buffer = br.readLine()) != null) {
            sb.append(buffer);
        }
        Map<String, String> notify = WXPayUtil.xmlToMap(sb.toString());
        String tradeno = notify.get("out_trade_no");//订单号
        String redisFee = redisServiceImpl.get(tradeno);//返回的是价格
        String resStr = "";
        logger.debug("我是回调函数啊!---我执行了---------------------");
        if (redisFee.equals("")) {
            resStr =
                    "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
                            + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml>  ";
            writer.print(resStr);
            writer.flush();
            writer.close();
        } else {
            resStr = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                    + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml>";
            writer.print(resStr);
            writer.flush();
            writer.close();
        }
    }

    /**
     * 处方退款 提交失败退款
     * 退款状态为 4
     *
     * @param request
     * @throws Exception
     */
    @RequestMapping("/prescriptionRefund")
    @ResponseBody
    public void prescriptionRefund(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String tradeno = request.getParameter("tradeno");// 订单号
        Map<String, String> map = wxPayService.prescriptionRefund(tradeno);// 去微信查询对应的单号 没有返回null
        Map<String, Object> maps = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            ////修改当前状态为 4 已退款
            if (map != null && map.size() > 0) {
                if (map.get("return_code").equals("SUCCESS") && map.get("result_code").equals("SUCCESS") || map == null) {
                    // 退款
                    maps.put(ReturnCode.data, map);
                    maps.put(ReturnCode.message, "退款成功");
                    maps.put(ReturnCode.status, "1");

                } else {
                    maps.put(ReturnCode.data, "");
                    maps.put(ReturnCode.message, "退款失败");
                    maps.put(ReturnCode.status, "0");
                }
            } else {
                maps.put(ReturnCode.data, "");
                maps.put(ReturnCode.message, "无效订单");
                maps.put(ReturnCode.status, "0");
            }

        } catch (IOException e) {
            maps.put(ReturnCode.data, "");
            maps.put(ReturnCode.message, "退款异常");
            maps.put(ReturnCode.status, "-1");
            logger.info("处方退款：url=prescriptionRefund异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(maps));
            writer.flush();
            writer.close();
        }
    }


    /**
     * 新加
     *
     * @param response
     * @param request
     * @throws Exception
     */
    @RequestMapping("/paynotify")
    public void payNotify(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        InputStream is = request.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String buffer = null;
        StringBuffer sb = new StringBuffer();
        while ((buffer = br.readLine()) != null) {
            sb.append(buffer);
        }
        String resStr = "";
        Map<String, String> notify = WXPayUtil.xmlToMap(sb.toString());
        if (notify != null && notify.size() > 0) {
            String returnCode = notify.get("out_trade_no");
            WxpayOrdersEntity wxpayOrders = new WxpayOrdersEntity();
            wxpayOrders.setTradeno(returnCode);
            //根据订单号判断是否已支付
            WxpayOrdersEntity oneOrder = wxpayOrdersService.getOneOrder(wxpayOrders);
            if (oneOrder != null) {
                //代表已支付 和 没有发过的回调
                if (oneOrder.getStatus() == 1 && oneOrder.getNotifyurl() == 0) {
                    wxpayOrdersService.updateOrdersNotifyurl(oneOrder);//修改为已回调
                    resStr = "<xml>"
                            + "<return_code><![CDATA[SUCCESS]]></return_code>"
                            + "<return_msg><![CDATA[OK]]></return_msg>"
                            + "</xml>";
                }
            } else {
                resStr = "<xml><return_code><![CDATA[FAIL]]></return_code><return_msg><![CDATA[报文为空]]></return_msg></xml>";
            }
        }
        BufferedOutputStream out = new BufferedOutputStream(
                response.getOutputStream());
        out.write(resStr.getBytes());
        out.flush();
        out.close();
    }
}
