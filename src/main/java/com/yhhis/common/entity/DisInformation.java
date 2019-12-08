package com.yhhis.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 患者信息表
 *
 * @author 小贵
 */
public class DisInformation implements Serializable {
    private static final long serialVersionUID = 7435595656552442126L;
    private String openid;//患者的openid
    private String cardno;//患者卡号
    private String username;//患者姓名
    private String sex;//患者性别
    private String phone;//患者手机号
    private String idno;//身份证号
    private String descriptionInfo;//患者病情描述信息
    private String docname;//医生姓名
    private String doccode;//医生编码
    private String illnessTime;//患病时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nowTime;//当前时间

    public DisInformation() {
    }

    public DisInformation(String openid, String cardno, String username, String sex, String phone, String idno, String descriptionInfo, String docname, String doccode, String illnessTime, Date nowTime) {
        this.openid = openid;
        this.cardno = cardno;
        this.username = username;
        this.sex = sex;
        this.phone = phone;
        this.idno = idno;
        this.descriptionInfo = descriptionInfo;
        this.docname = docname;
        this.doccode = doccode;
        this.illnessTime = illnessTime;
        this.nowTime = nowTime;
    }

    @Override
    public String toString() {
        return "DisInformation{" +
                "openid='" + openid + '\'' +
                ", cardno='" + cardno + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", idno='" + idno + '\'' +
                ", descriptionInfo='" + descriptionInfo + '\'' +
                ", docname='" + docname + '\'' +
                ", doccode='" + doccode + '\'' +
                ", illnessTime='" + illnessTime + '\'' +
                ", nowTime=" + nowTime +
                '}';
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getDescriptionInfo() {
        return descriptionInfo;
    }

    public void setDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getIllnessTime() {
        return illnessTime;
    }

    public void setIllnessTime(String illnessTime) {
        this.illnessTime = illnessTime;
    }

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }
}
