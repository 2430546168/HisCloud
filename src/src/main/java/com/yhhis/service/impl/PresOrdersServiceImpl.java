package com.yhhis.service.impl;


import com.yhhis.common.entity.PresOrders;
import com.yhhis.dao.PresOrdersDao;
import com.yhhis.service.PresOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * PresOrders 表 处方总订单表
 *
 * @author zzh
 */
@Service
public class PresOrdersServiceImpl implements PresOrdersService {
    @Autowired
    PresOrdersDao presOrdersDao;

    /**
     * 循环添加处方总订单
     */
    @Override
    public int addPresOrders(PresOrders presOrders) {
        return presOrdersDao.addPresOrders(presOrders);
    }

    /**
     * 修改处方总订单状态
     */
    @Override
    public int updateOrders(String tradeno) {
        return presOrdersDao.updateOrders(tradeno);
    }

    /**
     * 删除订单
     */
    @Override
    public int deletePresOrders(String tradeno) {
        return presOrdersDao.deletePresOrders(tradeno);
    }

    /**
     * 获取订单详情根据流水号和患者卡号
     */
    @Override
    public List<Map<String, Object>> orderTradeno(String serialno, String cardno) {


        return presOrdersDao.orderTradeno(serialno, cardno);
    }

    /**
     * 根据订单号获取详情
     */
    @Override
    public List<Map<String, Object>> findOrder(String tradeno) {
        return presOrdersDao.findOrder(tradeno);
    }

    /**
     * 修改当前状态为 4 已退款
     */
    @Override
    public int updateStatus(String tradeno) {
        // TODO Auto-generated method stub
        return presOrdersDao.updateStatus(tradeno);
    }

}
