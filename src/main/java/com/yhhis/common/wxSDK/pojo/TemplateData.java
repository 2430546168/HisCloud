package com.yhhis.common.wxSDK.pojo;

/**
 * 实体类对象，用来设置<tt>TemplateMessage</tt>中的模板数据
 *
 * @author yangqisheng
 * @since 0.1.0
 */
public class TemplateData implements java.io.Serializable {

    /**
     * 字段Key
     */
    private String key;

    /**
     * 值
     */
    private String value;

    /**
     * 颜色
     */
    private String color;

    public TemplateData() {
    }

    public TemplateData(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public TemplateData(String key, String value, String color) {
        this.key = key;
        this.value = value;
        this.color = color;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}