package com.yhhis.service;

import com.yhhis.common.entity.PresOrders;

import java.util.List;
import java.util.Map;

/**
 * PresOrders 表 处方总订单表
 *
 * @author zzh
 */
public interface PresOrdersService {
    //循环添加
    public int addPresOrders(PresOrders presOrders);

    //修改处方总订单状态
    public int updateOrders(String tradeno);

    //删除订单
    public int deletePresOrders(String tradeno);

    //获取订单详情根据流水号和患者卡号
    public List<Map<String, Object>> orderTradeno(String serialno, String cardno);

    /**
     * 根据订单号 获取详情
     *
     * @param tradeno
     * @return
     */
    public List<Map<String, Object>> findOrder(String tradeno);

    /**
     * 修改当前状态为 4 已退款
     *
     * @param tradeno
     * @return
     */
    public int updateStatus(String tradeno);


}
