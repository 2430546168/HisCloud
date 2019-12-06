package com.yhhis.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 处方总支付订单表
 *
 * @author zzh
 */
public class PresOrders implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 737300491332640310L;


    private Integer id;//主键
    private String tradeno;//订单号
    private String serialno;//流水号
    private String fee;//总价格
    private String openid;//患者openid
    private String cardno;//卡号
    private Date paytime;//订单生成时间
    private Date refundtime;//退款订单时间
    private Integer status;//状态


    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
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

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(Date refundtime) {
        this.refundtime = refundtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
