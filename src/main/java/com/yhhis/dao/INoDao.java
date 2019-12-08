package com.yhhis.dao;

import org.apache.ibatis.annotations.Param;

public interface INoDao {
    int getNo(@Param("type") String type);

    void updateNo(@Param("type") String type, @Param("max") long max);

    void newNo(@Param("type") String type);
}
