package com.yhhis.common.util;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.PropertyResourceBundle;
import java.util.UUID;

@WebServlet("/getTicketSignature.do")
public class TicketSignature extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public static JSONObject sign(String jsapi_ticket, String url) {
        JSONObject ret = new JSONObject();
        String nonce_str = create_nonce_str();
        String timestamp = create_timestamp();
        String string1;
        String signature = "";

        // 注意这里参数名必须全部小写，且必须有序
        string1 = "jsapi_ticket=" + jsapi_ticket + "&noncestr=" + nonce_str + "&timestamp=" + timestamp + "&url=" + url;
        System.out.println(string1);

        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes(StandardCharsets.UTF_8)); // 对string1 字符串进行SHA-1加密处理
            signature = byteToHex(crypt.digest()); // 对加密后字符串转成16进制
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);

        return ret;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    // 生成随机字符串
    private static String create_nonce_str() {
        return UUID.randomUUID().toString();
    }

    // 生成时间戳字符串
    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String jsapi_ticket = WeiXinJsApiTicketUtil.getWeixinJsapiTicket();
        String url = req.getParameter("htmlUrl");
        JSONObject ret = sign(jsapi_ticket, url);
        PropertyResourceBundle res = (PropertyResourceBundle) PropertyResourceBundle.getBundle("wx.properties");
        String appId = res.getString("PROJECT_APPID");
        ret.put("appId", appId);
        PrintWriter out = resp.getWriter();
        out.print(ret);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doGet(req, resp);
    }
}
