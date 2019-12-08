package com.yhhis.common.wxSDK.pojo;

import java.util.List;

/**
 * 实体类对象，发送模板消息对象
 *
 * @author yangqisheng
 * @since 0.1.0
 */
public class TemplateMessage implements java.io.Serializable {

    /**
     * 接收者openid，对应官方参数touser
     */
    private String openid;
    /**
     * 模板ID
     */
    private String templateId;
    /**
     * 模板跳转链接
     */
    private String url;
    /**
     * 模板数据
     */
    private List<TemplateData> data;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TemplateData> getData() {
        return data;
    }

    public void setData(List<TemplateData> data) {
        this.data = data;
    }
}