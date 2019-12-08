package com.yhhis.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * pc端所有挂号的订单
 *
 * @author fengxian
 */
public interface RegisterOrderDao {
    //总条数
    int getRegisterOrderCount();

    //分页
    List<Map<String, Object>> getRegisterOrderPage(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);
}
