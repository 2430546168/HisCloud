package com.yhhis.service;


import com.yhhis.common.entity.WXPayOrders;

import java.util.HashMap;
import java.util.Map;

public interface WXPayService {
    /**
     * 创建订单
     *
     * @param order
     */
    public void newOrder(WXPayOrders order);

    public HashMap<String, String> unifiedOrder(String openid, String body, int fee, String domain, String ip,
                                                String tradeno);

    public HashMap<String, String> checkOrder(Map<String, String> notify, String str);

    public WXPayOrders getOrder(String tradeNo);

    /**
     * 退款
     *
     * @param tradeno
     * @return
     */
    public Map<String, String> reFund(int fee, String tradeno);

    public Map<String, String> closeOrder(String tradeno);

    public WXPayOrders queryOrder(String tradeno);

    /**
     * 0元时创建订单号
     *
     * @param fee
     * @return
     */
    public HashMap<String, String> createOrder(int fee);

    /**
     * 处方退费
     *
     * @param tradeno
     * @return
     */
    public Map<String, String> prescriptionRefund(String tradeno);

}
