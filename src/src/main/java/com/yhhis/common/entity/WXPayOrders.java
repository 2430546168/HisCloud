package com.yhhis.common.entity;

import java.io.Serializable;

public class WXPayOrders implements Serializable {

    private static final long serialVersionUID = 3698616773362990281L;
    String tradeno;
    String transactionid;
    String body;
    int totalfee;
    String starttime;
    String endtiem;
    String openid;
    String prepayid;
    String tradetype;
    int status; // 订单状态：0-提交 1-支付 2 退款 -1-无效
    String refundno;
    int refunddee;
    private Integer id;
    private String cardno;// 患者卡号

    public WXPayOrders(String tradeno, String transactionid, String body, int totalfee, String starttime,
                       String endtiem, String openid, String prepayid, String tradetype, int status, String refundno,
                       int refunddee, String cardno) {
        super();
        this.tradeno = tradeno;
        this.transactionid = transactionid;
        this.body = body;
        this.totalfee = totalfee;
        this.starttime = starttime;
        this.endtiem = endtiem;
        this.openid = openid;
        this.prepayid = prepayid;
        this.tradetype = tradetype;
        this.status = status;
        this.refundno = refundno;
        this.refunddee = refunddee;
        this.cardno = cardno;
    }

    public WXPayOrders() {

    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtiem() {
        return endtiem;
    }

    public void setEndtiem(String endtiem) {
        this.endtiem = endtiem;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRefundno() {
        return refundno;
    }

    public void setRefundno(String refundno) {
        this.refundno = refundno;
    }

    public int getRefunddee() {
        return refunddee;
    }

    public void setRefunddee(int refunddee) {
        this.refunddee = refunddee;
    }

    @Override
    public String toString() {
        return "WXPayOrders [tradeno=" + tradeno + ", transactionid=" + transactionid + ", body=" + body + ", totalfee="
                + totalfee + ", starttime=" + starttime + ", endtiem=" + endtiem + ", openid=" + openid + ", prepayid="
                + prepayid + ", tradetype=" + tradetype + ", status=" + status + ", refundno=" + refundno
                + ", refunddee=" + refunddee + "]";
    }
}
