package com.yhhis.common.entity;

public class ExamSubclassDict {
    private Integer serialno;//流水号
    private String examclassname;//检查类别名称
    private String examsubclassname;//检查子类名称
    private String inputcode;//输入码

    public ExamSubclassDict(Integer serialno, String examclassname, String examsubclassname, String inputcode) {
        super();
        this.serialno = serialno;
        this.examclassname = examclassname;
        this.examsubclassname = examsubclassname;
        this.inputcode = inputcode;
    }

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public String getExamclassname() {
        return examclassname;
    }

    public void setExamclassname(String examclassname) {
        this.examclassname = examclassname;
    }

    public String getExamsubclassname() {
        return examsubclassname;
    }

    public void setExamsubclassname(String examsubclassname) {
        this.examsubclassname = examsubclassname;
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }
}
