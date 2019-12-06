package com.yhhis.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * com.his 表 current_price_list 获取检查的所有项目 和对应的价格
 *
 * @author zzh
 */
public class CurrentPriceList implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -3544718510620858722L;
    private String itemclass;//项目类型
    private String itemcode;//项目编码
    private String itemname;//项目名称
    private String itemspec;//项目规格
    private String units;//项目单位
    private BigDecimal price;//价格
    private BigDecimal preferprice;
    private BigDecimal foreignerprice;
    private String performedby;
    private Integer feetypemask;
    private String classoninprcpt;
    private String classonoutprcpt;
    private String classonreckoning;
    private String subjcode;
    private String classnomr;
    private String memo;
    private String operator;
    private Date enterdate;
    private Date startdate;
    private String materialcode;
    private String groupflag;

    public String getItemclass() {
        return itemclass;
    }

    public void setItemclass(String itemclass) {
        this.itemclass = itemclass;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemspec() {
        return itemspec;
    }

    public void setItemspec(String itemspec) {
        this.itemspec = itemspec;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPreferprice() {
        return preferprice;
    }

    public void setPreferprice(BigDecimal preferprice) {
        this.preferprice = preferprice;
    }

    public BigDecimal getForeignerprice() {
        return foreignerprice;
    }

    public void setForeignerprice(BigDecimal foreignerprice) {
        this.foreignerprice = foreignerprice;
    }

    public String getPerformedby() {
        return performedby;
    }

    public void setPerformedby(String performedby) {
        this.performedby = performedby;
    }

    public Integer getFeetypemask() {
        return feetypemask;
    }

    public void setFeetypemask(Integer feetypemask) {
        this.feetypemask = feetypemask;
    }

    public String getClassoninprcpt() {
        return classoninprcpt;
    }

    public void setClassoninprcpt(String classoninprcpt) {
        this.classoninprcpt = classoninprcpt;
    }

    public String getClassonoutprcpt() {
        return classonoutprcpt;
    }

    public void setClassonoutprcpt(String classonoutprcpt) {
        this.classonoutprcpt = classonoutprcpt;
    }

    public String getClassonreckoning() {
        return classonreckoning;
    }

    public void setClassonreckoning(String classonreckoning) {
        this.classonreckoning = classonreckoning;
    }

    public String getSubjcode() {
        return subjcode;
    }

    public void setSubjcode(String subjcode) {
        this.subjcode = subjcode;
    }

    public String getClassnomr() {
        return classnomr;
    }

    public void setClassnomr(String classnomr) {
        this.classnomr = classnomr;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getMaterialcode() {
        return materialcode;
    }

    public void setMaterialcode(String materialcode) {
        this.materialcode = materialcode;
    }

    public String getGroupflag() {
        return groupflag;
    }

    public void setGroupflag(String groupflag) {
        this.groupflag = groupflag;
    }


}
