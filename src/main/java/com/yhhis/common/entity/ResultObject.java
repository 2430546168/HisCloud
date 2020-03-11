package com.yhhis.common.entity;

public class ResultObject {
    private String doctorNo;
    private String imageUrl;

    public String getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(String doctorNo) {
        this.doctorNo = doctorNo;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ResultObject{" +
                "doctorNo='" + doctorNo + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
