package com.yhhis.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 医生的粉丝
 *
 * @author fengxian
 */
public interface DoctorFollowDao {
    //查询医生的粉丝
    List<Map<String, Object>> getDoctorsFans(@Param("doccode") String doccode, @Param("size") int size);

}
