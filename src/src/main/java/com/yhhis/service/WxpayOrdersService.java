package com.yhhis.service;


import com.yhhis.common.entity.WxpayOrdersEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 用于记录微信是否已经回调
 *
 * @author fengxian
 */
public interface WxpayOrdersService {
    /**
     * 根据订单号查询当前订单的状态 以及是否已经回调
     *
     * @param entity
     * @return
     */
    public WxpayOrdersEntity getOneOrder(WxpayOrdersEntity entity);

    /**
     * 根据订单号修改订单状态
     *
     * @param entity
     * @return
     */
    public int updateOrdersStatus(WxpayOrdersEntity entity);

    /**
     * 修改微信已经发送过回调
     *
     * @param entity
     * @return
     */
    public int updateOrdersNotifyurl(WxpayOrdersEntity entity);

    /**
     * 添加订单
     *
     * @param entity
     * @return
     */
    public int insertOrders(WxpayOrdersEntity entity);

    public WxpayOrdersEntity getTradenoVisitno(String visitno, String type);

    List<Map<String, Object>> getAllTradeno(@Param("createTime") String createTime);

}
