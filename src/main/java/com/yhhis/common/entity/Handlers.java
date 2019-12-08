package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 主管医生处理原则
 */
public class Handlers implements Serializable {

    private String handlerCode; //医生处理原则编码
    private String handlerContext; //医生处理原则内容
    private String itemCode; //项目编码
    private String evalCode; //评估编码

    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }

    public String getHandlerContext() {
        return handlerContext;
    }

    public void setHandlerContext(String handlerContext) {
        this.handlerContext = handlerContext;
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
}
