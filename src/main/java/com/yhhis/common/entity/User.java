package com.yhhis.common.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 5513951459216990974L;
    String userName;
    String passWord;
    int userType;
    String docCode;
    String status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", passWord=" + passWord + ", userType=" + userType + ", docCode="
                + docCode + ", status=" + status + "]";
    }

}
