package com.yhhis.common.entity;

import java.io.Serializable;

public class WxUser implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 2053853117725529421L;
    int isonline;
    int isdoctor;
    private Integer id;
    private String openid;
    private String nickname;
    private String sex;
    private String country;
    private String province;
    private String city;
    private String headimgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public int getIsonline() {
        return isonline;
    }

    public void setIsonline(int isonline) {
        this.isonline = isonline;
    }

    public int getIsdoctor() {
        return isdoctor;
    }

    public void setIsdoctor(int isdoctor) {
        this.isdoctor = isdoctor;
    }

    @Override
    public String toString() {
        return "WxUserInfo [openid=" + openid + ", nickname=" + nickname
                + ", sex=" + sex + ", country=" + country + ", province="
                + province + ", city=" + city + ", headimgurl=" + headimgurl
                + ", isonline=" + isonline + ", isdoctor=" + isdoctor + "]";
    }
}
