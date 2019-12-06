package com.yhhis.dao;

import com.yhhis.common.entity.PresOrders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * PresOrders 表 处方总订单表
 *
 * @author zzh
 */
public interface PresOrdersDao {
    //循环添加
    public int addPresOrders(PresOrders presOrders);

    //修改处方总订单状态
    public int updateOrders(String tradeno);

    //删除订单
    public int deletePresOrders(@Param("tradeno") String tradeno);

    //获取订单详情根据流水号和患者卡号
    public List<Map<String, Object>> orderTradeno(@Param("serialno") String serialno, @Param("cardno") String cardno);

    //根据订单号获取详情
    public List<Map<String, Object>> findOrder(@Param("tradeno") String tradeno);

    //修改当前状态为 4 已退款
    public int updateStatus(@Param("tradeno") String tradeno);
}
