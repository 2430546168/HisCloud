package com.yhhis.dao;

import com.yhhis.common.entity.WXPayOrders;
import org.apache.ibatis.annotations.Param;

public interface IWXPayDao {

    /**
     * 创建订单
     *
     * @param order
     */
    void newOrder(WXPayOrders order);

    /**
     * 获取订单
     *
     * @param tradeno
     * @return
     */
    WXPayOrders getOrder(@Param("tradeno") String tradeno);

    /**
     * 退款操作
     *
     * @param tradeno
     * @param refundno
     */
    int reFund(@Param("tradeno") String tradeno, @Param("refundno") String refundno);

    void closeOrder(@Param("tradeno") String tradeno);

    void confirmPay(WXPayOrders order);

}
