package com.yhhis.service.impl;

import com.yhhis.common.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = {"classpath:wxconfig.properties"}, ignoreResourceNotFound = true)
//@Service
public class WxConfig {
    //网页授权的scope 获取openid用
    public static String SNSAPI_BASE = "snsapi_base";
    //网页授权的scope 获取用户的基本信息,需要用户授权
    public static String SNSAPI_USER = "snsapi_userinfo";
    /*************************************模板消息ID*********************************************/
    //注册通知模板ID
    public static String REG_TEMPLATE_ID = "TvJp9q5TlVdZDOiUwEuklXXHFZPW3mFMETZQLJylAYw";
    //预约挂号成功通知
    public static String WXPAYSTRATION_TEMPLATE_ID = "JQ6pNNLGMJZMhsV_UAcWGl0IhfKK4qPhwNhd-_vdB14";
    //取消预约挂号并且退款通知
    public static String REFUNDWX_TEMPLATE_ID = "4jFx1raGGxE46p2doU52-LWYFxpw7vNdR8R_eqT1OWM";
    //处方开具成功通知
    public static String PRESCRIPTION_SUCCESS_ID = "-iIoLoYZeoX1r1pS0CY8u_QBoVf2FdA12QjkotxcDbI";
    //检查开具成功通知
    public static String CHECK_SUCCESS_ID = "edNPkZsXFz8zmubO8Ra1MovvbCl4ezswYV_ZffMd6ug";
    //化验 开具成功通知
    public static String CHEMICALEXAM_SUCCESS_ID = "nxwqmT3AEheZnyI7fuGtuMBlwNyj3g-WCWEaaZC7wu8";
    /**************************************接口地址**********************************************/
    //获取access_token接口地址
    public static String ACCESS_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    //获取jspai_ticket接口地址
    public static String TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
    //多媒体文件下载接口地址
    public static String MEDIA_URL = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";
    //获取用户授权code接口地址
    public static String AUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=URL&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
    //网页授权access_token接口地址
    public static String AUTH_ACCESS_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    //获取用户信息授权接口地址
    public static String USERINFO_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    //获取用户基本信息（包含关注信息）接口地址
    public static String GET_USERINFO_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    //模板消息接口地址
    public static String TEMPLATE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
    //客服消息接口地址
    public static String CUSTOM_SERVICE_MSG_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
    //获取永久素材列表接口
    public static String BATCHGET_MATERIAL_URL = "https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token=ACCESS_TOKEN";
    //获取永久素材接口
    public static String GET_MATERIAL_URL = "https://api.weixin.qq.com/cgi-bin/material/get_material?access_token=ACCESS_TOKEN";
    //长链接转短链接接口
    public static String SHORT_URL_API = "https://api.weixin.qq.com/cgi-bin/shorturl?access_token=ACCESS_TOKEN";
    //企业付款到零钱接口地址
    public static String PAY_TOUSER_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
    //接口调用凭据
    private static String accessToken = "";
    //token获取时间
    private static String accessTime = "";
    //token有效时间 秒
    private static int tokenExpiresIn = 7200;
    //JS接口的临时票据
    private static String jsapiTicket = "";
    //jspai_ticket获取时间
    private static String ticketTime = "";
    //jspai_ticket有效时间 秒
    private static int ticketExpiresIn = 7200;
    //秘钥
    @Value("${key}")
    public String key;
    //微信分配的公众号ID（开通公众号之后可以获取到）#{config['appID']}
    @Value("${appID}")
    public String appID;
    //开发者密码
    @Value("${appSecret}")
    public String appSecret;
    //微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
    @Value("${mchID}")
    public String mchID;
    //受理模式下给子商户分配的子商户号
    @Value("${sdbMchID}")
    public String subMchID;
    //HTTPS证书的本地路径
    @Value("${certLocalPath}")
    public String certLocalPath;
    //HTTPS证书密码，默认密码等于商户号MCHID
    @Value("${certPassword}")
    public String certPassword;
    //域名
    @Value("${yuming}")
    public String yuming;
    @Value("${damion}")
    public String damion;
    //实名认证地址
    @Value("${id_Url}")
    public String id_Url;
    @Value("${id_Appkey}")
    public String id_Appkey;

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        WxConfig.accessToken = accessToken;
    }

    public static String getAccessTime() {
        return accessTime;
    }

    public static void setAccessTime(String accessTime) {
        WxConfig.accessTime = accessTime;
    }

    public static int getTokenExpiresIn() {
        return tokenExpiresIn;
    }

    public static void setTokenExpiresIn(int tokenExpiresIn) {
        WxConfig.tokenExpiresIn = tokenExpiresIn;
    }

    public static String getJsapiTicket() {
        return jsapiTicket;
    }

    public static void setJsapiTicket(String jsapiTicket) {
        WxConfig.jsapiTicket = jsapiTicket;
    }

    public static String getTicketTime() {
        return ticketTime;
    }

    public static void setTicketTime(String ticketTime) {
        WxConfig.ticketTime = ticketTime;
    }

    public static int getTicketExpiresIn() {
        return ticketExpiresIn;
    }

    public static void setTicketExpiresIn(int ticketExpiresIn) {
        WxConfig.ticketExpiresIn = ticketExpiresIn;
    }

    public static String getAccessUrl() {
        return ACCESS_URL;
    }

    public static void setAccessUrl(String accessUrl) {
        WxConfig.ACCESS_URL = accessUrl;
    }

    public static String getTicketUrl() {
        return TICKET_URL;
    }

    public static void setTicketUrl(String ticketUrl) {
        WxConfig.TICKET_URL = ticketUrl;
    }

    public static String getMediaUrl() {
        return MEDIA_URL;
    }

    public static void setMediaUrl(String mediaUrl) {
        WxConfig.MEDIA_URL = mediaUrl;
    }

    public String getId_Url() {
        return id_Url;
    }

    public void setId_Url(String id_Url) {
        this.id_Url = id_Url;
    }

    public String getId_Appkey() {
        return id_Appkey;
    }

    public void setId_Appkey(String id_Appkey) {
        this.id_Appkey = id_Appkey;
    }

    public String getYuming() {
        return yuming;
    }

    public void setYuming(String yuming) {
        this.yuming = yuming;
    }

    public String getDamion() {
        return damion;
    }

    public void setDamion(String damion) {
        this.damion = damion;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getMchID() {
        return mchID;
    }

    public void setMchID(String mchID) {
        this.mchID = mchID;
    }

    public String getSubMchID() {

        return subMchID;
    }

    public void setSubMchID(String subMchID) {
        this.subMchID = subMchID;
    }

    public String getCertLocalPath() {
        return certLocalPath;
    }

    public void setCertLocalPath(String certLocalPath) {
        this.certLocalPath = certLocalPath;
    }

    public String getCertPassword() {
        return certPassword;
    }

    public void setCertPassword(String certPassword) {
        this.certPassword = certPassword;
    }

    @Override
    public String toString() {
        return "WxConfig [key=" + key + ", appID=" + appID + ", appSecret="
                + appSecret + ", mchID=" + mchID + ", subMchID=" + subMchID
                + ", certLocalPath=" + certLocalPath + ", certPassword="
                + certPassword + ", accessToken=" + accessToken
                + ", accessTime=" + accessTime + ", accessUrl=" + ACCESS_URL
                + "]";
    }
}
