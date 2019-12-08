package com.yhhis.common.entity;


import com.yhhis.common.util.Util;

import java.io.Serializable;

/**
 * 关注表
 *
 * @author zzh
 */
public class FollowEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -362144881615584442L;
    private Integer num;//主键
    private String openid;//患者openid
    private String doccode;//医生编号
    private String followtime;//关注时间
    private String hosdocname;//医生姓名
    private String hosdepname;//门诊
    private String name;//患者姓名
    private String specialty;//医生擅长
    private String cardno;//患者卡号


    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHosdocname() {
        return hosdocname;
    }

    public void setHosdocname(String hosdocname) {
        this.hosdocname = hosdocname;
    }

    public String getHosdepname() {
        return hosdepname;
    }

    public void setHosdepname(String hosdepname) {
        this.hosdepname = hosdepname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollowtime() {
        String time = Util.getTime("yyyy-MM-dd hh:mm:ss");
        this.followtime = time;
        return followtime;
    }

    public void setFollowtime(String followtime) {
        this.followtime = followtime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }
}
