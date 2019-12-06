package com.yhhis.common.util;

import com.yhhis.common.entity.UserDome;
import net.sf.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 身份证查询调用示例代码 － 聚合数据 在线接口文档：http://www.juhe.cn/docs/38
 **/
public class CardUtil {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static final String url = "http://apis.juhe.cn/idcard/index";// 请求接口地址
    // 配置您申请的KEY
    public static final String APPKEY = "66277f7dae50ac09c5689fd1b83ec5a9";
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

    // 1.身份证信息查询
    public static UserDome getRequest(String idno) {
        String result = null;
        // String url ="http://apis.juhe.cn/idcard/index";//请求接口地址
        Map<String, Object> params = new HashMap<String, Object>();// 请求参数
        params.put("cardno", idno);// 身份证号码
        params.put("dtype", "");// 返回数据格式：json或xml,默认json
        params.put("key", APPKEY);// 你申请的key

        try {
            result = net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if (object.getInt("error_code") == 0) {
                Object bean = JSONObject.toBean((JSONObject) object.get("result"), UserDome.class);
                UserDome info = (UserDome) bean;
                String birthday = info.getBirthday();
                String replace = birthday.replace("年", "-").replace("月", "-").replace("日", "");
                info.setBirthday(replace);
                return info;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    // 1.身份证信息查询
    public static void getRequest1() {
        String result = null;
        // String url ="http://apis.juhe.cn/idcard/index";//请求接口地址
        Map<String, Object> params = new HashMap<String, Object>();// 请求参数
        params.put("cardno", "410882198902135010");// 身份证号码
        params.put("dtype", "");// 返回数据格式：json或xml,默认json
        params.put("key", APPKEY);// 你申请的key

        try {
            result = net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if (object.getInt("error_code") == 0) {
                System.out.println(object.get("result"));
            } else {
                System.out.println(object.get("error_code") + ":" + object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2.身份证泄漏查询
    public static void getRequest2() {
        String result = null;
        String url = "http://apis.juhe.cn/idcard/leak";// 请求接口地址
        Map<String, Object> params = new HashMap<String, Object>();// 请求参数
        params.put("cardno", "");// 身份证号码
        params.put("dtype", "");// 返回数据格式：json或xml,默认json
        params.put("key", APPKEY);// 你申请的key

        try {
            result = net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if (object.getInt("error_code") == 0) {
                System.out.println(object.get("result"));
            } else {
                System.out.println(object.get("error_code") + ":" + object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3.身份证挂失查询
    public static void getRequest3() {
        String result = null;
        String url = "http://apis.juhe.cn/idcard/loss";// 请求接口地址
        Map<String, Object> params = new HashMap<String, Object>();// 请求参数
        params.put("cardno", "");// 身份证号码
        params.put("dtype", "");// 返回数据格式：json或xml,默认json
        params.put("key", APPKEY);// 你申请的key
        try {
            result = net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if (object.getInt("error_code") == 0) {
                System.out.println(object.get("result"));
            } else {
                System.out.println(object.get("error_code") + ":" + object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return 网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map<String, Object> params, String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if (method == null || method.equals("GET")) {
                strUrl = strUrl + "?" + urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if (method == null || method.equals("GET")) {
                conn.setRequestMethod("GET");
            } else {
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params != null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
                } catch (Exception e) {
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }

    // 将map型转为请求参数型
    public static String urlencode(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder();
        for (Iterator<Entry<String, Object>> iterator = data.entrySet().iterator(); iterator.hasNext(); ) {
            Entry<String, Object> i = iterator.next();
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
