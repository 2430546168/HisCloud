package com.yhhis.common.wxSDK.pojo;

/**
 * 临时票据类型
 *
 * @author yangqisheng
 * @since 0.0.1
 */
public enum TicketType {

    /**
     * 用于调用微信JSSDK的临时票据
     */
    JSAPI("jsapi"),
    /**
     * 用于调用微信卡券相关接口的临时票据
     */
    WX_CARD("wx_card");

    private String value = "";

    TicketType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}