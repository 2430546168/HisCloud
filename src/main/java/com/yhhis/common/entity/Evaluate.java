package com.yhhis.common.entity;


import com.yhhis.common.util.Util;

import java.io.Serializable;

/**
 * 评价实体类
 *
 * @author zzh
 */
public class Evaluate implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -7534505297631636458L;

    private Integer num;//主键
    private String patientid;//患者卡号
    private String doccode;//医生编号
    private String testno;//项目编号，检查结果单号 .
    private String pjdate;//评价时间
    private String content;//评价的内容
    private Integer deletion;//软删除，0代表删除，1代表可查看,2代表匿名评价
    private Integer tdpj;//态度评价 最大为5 范围1-5
    private Integer zdpj;//诊断评价，最大为5 范围1-5
    //新加 医生名称
    private String docname;//

    //新加
    private String hosdeptname;//科室名称
    private String sex;//患者性别
    private String clinicno;//门诊号
    private String birthdate;//患者生日
    private String idno;//身份证号
    private String amorpm;//时间段 分昼夜/白天
    private String cardname;//支付类别 如：微信支付
    private String name;//患者姓名
    private String regdate;//挂号时间
    private String regcode;//号源编号
    private String registerfee;//挂号订单价格
    private Integer age;//年龄
    private String visitno;//就诊序号
    private String hosdocname;//医生姓名
    private String openid;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getHosdeptname() {
        return hosdeptname;
    }

    public void setHosdeptname(String hosdeptname) {
        this.hosdeptname = hosdeptname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClinicno() {
        return clinicno;
    }

    public void setClinicno(String clinicno) {
        this.clinicno = clinicno;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAmorpm() {
        return amorpm;
    }

    public void setAmorpm(String amorpm) {
        this.amorpm = amorpm;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRegcode() {
        return regcode;
    }

    public void setRegcode(String regcode) {
        this.regcode = regcode;
    }

    public String getRegisterfee() {
        return registerfee;
    }

    public void setRegisterfee(String registerfee) {
        this.registerfee = registerfee;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public String getHosdocname() {
        return hosdocname;
    }

    public void setHosdocname(String hosdocname) {
        this.hosdocname = hosdocname;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getTestno() {
        return testno;
    }

    public void setTestno(String testno) {
        this.testno = testno;
    }

    //获取当前时间
    public String getPjdate() {
        String time = Util.getTime("yyyy-MM-dd hh:mm:ss");
        this.pjdate = time;
        return pjdate;
    }

    public void setPjdate(String pjdate) {
        this.pjdate = pjdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDeletion() {
        return deletion;
    }

    public void setDeletion(Integer deletion) {
        this.deletion = deletion;
    }

    public Integer getTdpj() {
        return tdpj;
    }

    public void setTdpj(Integer tdpj) {
        this.tdpj = tdpj;
    }

    public Integer getZdpj() {
        return zdpj;
    }

    public void setZdpj(Integer zdpj) {
        this.zdpj = zdpj;
    }
}
