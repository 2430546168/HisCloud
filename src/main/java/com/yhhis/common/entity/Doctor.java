package com.yhhis.common.entity;

import java.io.Serializable;

public class Doctor implements Serializable {
    private static final long serialVersionUID = 1383315054503801936L;
    String unit;
    String doccode;
    String docname;
    String sex;
    String depcode;
    String depname;
    String specialty;
    String photo;
    String title;
    String openid;
    float infee;
    int intimes;
    String hisdoccode;

    public Doctor() {
        super();
    }

    public Doctor(String doccode, String docname, String sex, String depcode, String specialty, String photo,
                  String title) {
        super();
        this.doccode = doccode;
        this.docname = docname;
        this.sex = sex;
        this.depcode = depcode;
        this.specialty = specialty;
        this.photo = photo;
        this.title = title;
    }

    public Doctor(String unit, String doccode, String docname, String sex, String depcode, String depname,
                  String specialty, String photo, String title, float infee) {
        super();
        this.unit = unit;
        this.doccode = doccode;
        this.docname = docname;
        this.sex = sex;
        this.depcode = depcode;
        this.depname = depname;
        this.specialty = specialty;
        this.photo = photo;
        this.title = title;
        this.infee = infee;
    }

    public Doctor(String unit, String doccode, String docname, String sex, String depcode, String depname,
                  String specialty, String photo, String title, String openid, float infee, int intimes, String hisdoccode) {
        super();
        this.unit = unit;
        this.doccode = doccode;
        this.docname = docname;
        this.sex = sex;
        this.depcode = depcode;
        this.depname = depname;
        this.specialty = specialty;
        this.photo = photo;
        this.title = title;
        this.openid = openid;
        this.infee = infee;
        this.intimes = intimes;
        this.hisdoccode = hisdoccode;
    }

    @Override
    public String toString() {
        return "Doctorend [unit=" + unit + ", doccode=" + doccode + ", docname=" + docname + ", sex=" + sex + ", depcode="
                + depcode + ", depname=" + depname + ", specialty=" + specialty + ", photo=" + photo + ", title="
                + title + ", openid=" + openid + ", infee=" + infee + ", intimes=" + intimes + "]";
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public float getInfee() {
        return infee;
    }

    public void setInfee(float infee) {
        this.infee = infee;
    }

    public int getIntimes() {
        return intimes;
    }

    public void setIntimes(int intimes) {
        this.intimes = intimes;
    }

    public String getHisdoccode() {
        return hisdoccode;
    }

    public void setHisdoccode(String hisdoccode) {
        this.hisdoccode = hisdoccode;
    }

}
