package com.yhhis.common.wxSDK.component;

import com.alibaba.fastjson.JSONObject;
import com.yhhis.common.util.WxUtils;
import com.yhhis.common.wxSDK.Configuration;
import com.yhhis.common.wxSDK.WeixinException;
import com.yhhis.common.wxSDK.http.HttpsClient;
import com.yhhis.common.wxSDK.http.Response;
import com.yhhis.common.wxSDK.pojo.TemplateData;
import com.yhhis.common.wxSDK.pojo.TemplateMessage;
import com.yhhis.common.wxSDK.pojo.Weixin;

import java.util.List;

/**
 * 消息管理组件
 *
 * @author yangqisheng
 * @since 0.1.0
 */
public class MessageComponent extends AbstractComponent {
    public MessageComponent(Weixin weixin) {
        super(weixin);
    }


    /**
     * 发送模板消息
     *
     * @param templateMessage 模板消息
     */
    public static void sendTemplateMessage(TemplateMessage templateMessage) throws WeixinException {
        sendTemplateMessage(templateMessage.getOpenid(), templateMessage.getTemplateId(), templateMessage.getData(), templateMessage.getUrl());
    }

    /**
     * 发送模板消息(带跳转小程序或链接)
     *
     * <p>
     * 注：url和miniprogram都是非必填字段，若都不传则模板无跳转；若都传，会优先跳转至小程序。开发者可根据实际需要选择其中一种跳转方式即可。当用户的微信客户端版本不支持跳小程序时，将会跳转至url。</p>
     *
     * @param openid     接收者
     * @param templateId 模板消息ID
     * @param datas      模板数据
     * @param url        模板跳转链接
     *                   微信操作异常
     */
    public static void sendTemplateMessage(String openid, String templateId, List<TemplateData> datas, String url) throws WeixinException {
        //内部业务验证
        if (openid == null || openid.equals("")) {
            throw new IllegalStateException("openid can not be null or empty");
        }
        if (templateId == null || templateId.equals("")) {
            throw new IllegalStateException("templateId can not be null or empty");
        }
        if (datas == null || datas.isEmpty()) {
            throw new IllegalStateException("datas can not be null or empty");
        }
        JSONObject json = new JSONObject();
        json.put("touser", openid);
        json.put("template_id", templateId);
        //添加模板跳转链接
        if (url != null && !url.equals("")) {
            json.put("url", url);
        }
        //添加模板数据
        JSONObject data = new JSONObject();
        for (TemplateData templateData : datas) {
            JSONObject dataContent = new JSONObject();
            dataContent.put("value", templateData.getValue());
            dataContent.put("color", templateData.getColor());
            data.put(templateData.getKey(), dataContent);
        }
        json.put("data", data);
        //创建请求对象
        HttpsClient http = new HttpsClient();
        Response res = http.post("https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=" + WxUtils.getAccessToken(), json);
        //根据请求结果判定，是否验证成功
        JSONObject jsonObj = res.asJSONObject();
        if (jsonObj != null) {
            if (Configuration.isDebug()) {
                System.out.println("sendTemplateMessage返回json：" + jsonObj.toString());
            }
            Object errcode = jsonObj.get("errcode");
            if (errcode != null && !errcode.toString().equals("0")) {
                //返回异常信息
                throw new WeixinException(getCause(jsonObj.getIntValue("errcode")));
            }
        }
    }
}
