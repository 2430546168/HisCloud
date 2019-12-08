package com.yhhis.dao;

import com.yhhis.common.entity.WxPlayOrderEntity;
import com.yhhis.common.entity.WxpayOrdersEntity;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * 用于记录微信是否已经回调
 *
 * @author fengxian
 */
public interface WxpayOrdersDao {
    //根据订单号查询当前订单的状态 以及是否已经回调
    public WxpayOrdersEntity getOneOrder(WxpayOrdersEntity entity);

    //根据订单号修改订单状态
    public int updateOrdersStatus(WxpayOrdersEntity entity);

    //修改微信已经发送过回调
    public int updateOrdersNotifyurl(WxpayOrdersEntity entity);

    //添加订单
    public int insertOrders(WxpayOrdersEntity entity);

    public WxpayOrdersEntity getTradenoVisitno(@Param("visitno") String visitno, @Param("type") String type);

    List<Map<String, Object>> getAllTradeno(@Param("createTime") String createTime);
}
