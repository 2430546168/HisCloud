package com.yhhis.common.util;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WxUtils {
    private static String APP_ID = "wxf9532549ca01fa1f";
    private static String AppSecret = "3a1cda640a4800efe0da26ecdf7717e5";

    public static String getTicket() {
        String urlToken = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APP_ID + "&secret=" + AppSecret + "";
        String backToken = sendGet(urlToken, "utf-8", 60000);
        String accessToken = (String) JSONObject.fromObject(backToken).get("access_token");
        String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=" + accessToken + "&type=jsapi";
        String backTicket = sendGet(url, "utf-8", 60000);
        String ticket = (String) JSONObject.fromObject(backTicket).get("ticket");
        return ticket;
    }

    /**
     * @return
     * @title getAccessToken
     * @Description 获取访问令牌
     * @author sss
     * @Date 2018-5-18上午11:07:18
     */
    public static String getAccessToken() {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APP_ID + "&secret=" + AppSecret + "";
        String backData = sendGet(url, "utf-8", 10000);
        String accessToken = (String) JSONObject.fromObject(backData).get("access_token");
        return accessToken;
    }


    /**
     * 发送POST请求
     *
     * @param url         请求地址url
     * @param params      需要发送的请求参数字符串
     * @param connTimeout 连接超时时间（毫秒），如果为null则默认为180秒
     * @param readTimeout 读取超时时间（毫秒），如果为null则默认为180秒
     * @return 请求响应内容，如果为null则表示请求异常
     */
    public static String doPost(String url, String params, Integer connTimeout, Integer readTimeout, String contentType) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接,根据url
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", contentType == null ? "application/json" : contentType);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            connTimeout = 6000;
            readTimeout = 6000;
            // 设置请求超时时间和读取超时时间
            conn.setConnectTimeout(connTimeout == null ? 180 : connTimeout);
            conn.setReadTimeout(readTimeout == null ? 180 : readTimeout);

            // 获取URLConnection对象对应的输出流，设置utf-8编码
            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
            // 发送请求参数
            out.print(params);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应,设置utf-8编码
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line;
            while ((line = in.readLine()) != null)
                result += line;
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定的地址发送一个post请求，带着data数据
     *
     * @param url
     * @param data
     * @return by
     */
    public static String post(String url, String data) {
        try {
            URL urlObj = new URL(url);
            URLConnection connection = urlObj.openConnection();
            // 要发送数据出去，必须要设置为可发送数据状态
            connection.setDoOutput(true);
            // 获取输出流
            OutputStream os = connection.getOutputStream();
            // 写出数据
            os.write(data.getBytes());
            os.close();
            // 获取输入流
            InputStream is = connection.getInputStream();
            byte[] b = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(b)) != -1) {
                sb.append(new String(b, 0, len));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String get(String url) {
        try {
            URL urlObj = new URL(url);
            // 开连接
            URLConnection connection = urlObj.openConnection();
            InputStream is = connection.getInputStream();
            byte[] b = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(b)) != -1) {
                sb.append(new String(b, 0, len));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static JSONObject doGetJson(String url) throws Exception, IOException {
        JSONObject jsonObject = null;
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Get方式进行提交

        HttpGet httpGet = new HttpGet(url);
        //发送请求
        HttpResponse response = client.execute(httpGet);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        }
        //释放链接
        httpGet.releaseConnection();
        return jsonObject;
    }

    /**
     * @param url
     * @param charset
     * @param timeout
     * @return
     * @title sendGet
     * @Description
     * @author sss
     * @Date 2018-5-18上午11:15:33
     */
    public static String sendGet(String url, String charset, int timeout) {
        String result = "";
        try {
            URL u = new URL(url);
            try {
                URLConnection conn = u.openConnection();
                conn.connect();
                conn.setConnectTimeout(timeout);
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
                String line = "";
                while ((line = in.readLine()) != null) {
                    result = result + line;
                }
                in.close();
            } catch (IOException e) {
                return result;
            }
        } catch (MalformedURLException e) {
            return result;
        }
        return result;
    }


    /**
     * +
     * 获取关注公众号的 微信用户信息
     * 只需调用此方法
     */
    public static String userInfo(String openid) {
        String accessToken = WxUtils.getAccessToken();
        String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=" + accessToken + "&openid=" + openid + "&lang=zh_CN";
        String info = WxUtils.get(url);
        return info;
    }
}