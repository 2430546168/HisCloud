package com.yhhis.common.entity;

import java.math.BigDecimal;

public class ClinicTotal {
    private BigDecimal money;
    private Integer count;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
