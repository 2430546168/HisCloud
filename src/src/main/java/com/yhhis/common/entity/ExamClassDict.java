package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * com.his 表 EXAM_CLASS_DICT 检查类别
 *
 * @author zzh
 */
public class ExamClassDict implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7496689626671579754L;
    private Integer serialno;// 序号
    private String examclasscode;// 检查类别代码
    private String examclassname;// 检查类别名称
    private String inputcode;// 输入码
    private String performby;// 检验科室编号
    private String printstyle;//
    private Integer specialtiesdept;
    private String loacalidclass;
    private String wardcode;
    private String httpip;
    private String memo;
    private String outpperform;// 使用于门诊检查不可选控制

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public String getExamclasscode() {
        return examclasscode;
    }

    public void setExamclasscode(String examclasscode) {
        this.examclasscode = examclasscode;
    }

    public String getExamclassname() {
        return examclassname;
    }

    public void setExamclassname(String examclassname) {
        this.examclassname = examclassname;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getPerformby() {
        return performby;
    }

    public void setPerformby(String performby) {
        this.performby = performby;
    }

    public String getPrintstyle() {
        return printstyle;
    }

    public void setPrintstyle(String printstyle) {
        this.printstyle = printstyle;
    }

    public Integer getSpecialtiesdept() {
        return specialtiesdept;
    }

    public void setSpecialtiesdept(Integer specialtiesdept) {
        this.specialtiesdept = specialtiesdept;
    }

    public String getLoacalidclass() {
        return loacalidclass;
    }

    public void setLoacalidclass(String loacalidclass) {
        this.loacalidclass = loacalidclass;
    }

    public String getWardcode() {
        return wardcode;
    }

    public void setWardcode(String wardcode) {
        this.wardcode = wardcode;
    }

    public String getHttpip() {
        return httpip;
    }

    public void setHttpip(String httpip) {
        this.httpip = httpip;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOutpperform() {
        return outpperform;
    }

    public void setOutpperform(String outpperform) {
        this.outpperform = outpperform;
    }

}
