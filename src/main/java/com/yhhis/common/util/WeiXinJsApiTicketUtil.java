package com.yhhis.common.util;

import com.yhhis.common.sdk.HTTPutil;
import com.yhhis.common.sdk.JsApiTicket;
import com.yhhis.common.sdk.ProjectConst;
import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 获取 jsapi_ticket的工具类
 */
public class WeiXinJsApiTicketUtil {
    /**
     * public 获取jsapi_ticket的值
     *
     * @return jsapi_ticket
     * @throws IOException
     */
    public static String getWeixinJsapiTicket() throws IOException {
        // 读取保存ticket的properties文件
        String ticketPropertiesName = "wx.properties";
        Properties properties = new Properties();
        // 获取文件流
        InputStream is = WeiXinJsApiTicketUtil.class.getClassLoader().getResourceAsStream(ticketPropertiesName);
        try {
            properties.load(is);
            // 判断是否ticket过期
            long currentTime = System.currentTimeMillis();
            long saveTime = Long.parseLong(properties.getProperty("save_maxtime"));
            is.close();
            // 如果当前的时间大于token最大的有效时间，则进行重新获取
            if (currentTime > saveTime) {
                return getJsapiTicketWriteProperties();
            } else {
                // 返回保存的token内容
                return properties.getProperty("save_jsapi_ticket");
            }
        } catch (IOException e) {
            throw new IOException("保存jsapi_ticket的properties文件不存在");
        }
    }

    /**
     * 获取jsapi_ticket的值，并且将该值写入根目录下面的wxconfig.properties文件中
     *
     * @return jsapi_ticket
     */
    public static String getJsapiTicketWriteProperties() {
        // 1:调用获取jsapi_ticket的工具方法
        JsApiTicket jsapi_ticket = getJsapiTicket();
        // 2:将获取到的内容保存到properties文件中
        Properties properties = new Properties();
        // 存入ticket值
        properties.setProperty("save_jsapi_ticket", jsapi_ticket.getTicket());
        // 存入有效时间段(单位：秒)
        properties.setProperty("save_expiretime", String.valueOf(jsapi_ticket.getExpireIn()));
        // 存入获取的时间(单位格式:yyyy-MM-dd HH:mm:ss)
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
        properties.setProperty("save_time", retStrFormatNowDate);
        /*
         * 存入有效时间的极限值（单位：毫秒） 这里的含义是：获取的时间毫秒+7200*1000----》等价：
         * 在当前时间后的两个小时，也可以控制为7000秒，这样相对保险（所以，我这就相当于7000秒获取一次）
         */
        properties.setProperty("save_maxtime", String.valueOf(System.currentTimeMillis() + 7000 * 1000));
        // 将properties对象写入
        String ticketPropertiesName = "wx.properties";
        // 获取到路径
        URL resource = WxUtils.class.getClassLoader().getResource(ticketPropertiesName);
        try {
            // 写入内容到根目录
            FileOutputStream fileOutputStream = new FileOutputStream(new File(resource.toURI()));
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回access_token
        return jsapi_ticket.getTicket();
    }

    /**
     * 获取jsapi_ticket
     *
     * @return JsapiTicket
     */
    public static JsApiTicket getJsapiTicket() {
        JsApiTicket jsapi_ticket = new JsApiTicket();
        String accessToken = null;
        // 获取accessToken
        accessToken = WxUtils.getAccessToken();
        String url = ProjectConst.JSAPI_TICKET_URL.replace("ACCESS_TOKEN", accessToken);
        JSONObject jsonObject = HTTPutil.doGetStr(url);
        int errorCode = jsonObject.getInt("errcode");
        if (errorCode == 0) {
            jsapi_ticket.setTicket(jsonObject.getString("ticket"));
            jsapi_ticket.setExpireIn(jsonObject.getLong("expires_in"));
        } else {
            String errorMsg = jsonObject.getString("errmsg");
            System.out.println("由于" + errorCode + "错误码；错误信息为：" + errorMsg + "；导致获取access_token失败");
        }
        return jsapi_ticket;
    }
}
