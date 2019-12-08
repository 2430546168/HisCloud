package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 评估内容
 */
public class Evaluates implements Serializable {

    private String evalCode;   //评估内容编码
    private String evalContext;//评估内容
    private String itemCode;  //项目编码

    public String getEvalCode() {
        return evalCode;
    }

    public void setEvalCode(String evalCode) {
        this.evalCode = evalCode;
    }

    public String getEvalContext() {
        return evalContext;
    }

    public void setEvalContext(String evalContext) {
        this.evalContext = evalContext;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "evalCode='" + evalCode + '\'' +
                ", evalContext='" + evalContext + '\'' +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }
}
