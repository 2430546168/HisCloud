package com.yhhis.common.entity;

import java.io.Serializable;

public class ExamItems implements Serializable {

    private static final long serialVersionUID = 1L;
    private String examno;// 申请序号
    private Integer examitemno; // 项目序号
    private String examitem; // 检查项目
    private String examitemcode; // 项目代码
    private Integer costs; // 费用
    private Integer billingindicator;
    private String rcptno;// 收据号
    private String explanation; // 退费说明

    public ExamItems(String examno, Integer examitemno, String examitem, String examitemcode, Integer costs,
                     Integer billingindicator, String rcptno, String explanation) {
        super();
        this.examno = examno;
        this.examitemno = examitemno;
        this.examitem = examitem;
        this.examitemcode = examitemcode;
        this.costs = costs;
        this.billingindicator = billingindicator;
        this.rcptno = rcptno;
        this.explanation = explanation;
    }

    public ExamItems() {
        super();
    }

    public String getExamno() {
        return examno;
    }

    public void setExamno(String examno) {
        this.examno = examno;
    }

    public Integer getExamitemno() {
        return examitemno;
    }

    public void setExamitemno(Integer examitemno) {
        this.examitemno = examitemno;
    }

    public String getExamitem() {
        return examitem;
    }

    public void setExamitem(String examitem) {
        this.examitem = examitem;
    }

    public String getExamitemcode() {
        return examitemcode;
    }

    public void setExamitemcode(String examitemcode) {
        this.examitemcode = examitemcode;
    }

    public Integer getCosts() {
        return costs;
    }

    public void setCosts(Integer costs) {
        this.costs = costs;
    }

    public Integer getBillingindicator() {
        return billingindicator;
    }

    public void setBillingindicator(Integer billingindicator) {
        this.billingindicator = billingindicator;
    }

    public String getRcptno() {
        return rcptno;
    }

    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

}
