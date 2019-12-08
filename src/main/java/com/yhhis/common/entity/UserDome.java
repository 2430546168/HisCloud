package com.yhhis.common.entity;

import java.io.Serializable;

/**
 * 根据身份证获取用户对应的字段
 *
 * @author zzh
 */
public class UserDome implements Serializable {
    private static final long serialVersionUID = -4628253574321186799L;

    private String area;// 地址
    private String sex;
    private String birthday;// 生日
    private String verify;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

}
