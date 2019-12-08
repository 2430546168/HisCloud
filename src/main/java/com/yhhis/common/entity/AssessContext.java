package com.yhhis.common.entity;

import java.io.Serializable;

public class AssessContext implements Serializable {

    private String assessCode; //评估选项编码
    private String leavHosBefPg; //出院前评估
    private String chailAftSeven; //产后7天评估
    private String chailAftFourteen; //产后14天评估
    private String chailAftTwentyEight; //产后28天评估
    private String itemCode; //项目编码
    private String evalCode; //评估内容编码
    private String handlerCode; //处理原则编码

    public AssessContext() {
    }

    public String getAssessCode() {
        return assessCode;
    }

    public void setAssessCode(String assessCode) {
        this.assessCode = assessCode;
    }

    public String getLeavHosBefPg() {
        return leavHosBefPg;
    }

    public void setLeavHosBefPg(String leavHosBefPg) {
        this.leavHosBefPg = leavHosBefPg;
    }

    public String getChailAftSenven() {
        return chailAftSeven;
    }

    public void setChailAftSenven(String chailAftSenven) {
        this.chailAftSeven = chailAftSenven;
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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getEvalCode() {
        return evalCode;
    }

    public void setEvalCode(String evalCode) {
        this.evalCode = evalCode;
    }

    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }


}
