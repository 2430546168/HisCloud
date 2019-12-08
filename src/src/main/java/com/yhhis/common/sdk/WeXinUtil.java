package com.yhhis.common.sdk;

import java.io.IOException;
import java.net.URLDecoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;


public class WeXinUtil {

    public static JSONObject httpRequest(String url, String jsonParam, boolean noNeedResponse) {
        //post请求返回结果
        DefaultHttpClient httpClient = new DefaultHttpClient();
//		HttpClient httpClient = new HttpClient();
        JSONObject jsonResult = null;
        HttpGet method = new HttpGet(url);
        try {
            /*
             * if (null != jsonParam) { //解决中文乱码问题 StringEntity entity = new
             * StringEntity(jsonParam.toString(), "utf-8");
             * entity.setContentEncoding("UTF-8");
             * entity.setContentType("application/json"); ((HttpResponse)
             * method).setEntity(entity); }
             */
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /** 请求发送成功，并得到响应 **/
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /** 读取服务器返回过来的json字符串数据 **/
                    str = EntityUtils.toString(result.getEntity());
//					if (noNeedResponse)
//					{
//						return null;
//					}
                    /** 把json字符串转换成json对象 **/
                    jsonResult = JSONObject.fromObject(str);

                } catch (Exception e) {
                    System.out.println("get请求失败.....");
                }
            }
        } catch (IOException e) {
            System.out.println("get请求失败.....");
        }

        return jsonResult;
    }


}
