package com.yhhis.common.sdk;

/**
 * @author 18300
 * @desc 封装jsapi_ticket的实体
 */
public class JsApiTicket {
    /**
     * ticket的值
     */
    private String ticket;
    /**
     * ticket的有效时间
     */
    private Long expireIn;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Long getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(Long expireIn) {
        this.expireIn = expireIn;
    }
}
