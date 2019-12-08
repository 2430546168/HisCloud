package com.yhhis.common.entity;

public class Message {
    //消息ID
    String msgId;
    //接收者ID
    String toId;
    //发送者ID
    String fromId;
    //发送时间
    String msgDate;
    //消息内容
    String msg;
    //消息类型
    String msgType;
    //发送的图片语音资源路径
    String sourceUrl;
    //消息接收状态
    int msgStatus; //0 未接收 1已接收 2 已读

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(String msgDate) {
        if (msgDate.indexOf(".") != -1) {
            this.msgDate = msgDate.substring(0, msgDate.indexOf("."));
        } else {
            this.msgDate = msgDate;
        }

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public int getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    @Override
    public String toString() {
        return "Message [msgId=" + msgId + ", toId=" + toId + ", fromId="
                + fromId + ", msgDate=" + msgDate + ", msg=" + msg
                + ", msgType=" + msgType + ", sourceUrl=" + sourceUrl
                + ", msgStatus=" + msgStatus + "]";
    }

}
