package com.yhhis.dao;

import com.yhhis.common.entity.StaffDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDictDao {
    List<StaffDict> getAllDoctors(@Param("deptCode") String deptCode);

    int updateOnlineStatus(@Param("userName") String userName, @Param("onlineStatus") String onlineStatus);
}
