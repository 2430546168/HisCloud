package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 医生开检查     患者检查
 *
 * @author Administrator
 */
public class PatientCheck implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String cardno;
    private String examsubclass;
    private String examclass;
    private String clindiag;
    private String performedby;
    private String patientsource;
    private String reqdatetime;
    private String reqdept;
    private String reqphysician;
    private String doctoruser;
    private String descriptioncode;
    private String projectname;
    private String visitno;
    private String visitdate;
    private String clinicno;

    public PatientCheck(String cardno, String examsubclass, String examclass, String clindiag, String performedby,
                        String patientsource, String reqdatetime, String reqdept, String reqphysician, String doctoruser,
                        String descriptioncode, String projectname, String visitno, String visitdate, String clinicno) {
        super();
        this.cardno = cardno;
        this.examsubclass = examsubclass;
        this.examclass = examclass;
        this.clindiag = clindiag;
        this.performedby = performedby;
        this.patientsource = patientsource;
        this.reqdatetime = reqdatetime;
        this.reqdept = reqdept;
        this.reqphysician = reqphysician;
        this.doctoruser = doctoruser;
        this.descriptioncode = descriptioncode;
        this.projectname = projectname;
        this.visitno = visitno;
        this.visitdate = visitdate;
        this.clinicno = clinicno;
    }

    public PatientCheck() {
        super();
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getExamsubclass() {
        return examsubclass;
    }

    public void setExamsubclass(String examsubclass) {
        this.examsubclass = examsubclass;
    }

    public String getExamclass() {
        return examclass;
    }

    public void setExamclass(String examclass) {
        this.examclass = examclass;
    }

    public String getClindiag() {
        return clindiag;
    }

    public void setClindiag(String clindiag) {
        this.clindiag = clindiag;
    }

    public String getPerformedby() {
        return performedby;
    }

    public void setPerformedby(String performedby) {
        this.performedby = performedby;
    }

    public String getPatientsource() {
        return patientsource;
    }

    public void setPatientsource(String patientsource) {
        this.patientsource = patientsource;
    }

    public String getReqdatetime() {
        return reqdatetime;
    }

    public void setReqdatetime(String reqdatetime) {
        this.reqdatetime = reqdatetime;
    }

    public String getReqdept() {
        return reqdept;
    }

    public void setReqdept(String reqdept) {
        this.reqdept = reqdept;
    }

    public String getReqphysician() {
        return reqphysician;
    }

    public void setReqphysician(String reqphysician) {
        this.reqphysician = reqphysician;
    }

    public String getDoctoruser() {
        return doctoruser;
    }

    public void setDoctoruser(String doctoruser) {
        this.doctoruser = doctoruser;
    }

    public String getDescriptioncode() {
        return descriptioncode;
    }

    public void setDescriptioncode(String descriptioncode) {
        this.descriptioncode = descriptioncode;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }

    public String getClinicno() {
        return clinicno;
    }

    public void setClinicno(String clinicno) {
        this.clinicno = clinicno;
    }


}
