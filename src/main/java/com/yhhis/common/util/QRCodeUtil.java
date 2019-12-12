package com.yhhis.common.util;

import com.yhhis.service.impl.WxConfig;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 生成二维码
 *
 * @author 小贵
 */
public class QRCodeUtil {
    @Autowired
    WxConfig wxConfig;

    public String getQRCode(String depCode, String depname, String docName, String docCode) {
        String host = "http://qrservice.market.alicloudapi.com";
        String path = "/createQrCode";
        String method = "GET";
        String appcode = "dcd306a5f76b43fe95fda75867fce884";
        System.out.println(wxConfig.getYuming());
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("content", wxConfig.getYuming() + "/#/appointment?depCode=" + depCode + "&depname=" + depname + "&docName=" + docName + "&docCode=" + docCode);
        querys.put("imgExtName", "jpg");
        querys.put("size", "5");
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
            String body = EntityUtils.toString(response.getEntity());
            return body;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
