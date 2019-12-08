package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 用于记录微信是否已经回调
 *
 * @author fengxian
 */
public class WxpayOrdersEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2313110895177507638L;

    private Integer id;//主键
    private String tradeno;//订单号
    private Integer notifyurl;//记录是否回调 0为回调 1已经回调
    private Integer status;//0为支付 1已支付
    private String visitno;
    private String type;

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getNotifyurl() {
        return notifyurl;
    }

    public void setNotifyurl(Integer notifyurl) {
        this.notifyurl = notifyurl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
