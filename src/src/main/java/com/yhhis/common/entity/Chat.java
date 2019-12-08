package com.yhhis.common.entity;

public class Chat {
    String msgid;            //咨询流水号
    String doccode;          //医生编码
    String userid;           //用户id(openid)
    String createtime;       //创建时间
    String bengintime;       //医生回复时间
    int expiresin;           //有效时间  小时 默认48
    float fee;               //咨询费用
    int status;              //咨询状态 （0-未提问 1-已提问 2-已回复 3-已关闭）
    int evalevel = -1;       //评价级别 （0-不满意 1-满意 2-很满意）
    String evaldes;          //评价内容
    String evallab;          //评价标签
    String tradeno;          //支付订单号
    String firstshare;       //第一分享人
    String secondshare;      //第二分享人
    String thirdshare;      //第三分享人

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getBengintime() {
        return bengintime;
    }

    public void setBengintime(String bengintime) {
        this.bengintime = bengintime;
    }

    public int getExpiresin() {
        return expiresin;
    }

    public void setExpiresin(int expiresin) {
        this.expiresin = expiresin;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEvalevel() {
        return evalevel;
    }

    public void setEvalevel(int evalevel) {
        this.evalevel = evalevel;
    }

    public String getEvaldes() {
        return evaldes;
    }

    public void setEvaldes(String evaldes) {
        this.evaldes = evaldes;
    }

    public String getEvallab() {
        return evallab;
    }

    public void setEvallab(String evallab) {
        this.evallab = evallab;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getFirstshare() {
        return firstshare;
    }

    public void setFirstshare(String firstshare) {
        this.firstshare = firstshare;
    }

    public String getSecondshare() {
        return secondshare;
    }

    public void setSecondshare(String secondshare) {
        this.secondshare = secondshare;
    }

    public String getThirdshare() {
        return thirdshare;
    }

    public void setThirdshare(String thirdshare) {
        this.thirdshare = thirdshare;
    }

    @Override
    public String toString() {
        return "Chat [msgid=" + msgid + ", doccode=" + doccode + ", userid="
                + userid + ", createtime=" + createtime + ", bengintime="
                + bengintime + ", expiresin=" + expiresin + ", fee=" + fee
                + ", status=" + status + ", evalevel=" + evalevel
                + ", evaldes=" + evaldes + ", evallab=" + evallab
                + ", tradeno=" + tradeno + ", firstshare=" + firstshare
                + ", secondshare=" + secondshare + ", thirdshare=" + thirdshare
                + "]";
    }
}
