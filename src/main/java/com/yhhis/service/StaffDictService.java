package com.yhhis.service;

import com.yhhis.common.entity.StaffDict;

import java.util.List;

public interface StaffDictService {

    //查询所有咨询医生
    List<StaffDict> getAllDoctors(String deptCode);

    //个人更新在线状态
    int updateOnlineStatus(String userName, String onlineStatus);
}
