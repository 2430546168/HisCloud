package com.yhhis.common.sdk;

/**
 * 微信接口相关URL
 *
 * @author 18300
 */
public class ProjectConst {
    /**
     * 获取access_token的URL
     */
    public final static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    /**
     * 获取jsapi_ticket接口ticket的URL
     */
    public final static String JSAPI_TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
    /**
     * 获取临时素材接口的URL
     */
    public final static String getTempMaterial_url = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

}
