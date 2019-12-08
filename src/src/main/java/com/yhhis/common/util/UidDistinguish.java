package com.yhhis.common.util;


import com.alibaba.fastjson.JSONObject;
import com.yhhis.common.entity.ImageParam;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * 阿里云 杭州数脉科技有限公司接口
 * 读取身份证信息接口
 *
 * @author fengxian
 */
public class UidDistinguish {
    private static final String host = "https://idcardocrfront.shumaidata.com";
    private static final String path = "/getIdCardOcrInfo";
    private static final String method = "POST";
    private static final String appcode = "6b0f7441f6c14646b32189911d2e1373";//你自己的AppCode


    public static String imageToBase64(String imagePath) {
        InputStream in = null;
        byte[] buff = null;
        try {
            in = new FileInputStream(imagePath);
            buff = new byte[in.available()];
            in.read(buff);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(buff);
    }

    public String userInfo(String image64) {
        String result = "";
        try {
            Map<String, String> headers = new HashMap<String, String>();
            //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
            headers.put("Authorization", "APPCODE " + appcode);
            //根据API的要求，定义相对应的Content-Type
            headers.put("Content-Type", "application/json; charset=UTF-8");
            headers.put("Content-Type", "application/json");
            Map<String, String> querys = new HashMap<String, String>();
            ImageParam param = new ImageParam();
            param.setImage(image64);
            param.setIs_return_pic("0");
            System.out.println(param.getImage());
            String bodys = JSONObject.toJSONString(param);
            System.out.println(bodys);
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            /*
             * HTTP/1.1 200 OK [Server: Tengine, Date: Wed, 31 Jul 2019 05:41:12 GMT,
             * Content-Type: application/json; charset=UTF-8, Content-Length: 335,
             * Connection: keep-alive, Access-Control-Allow-Origin: *,
             * Access-Control-Allow-Methods: GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH,
             * Access-Control-Allow-Headers:
             * X-Requested-With,X-Sequence,X-Ca-Key,X-Ca-Secret,X-Ca-Version,X-Ca-Timestamp,
             * X-Ca-Nonce,X-Ca-API-Key,X-Ca-Stage,X-Ca-Client-DeviceId,X-Ca-Client-AppId,X-
             * Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Forwarded-For,X-
             * Ca-Date,X-Ca-Request-Mode,Authorization,Content-Type,Accept,Accept-Ranges,
             * Cache-Control,Range,Content-MD5, Access-Control-Max-Age: 172800,
             * X-Ca-Request-Id: 733A6FC0-91A2-4631-B4DB-9CE211850428, X-Ca-Error-Message:
             * OK] org.apache.http.conn.BasicManagedEntity@7d055aa6
             */
            //result = response.toString();
            result = EntityUtils.toString(response.getEntity());
            //转list<Map<String,Object>>
            //获取response的body
            /*
             * { "code" : "0", "message" : "成功", "result" : { "res" : "40000", "description"
             * : "身份证正面OCR识别成功", "idCardNo" : "130684199111260375", "address" :
             * "河北省高碑店市高二村联谊路23号", "gender" : "男", "race" : "汉", "name" : "张海洋", "birth" :
             * "1991.11.26" }
             */
        } catch (Exception e) {
        }
        return result;

    }

}
