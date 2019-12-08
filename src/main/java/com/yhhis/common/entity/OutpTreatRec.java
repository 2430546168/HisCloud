package com.yhhis.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * com.his 表 OUTP_TREAT_REC
 *
 * @author zzh
 */
public class OutpTreatRec implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7340664239887138384L;
    private Date visitdate;//就诊时间
    private Integer visitno;//就诊序号
    private String serialno;//流水号
    private Integer itemno;//项目序号
    private String itemcode;//项目编码
    private String itemname;//项目名称
    private String itemspec;//项目规格
    private String units;//单位
    private BigDecimal amount;//数量
    private String frequency;//频次
    private String ferformedby;//执行科室
    private BigDecimal costs;//计价费用
    private BigDecimal charges;//实收费用
    private Integer chargeindicator;//收费标记 0未收费，1已收费
    private String appointno;//申请号
    private Integer appointitemno;//申请明细号
    private String freqdetail;//执行时间详情描述
    private String wardcode;//护理单元
    private String explanation;//申请退费理由
    private String rcptno;//收费单据号
    private Integer billvisitno;//收费序号
    private Date billvisitdate;//收费日期
    private String operatortrturn;//退费医生
    private Date datetrturn;//退费日期
    private String performednurse;//执行护士
    private Date pernursedate;//护士执行时间

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

    public Integer getItemno() {
        return itemno;
    }

    public void setItemno(Integer itemno) {
        this.itemno = itemno;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFerformedby() {
        return ferformedby;
    }

    public void setFerformedby(String ferformedby) {
        this.ferformedby = ferformedby;
    }

    public BigDecimal getCosts() {
        return costs;
    }

    public void setCosts(BigDecimal costs) {
        this.costs = costs;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public Integer getChargeindicator() {
        return chargeindicator;
    }

    public void setChargeindicator(Integer chargeindicator) {
        this.chargeindicator = chargeindicator;
    }

    public String getAppointno() {
        return appointno;
    }

    public void setAppointno(String appointno) {
        this.appointno = appointno;
    }

    public Integer getAppointitemno() {
        return appointitemno;
    }

    public void setAppointitemno(Integer appointitemno) {
        this.appointitemno = appointitemno;
    }

    public String getFreqdetail() {
        return freqdetail;
    }

    public void setFreqdetail(String freqdetail) {
        this.freqdetail = freqdetail;
    }

    public String getWardcode() {
        return wardcode;
    }

    public void setWardcode(String wardcode) {
        this.wardcode = wardcode;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getRcptno() {
        return rcptno;
    }

    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    public Integer getBillvisitno() {
        return billvisitno;
    }

    public void setBillvisitno(Integer billvisitno) {
        this.billvisitno = billvisitno;
    }

    public Date getBillvisitdate() {
        return billvisitdate;
    }

    public void setBillvisitdate(Date billvisitdate) {
        this.billvisitdate = billvisitdate;
    }

    public String getOperatortrturn() {
        return operatortrturn;
    }

    public void setOperatortrturn(String operatortrturn) {
        this.operatortrturn = operatortrturn;
    }

    public Date getDatetrturn() {
        return datetrturn;
    }

    public void setDatetrturn(Date datetrturn) {
        this.datetrturn = datetrturn;
    }

    public String getPerformednurse() {
        return performednurse;
    }

    public void setPerformednurse(String performednurse) {
        this.performednurse = performednurse;
    }

    public Date getPernursedate() {
        return pernursedate;
    }

    public void setPernursedate(Date pernursedate) {
        this.pernursedate = pernursedate;
    }


}
