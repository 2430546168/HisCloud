package com.yhhis.service.impl;


import com.yhhis.common.entity.WxpayOrdersEntity;
import com.yhhis.dao.WxpayOrdersDao;
import com.yhhis.service.WxpayOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class WxpayOrdersServiceImpl implements WxpayOrdersService {
    @Autowired
    private WxpayOrdersDao dao;

    /**
     * 根据订单号查询当前订单的状态 以及是否已经回调
     *
     * @param entity
     * @return
     */
    @Override
    public WxpayOrdersEntity getOneOrder(WxpayOrdersEntity entity) {
        // TODO Auto-generated method stub
        return dao.getOneOrder(entity);
    }

    /**
     * 根据订单号修改订单状态
     *
     * @param entity
     * @return
     */
    @Override
    public int updateOrdersStatus(WxpayOrdersEntity entity) {
        // TODO Auto-generated method stub
        return dao.updateOrdersStatus(entity);
    }

    /**
     * 修改微信已经发送过回调
     *
     * @param entity
     * @return
     */
    @Override
    public int updateOrdersNotifyurl(WxpayOrdersEntity entity) {
        // TODO Auto-generated method stub
        return dao.updateOrdersNotifyurl(entity);
    }

    /**
     * 添加订单
     *
     * @param entity
     * @return
     */
    @Override
    public int insertOrders(WxpayOrdersEntity entity) {
        // TODO Auto-generated method stub
        return dao.insertOrders(entity);
    }

    @Override
    public WxpayOrdersEntity getTradenoVisitno(String visitno, String type) {
        return dao.getTradenoVisitno(visitno, type);
    }

    @Override
    public List<Map<String, Object>> getAllTradeno(String createTime) {
        return dao.getAllTradeno(createTime);
    }

}
