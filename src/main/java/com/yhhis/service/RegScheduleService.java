package com.yhhis.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 医生排班Service层
 * TODO
 */
public interface RegScheduleService {
    //总条数
    int getCount();

    //分页
    List<Map<String, Object>> getPage(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);
}
