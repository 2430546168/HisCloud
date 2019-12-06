package com.yhhis.common.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.text.ParseException;

/**
 * 医生评价详情
 */

@JsonIgnoreProperties(ignoreUnknown = true)//忽略未知属性
public class DoctorEval implements Serializable {

    private Integer id; //主键
    private String itemName; //项目名称
    private String evalContext; //评价内容
    private String handlerContext;//处理内容
    private String leavHosBefPg; //出院前评估
    private String chailAftSeven; //产后7天评估
    private String chailAftFourteen; //产后14天评估
    private String chailAftTwentyEight; //产后28天评估
    private String createTime; //创建时间
    private String doctorCode;//医生编码
    private String cardno;//患者卡号

    public DoctorEval() {
    }

    @Override
    public String toString() {
        return "DoctorEval{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", evalContext='" + evalContext + '\'' +
                ", handlerContext='" + handlerContext + '\'' +
                ", leavHosBefPg='" + leavHosBefPg + '\'' +
                ", chailAftSeven='" + chailAftSeven + '\'' +
                ", chailAftFourteen='" + chailAftFourteen + '\'' +
                ", chailAftTwentyEight='" + chailAftTwentyEight + '\'' +
                ", createTime=" + createTime +
                ", doctorCode='" + doctorCode + '\'' +
                ", cardno='" + cardno + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getEvalContext() {
        return evalContext;
    }

    public void setEvalContext(String evalContext) {
        this.evalContext = evalContext;
    }

    public String getHandlerContext() {
        return handlerContext;
    }

    public void setHandlerContext(String handlerContext) {
        this.handlerContext = handlerContext;
    }

    public String getLeavHosBefPg() {
        return leavHosBefPg;
    }

    public void setLeavHosBefPg(String leavHosBefPg) {
        this.leavHosBefPg = leavHosBefPg;
    }

    public String getChailAftSeven() {
        return chailAftSeven;
    }

    public void setChailAftSeven(String chailAftSeven) {
        this.chailAftSeven = chailAftSeven;
    }

    public String getChailAftFourteen() {
        return chailAftFourteen;
    }

    public void setChailAftFourteen(String chailAftFourteen) {
        this.chailAftFourteen = chailAftFourteen;
    }

    public String getChailAftTwentyEight() {
        return chailAftTwentyEight;
    }

    public void setChailAftTwentyEight(String chailAftTwentyEight) {
        this.chailAftTwentyEight = chailAftTwentyEight;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) throws ParseException {
        this.createTime = createTime;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
}
