package com.yhhis.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//TODO
public interface RegSchduleDao {
    //总条数
    public int getCount();

    //分页
    public List<Map<String, Object>> getPage(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);
}
