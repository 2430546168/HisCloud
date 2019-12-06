package com.yhhis.common.entity;

import java.io.Serializable;

public class ExamRptPattern implements Serializable {

    private static final long serialVersionUID = 1L;
    private String examclass; // 检查类别
    private String examsubclass; // 检查子类
    private String descitem; // 描述项目
    private String descname;// 描述名称
    private String dexcription; // 描述
    private String dexcriptiondoce; // 描述代码
    private String inputcode; // 描述名称输入码
    private String doctorteshu; // 指定医生 指定项目
    private Integer serialno; // 序号

    public ExamRptPattern(String examclass, String examsubclass, String descitem, String descname, String dexcription,
                          String dexcriptiondoce, String inputcode, String doctorteshu, Integer serialno) {
        super();
        this.examclass = examclass;
        this.examsubclass = examsubclass;
        this.descitem = descitem;
        this.descname = descname;
        this.dexcription = dexcription;
        this.dexcriptiondoce = dexcriptiondoce;
        this.inputcode = inputcode;
        this.doctorteshu = doctorteshu;
        this.serialno = serialno;
    }

    public ExamRptPattern() {
        super();
    }

    public String getExamclass() {
        return examclass;
    }

    public void setExamclass(String examclass) {
        this.examclass = examclass;
    }

    public String getExamsubclass() {
        return examsubclass;
    }

    public void setExamsubclass(String examsubclass) {
        this.examsubclass = examsubclass;
    }

    public String getDescitem() {
        return descitem;
    }

    public void setDescitem(String descitem) {
        this.descitem = descitem;
    }

    public String getDescname() {
        return descname;
    }

    public void setDescname(String descname) {
        this.descname = descname;
    }

    public String getDexcription() {
        return dexcription;
    }

    public void setDexcription(String dexcription) {
        this.dexcription = dexcription;
    }

    public String getDexcriptiondoce() {
        return dexcriptiondoce;
    }

    public void setDexcriptiondoce(String dexcriptiondoce) {
        this.dexcriptiondoce = dexcriptiondoce;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }

    public String getDoctorteshu() {
        return doctorteshu;
    }

    public void setDoctorteshu(String doctorteshu) {
        this.doctorteshu = doctorteshu;
    }

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

}
