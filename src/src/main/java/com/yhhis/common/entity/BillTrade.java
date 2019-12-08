package com.yhhis.common.entity;

public class BillTrade {
    //备用
    private String preDepCode;
    private String docCode;
    private String visitDate;
    private int serialNo;
    private String orderClass;
    private double fee;

    //正在使用
    private String RecipeMsg;
    private String TotalFee;
    private String Dept;
    private String RecipeID;
    private String RecipeDate;
    private String Doctor;

    public BillTrade(String preDepCode, String docCode, String visitDate, int serialNo, String orderClass, double fee) {
        super();
        this.preDepCode = preDepCode;
        this.docCode = docCode;
        this.visitDate = visitDate;
        this.serialNo = serialNo;
        this.orderClass = orderClass;
        this.fee = fee;
    }

    public String getRecipeMsg() {
        return RecipeMsg;
    }

    public void setRecipeMsg(String recipeMsg) {
        RecipeMsg = recipeMsg;
    }

    public String getTotalFee() {
        return TotalFee;
    }

    public void setTotalFee(String totalFee) {
        TotalFee = totalFee;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getRecipeID() {
        return RecipeID;
    }

    public void setRecipeID(String recipeID) {
        RecipeID = recipeID;
    }

    public String getRecipeDate() {
        return RecipeDate;
    }

    public void setRecipeDate(String recipeDate) {
        RecipeDate = recipeDate;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getPreDepCode() {
        return preDepCode;
    }

    public void setPreDepCode(String preDepCode) {
        this.preDepCode = preDepCode;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
