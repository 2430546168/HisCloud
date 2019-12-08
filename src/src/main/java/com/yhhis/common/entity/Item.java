package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 项目
 */
public class Item implements Serializable {

    private String itemCode;  //评估项目编码
    private String itemName;  //评估项目名称

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

