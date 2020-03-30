package com.yhhis.common.entity;

import java.io.Serializable;

public class StaffDict implements Serializable {
    private String id;     //主键ID
    private String deptCode;    //科室代码
    private String name;    //姓名
    private String inputCode;   //拼音码
    private String job; //职位
    private String title;   //职称
    private String userName;    //用户名
    private String createDate;  //创建日期
    private String lastTime;    //最后活动日期
    private String phoneNo; //手机号
    private String cardNo;  //身份证号
    private String expertJob;//擅长工作
    private String onlineStatus;//在线状态
    private String consultationPrice;//咨询费用


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpertJob() {
        return expertJob;
    }

    public void setExpertJob(String expertJob) {
        this.expertJob = expertJob;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getConsultationPrice() {
        return consultationPrice;
    }

    public void setConsultationPrice(String consultationPrice) {
        this.consultationPrice = consultationPrice;
    }

    @Override
    public String toString() {
        return "StaffDict{" +
                "id='" + id + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", name='" + name + '\'' +
                ", inputCode='" + inputCode + '\'' +
                ", job='" + job + '\'' +
                ", title='" + title + '\'' +
                ", userName='" + userName + '\'' +
                ", createDate='" + createDate + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", expertJob='" + expertJob + '\'' +
                ", onlineStatus='" + onlineStatus + '\'' +
                ", consultationPrice='" + consultationPrice + '\'' +
                '}';
    }

}
