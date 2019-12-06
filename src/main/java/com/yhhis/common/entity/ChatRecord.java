package com.yhhis.common.entity;


import java.io.Serializable;
import java.sql.Timestamp;

public class ChatRecord implements Serializable {

    private Integer id;
    private String sender; //消息发送方
    private String receiver;//消息接收方
    private String content; //聊天内容
    private Timestamp chatTime; //聊天时间
    private Integer patStatus; //患者状态
    private Integer docStatus;//医生状态
    private Integer cpsId;  //聊天付费统计id

    public ChatRecord(String sender, String receiver, String content, Timestamp chatTime, Integer patStatus, Integer docStatus, Integer cpsId) {

        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.chatTime = chatTime;
        this.patStatus = patStatus;
        this.docStatus = docStatus;
        this.cpsId = cpsId;
    }

    public ChatRecord() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getChatTime() {
        return chatTime;
    }

    public void setChatTime(Timestamp chatTime) {
        this.chatTime = chatTime;
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

    public Integer getCpsId() {
        return cpsId;
    }

    public void setCpsId(Integer cpsId) {
        this.cpsId = cpsId;
    }
}
