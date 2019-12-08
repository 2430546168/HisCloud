package com.yhhis.common.entity;

import java.util.Date;

public class OutpOrdersCosts {
    private String patientid;//ID号
    private Date visitdate;//就诊日期
    private Integer visitno;//就诊序号
    private String serialno;//流水号
    private String orderclass;//就诊项目类别
    private Integer orderno;//医嘱号
    private Integer ordersubno;//子医嘱号
    private Integer itemno;//顺序号
    private String itemclass;//收费项目类别
    private String itemname;//项目名称
    private String itemcode;//项目代码
    private String itemspec;//项目规格
    private String units;//单位
    private String repetition;//付数
    private Integer amount;//数量
    private String orderedbydept;//录入科室
    private String orderedbydoctor;//录入医生
    private String performedby;//执行诊室
    private String classonrcpt;//收费项目分类
    private double costs;//计价金额
    private double charges;//实收费用
    private String rcptno;//收据号码
    private double billdescno;
    private double billitemno;
    private Integer chargeindicator;//收费标记
    private String classnoreckoning;//核算项目分类
    private String subjcode;//会计科目
    private double itemprice;//单价
    private Date billdate;//项目收费日期
    private Integer billno;//项目收费编码
    private Integer wardcode;//项目收费日期
    private String performedbysub;//执行科室药品子库房

    public OutpOrdersCosts(String patientid, Date visitdate, Integer visitno, String serialno, String orderclass,
                           Integer orderno, Integer ordersubno, Integer itemno, String itemclass, String itemname, String itemcode,
                           String itemspec, String units, String repetition, Integer amount, String orderedbydept,
                           String orderedbydoctor, String performedby, String classonrcpt, double costs, double charges,
                           String rcptno, double billdescno, double billitemno, Integer chargeindicator, String classnoreckoning,
                           String subjcode, double itemprice, Date billdate, Integer billno, Integer wardcode,
                           String performedbysub) {
        super();
        this.patientid = patientid;
        this.visitdate = visitdate;
        this.visitno = visitno;
        this.serialno = serialno;
        this.orderclass = orderclass;
        this.orderno = orderno;
        this.ordersubno = ordersubno;
        this.itemno = itemno;
        this.itemclass = itemclass;
        this.itemname = itemname;
        this.itemcode = itemcode;
        this.itemspec = itemspec;
        this.units = units;
        this.repetition = repetition;
        this.amount = amount;
        this.orderedbydept = orderedbydept;
        this.orderedbydoctor = orderedbydoctor;
        this.performedby = performedby;
        this.classonrcpt = classonrcpt;
        this.costs = costs;
        this.charges = charges;
        this.rcptno = rcptno;
        this.billdescno = billdescno;
        this.billitemno = billitemno;
        this.chargeindicator = chargeindicator;
        this.classnoreckoning = classnoreckoning;
        this.subjcode = subjcode;
        this.itemprice = itemprice;
        this.billdate = billdate;
        this.billno = billno;
        this.wardcode = wardcode;
        this.performedbysub = performedbysub;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public Date getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    public Integer getVisitno() {
        return visitno;
    }

    public void setVisitno(Integer visitno) {
        this.visitno = visitno;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getOrderclass() {
        return orderclass;
    }

    public void setOrderclass(String orderclass) {
        this.orderclass = orderclass;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Integer getOrdersubno() {
        return ordersubno;
    }

    public void setOrdersubno(Integer ordersubno) {
        this.ordersubno = ordersubno;
    }

    public Integer getItemno() {
        return itemno;
    }

    public void setItemno(Integer itemno) {
        this.itemno = itemno;
    }

    public String getItemclass() {
        return itemclass;
    }

    public void setItemclass(String itemclass) {
        this.itemclass = itemclass;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
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

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderedbydept() {
        return orderedbydept;
    }

    public void setOrderedbydept(String orderedbydept) {
        this.orderedbydept = orderedbydept;
    }

    public String getOrderedbydoctor() {
        return orderedbydoctor;
    }

    public void setOrderedbydoctor(String orderedbydoctor) {
        this.orderedbydoctor = orderedbydoctor;
    }

    public String getPerformedby() {
        return performedby;
    }

    public void setPerformedby(String performedby) {
        this.performedby = performedby;
    }

    public String getClassonrcpt() {
        return classonrcpt;
    }

    public void setClassonrcpt(String classonrcpt) {
        this.classonrcpt = classonrcpt;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public String getRcptno() {
        return rcptno;
    }

    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    public double getBilldescno() {
        return billdescno;
    }

    public void setBilldescno(double billdescno) {
        this.billdescno = billdescno;
    }

    public double getBillitemno() {
        return billitemno;
    }

    public void setBillitemno(double billitemno) {
        this.billitemno = billitemno;
    }

    public Integer getChargeindicator() {
        return chargeindicator;
    }

    public void setChargeindicator(Integer chargeindicator) {
        this.chargeindicator = chargeindicator;
    }

    public String getClassnoreckoning() {
        return classnoreckoning;
    }

    public void setClassnoreckoning(String classnoreckoning) {
        this.classnoreckoning = classnoreckoning;
    }

    public String getSubjcode() {
        return subjcode;
    }

    public void setSubjcode(String subjcode) {
        this.subjcode = subjcode;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Integer getBillno() {
        return billno;
    }

    public void setBillno(Integer billno) {
        this.billno = billno;
    }

    public Integer getWardcode() {
        return wardcode;
    }

    public void setWardcode(Integer wardcode) {
        this.wardcode = wardcode;
    }

    public String getPerformedbysub() {
        return performedbysub;
    }

    public void setPerformedbysub(String performedbysub) {
        this.performedbysub = performedbysub;
    }
}
