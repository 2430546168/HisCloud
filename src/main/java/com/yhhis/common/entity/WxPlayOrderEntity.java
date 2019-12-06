package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 订单表
 *
 * @author zzh
 */
public class WxPlayOrderEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1335400883403904834L;
    private Integer id;
    private String tradeno;//订单号
    private String transactionid;
    private String body;//内容
    private String todalfee;//总费用
    private String starttime;//挂号时间
    private String endtiem;//结束时间
    private String openid;
    private String prepayid;//预付款
    private String tradetype;//JSAPI
    private Integer status;//0为可退款，1不可退款，2待评价
    private String refundno;//默认 null
    private String refunddee;//退款金额
    private String cardno;//患者卡号
    private String name;//患者姓名
    private String sex;//患者性别 性别1为男0为女
    private String idno;//患者身份证
    private String regdate;//就诊日期
    private String registerfee;//挂号支付费用
    private String amorpm;//上午还是下午
    private String cardname;//标识 微信支付
    private String hosdepcode;//挂号可是编码
    private String hosdepname;//挂号科室名称
    private String hosdoccode;//挂号医生编号
    private String hosdocname;//挂号医生姓名
    private String regcode;//号员编码
    private String birthdate;//患者生日
    private String age;//患者年龄
    private String regname;//号源名称
    private String totalfee;//总费用
    /**
     * 新加
     */
    private String visitno;//就诊序号
    private String clinicno;//门诊序号


    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public String getClinicno() {
        return clinicno;
    }

    public void setClinicno(String clinicno) {
        this.clinicno = clinicno;
    }

    public String getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(String totalfee) {
        this.totalfee = totalfee;
    }

    public String getRegname() {
        return regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRefundno() {
        return refundno;
    }

    public void setRefundno(String refundno) {
        this.refundno = refundno;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getAmorpm() {
        return amorpm;
    }

    public void setAmorpm(String amorpm) {
        this.amorpm = amorpm;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getHosdepcode() {
        return hosdepcode;
    }

    public void setHosdepcode(String hosdepcode) {
        this.hosdepcode = hosdepcode;
    }

    public String getHosdepname() {
        return hosdepname;
    }

    public void setHosdepname(String hosdepname) {
        this.hosdepname = hosdepname;
    }

    public String getHosdoccode() {
        return hosdoccode;
    }

    public void setHosdoccode(String hosdoccode) {
        this.hosdoccode = hosdoccode;
    }

    public String getHosdocname() {
        return hosdocname;
    }

    public void setHosdocname(String hosdocname) {
        this.hosdocname = hosdocname;
    }

    public String getRegcode() {
        return regcode;
    }

    public void setRegcode(String regcode) {
        this.regcode = regcode;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTodalfee() {
        return todalfee;
    }

    public void setTodalfee(String todalfee) {
        this.todalfee = todalfee;
    }

    public String getRefunddee() {
        return refunddee;
    }

    public void setRefunddee(String refunddee) {
        this.refunddee = refunddee;
    }

    public String getRegisterfee() {
        return registerfee;
    }

    public void setRegisterfee(String registerfee) {
        this.registerfee = registerfee;
    }


}
