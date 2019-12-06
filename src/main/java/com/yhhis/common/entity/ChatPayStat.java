package com.yhhis.common.entity;


import java.io.Serializable;
import java.sql.Timestamp;

public class ChatPayStat implements Serializable {

    private Integer id;
    private String cardno; //患者卡号
    private String docCode;//医生编码
    private double payAmount; //付费金额
    private Integer payIdent; //缴费标识
    private Timestamp payTime; //付费时间
    private Timestamp endTime;  //结束时间
    private Integer patStatus; //患者消息列表的状态
    private Integer docStatus; //医生消息列表的状态


    public ChatPayStat(String cardno, String docCode, double payAmount, Integer payIdent, Timestamp payTime, Integer patStatus, Integer docStatus) {
        this.cardno = cardno;
        this.docCode = docCode;
        this.payAmount = payAmount;
        this.payIdent = payIdent;
        this.payTime = payTime;
        this.patStatus = patStatus;
        this.docStatus = docStatus;
    }

    public ChatPayStat() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayIdent() {
        return payIdent;
    }

    public void setPayIdent(Integer payIdent) {
        this.payIdent = payIdent;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getPatStatus() {
        return patStatus;
    }

    public void setPatStatus(Integer patStatus) {
        this.patStatus = patStatus;
    }

    public Integer getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(Integer docStatus) {
        this.docStatus = docStatus;
    }
}
