package com.yhhis.service.impl;

import com.yhhis.common.entity.Logger;
import com.yhhis.common.entity.WXPayOrders;
import com.yhhis.common.entity.WxpayOrdersEntity;
import com.yhhis.common.sdk.WXPay;
import com.yhhis.common.sdk.WXPayConfigImpl;
import com.yhhis.common.sdk.WXPayConstants.SignType;
import com.yhhis.common.sdk.WXPayUtil;
import com.yhhis.dao.IWXPayDao;
import com.yhhis.service.PresOrdersService;
import com.yhhis.service.WXPayService;
import com.yhhis.service.WxpayOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WXPayServiceImpl implements WXPayService {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    WxConfig config;
    @Resource
    IWXPayDao wxpayDao;
    @Autowired
    RedisServiceImpl redisServiceImpl;
    @Autowired
    private PresOrdersService presordersservice;
    @Autowired
    private WxpayOrdersService wxpayOrdersService;

    // 统一下单
    public HashMap<String, String> unifiedOrder(String openid, String body, int fee, String domain, String ip,
                                                String tradeno) {
        String backurl = "/paynotify.do";
        switch (body) {
            case "微信挂号":
                break;
            case "微信处方":
                backurl = "/cfpaynotify.do";
            default:
                break;
        }
        try {

            WXPayConfigImpl payconfig = WXPayConfigImpl.getInstance(config.getKey(), config.getAppID(),
                    config.getMchID(), config.getCertLocalPath());
            WXPay wxpay = new WXPay(payconfig);
            HashMap<String, String> data = new HashMap<String, String>();
            data.put("body", body);
            data.put("openid", openid);
            data.put("out_trade_no", tradeno);
            data.put("device_info", "");
            data.put("fee_type", "CNY");
            data.put("total_fee", fee + "");
            data.put("spbill_create_ip", ip);
            data.put("notify_url", domain + backurl);
            data.put("trade_type", "JSAPI");
            System.out.println(data);
            Map<String, String> r = wxpay.unifiedOrder(data);
            System.out.println(r);
            if (r.get("return_code").equals("SUCCESS") && r.get("result_code").equals("SUCCESS")) {
                HashMap<String, String> paysign = new HashMap<String, String>();
                paysign.put("appId", config.getAppID());
                paysign.put("timeStamp", WXPayUtil.getCurrentTimestamp() + "");
                paysign.put("nonceStr", WXPayUtil.generateUUID());
                paysign.put("package", "prepay_id=" + r.get("prepay_id"));
                paysign.put("signType", "MD5");
                paysign.put("paySign", WXPayUtil.generateSignature(paysign, config.getKey(), SignType.MD5));
                paysign.put("tradeno", tradeno);
                WxpayOrdersEntity wxpayOrders = new WxpayOrdersEntity();
                wxpayOrders.setNotifyurl(0);// 0未回调
                wxpayOrders.setStatus(0);// 状态0
                wxpayOrders.setTradeno(tradeno);// 订单号
                // 添加订单到本地
                int insertOrders = wxpayOrdersService.insertOrders(wxpayOrders);
                System.out.println(insertOrders);
                if (insertOrders < 1) {
                    return null;
                }
                return paysign;
            }
        } catch (Exception e) {
            logger.info("统一下单：方法：unifiedOrder异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    // 查询订单
    public WXPayOrders queryOrder(String tradeno) {
        try {
            WXPayConfigImpl payconfig = WXPayConfigImpl.getInstance(config.getKey(), config.getAppID(),
                    config.getMchID(), config.getCertLocalPath());
            WXPay wxpay = new WXPay(payconfig);
            HashMap<String, String> data = new HashMap<String, String>();
            data.put("out_trade_no", tradeno);
            WXPayOrders order = wxpayDao.getOrder(tradeno);
            Map<String, String> r = wxpay.orderQuery(data);
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddhhmmss");
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            if (r.get("return_code").equals("SUCCESS") && r.get("result_code").equals("SUCCESS")) {
                if (r.get("trade_state").equals("SUCCESS")) {
                    if (order.getStatus() != 1) {
                        String datetime = r.get("time_end");
                        try {
                            Date date = format1.parse(datetime);
                            datetime = format2.format(date);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        order.setTransactionid(r.get("transaction_id"));
                        order.setEndtiem(datetime);
                        order.setStatus(1);
                        wxpayDao.confirmPay(order);
                    }
                } else if (r.get("trade_state").equals("REFUND")) {
                    if (order.getStatus() != 2) {
                        String datetime = r.get("time_end");
                        try {
                            Date date = format1.parse(datetime);
                            datetime = format2.format(date);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        order.setStatus(2);
                        wxpayDao.reFund(tradeno, order.getRefundno());
                    }
                } else {
                    order.setStatus(-1);
                }
            }
            return order;
        } catch (Exception e) {
            logger.info("查询订单：方法：queryOrder异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    // 关闭订单
    public Map<String, String> closeOrder(String tradeno) {
        WXPayConfigImpl payconfig;
        try {
            payconfig = WXPayConfigImpl.getInstance(config.getKey(), config.getAppID(), config.getMchID(),
                    config.getCertLocalPath());
            WXPay wxpay = new WXPay(payconfig);
            HashMap<String, String> data = new HashMap<String, String>();
            data.put("out_trade_no", tradeno);
            Map<String, String> r = wxpay.closeOrder(data);
            if (r.get("return_code").equals("SUCCESS") && r.get("result_code").equals("SUCCESS")) {
                wxpayDao.closeOrder(tradeno);
            }
            System.out.println(r);
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 退款
    public Map<String, String> reFund(int fee, String tradeno) {
        WXPayConfigImpl payconfig;
        try {
            payconfig = WXPayConfigImpl.getInstance(config.getKey(), config.getAppID(), config.getMchID(),
                    config.getCertLocalPath());
            WXPay wxpay = new WXPay(payconfig);
            HashMap<String, String> data = new HashMap<String, String>();
////			// 修改成 去查redis
////			String redisOrder = redisServiceImpl.get(key);
////			// 有数据
////			if (redisOrder != null && !redisOrder.equals("")) {
//				List<HashMap> jsonStrToArray = JSON.parseArray("[" + redisOrder + "]", HashMap.class);
//				int fee = (int) (Float.parseFloat(jsonStrToArray.get(0).get("registerfee").toString()) * 100);
            String refundno = "T" + tradeno;
            data.put("op_user_id", config.getMchID());// 商户号
            data.put("out_trade_no", tradeno);// 微信订单号
            data.put("out_refund_no", refundno);// 商户退款单号
            data.put("total_fee", fee + "");// 订单金额
            data.put("refund_fee", fee + "");// 退款金额
            data.put("refund_fee_type", "CNY");
            Map<String, String> r = wxpay.refund(data);
            if (r.get("return_code").equals("SUCCESS") && r.get("result_code").equals("SUCCESS")) {
                return r;
            } else {
                return null;
            }
//			} else {
//				return null;
//			}
        } catch (Exception e) {
            logger.info("退款：方法：reFund异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    // 支付完成通知校验
    public HashMap<String, String> checkOrder(Map<String, String> notify, String str) {
        HashMap<String, String> res = new HashMap<String, String>();
        try {
            if (WXPayUtil.isSignatureValid(notify, config.getKey())) {
                if (str == "gh") {
                    WXPayOrders order = wxpayDao.getOrder(notify.get("out_trade_no"));
                    if (order != null) {
                        if (order.getStatus() == 0) {
                            if (order.getTotalfee() == Integer.parseInt(notify.get("total_fee"))) {
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddhhmmss");
                                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                String datetime = notify.get("time_end");
                                try {
                                    Date date = format1.parse(datetime);
                                    datetime = format2.format(date);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                                order.setTransactionid(notify.get("transaction_id"));
                                order.setEndtiem(datetime);
                                order.setStatus(1);
                            }
                        }
                        res.put("code", String.valueOf(order.getStatus()));
                        res.put("msg", "OK");
                    } else {
                        res.put("code", "-1");
                        res.put("msg", "未找到订单");
                    }

                } else if (str == "kcf") {
                    List<Map<String, Object>> findOrder = presordersservice.findOrder(notify.get("out_trade_no"));
                    if (findOrder != null && findOrder.size() > 0) {
                        if (findOrder.get(0).get("status").toString().equals("0")) {
                            res.put("code", "1");
                            res.put("msg", "OK");
                        } else {
                            res.put("code", "-1");
                            res.put("msg", "未找到订单");
                        }

                    } else {
                        res.put("code", "-1");
                        res.put("msg", "未找到订单");
                    }
                }
            } else {
                res.put("code", "-1");
                res.put("msg", "签名错误");
            }

        } catch (Exception e) {
            logger.info("支付完成通知校验：方法：checkOrder异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        }
        return res;
    }

    public WXPayOrders getOrder(String tradeNo) {
        try {
            return wxpayDao.getOrder(tradeNo);
        } catch (Exception e) {
            return null;
        }
    }

    /*
     * public HashMap<String, String> UserRedemption(String openid, double fee)
     * { // TODO Auto-generated method stub return null; }
     */
    @Override
    public HashMap<String, String> createOrder(int fee) {
        // TODO Auto-generated method stub
        return null;
    }

    // 创建订单
    @Override
    public void newOrder(WXPayOrders order) {
        wxpayDao.newOrder(order);

    }

    /**
     * 处方退款 去redis查
     */
    @Override
    public Map<String, String> prescriptionRefund(String tradeno) {
        WXPayConfigImpl payconfig;
        try {
            payconfig = WXPayConfigImpl.getInstance(config.getKey(), config.getAppID(), config.getMchID(),
                    config.getCertLocalPath());
            WXPay wxpay = new WXPay(payconfig);
            HashMap<String, String> data = new HashMap<String, String>();
            String redisFee = redisServiceImpl.get(tradeno);
            if (redisFee != null && !redisFee.equals("")) {
                String refundno = "T" + tradeno;
                data.put("out_trade_no", tradeno);
                data.put("out_refund_no", refundno);
                int fee = (int) (Float.parseFloat(redisFee) * 100);
                // TODO
                data.put("total_fee", fee + "");// 挂号费用
                data.put("refund_fee", fee + "");
                data.put("refund_fee_type", "CNY");
                data.put("op_user_id", config.getMchID());
                Map<String, String> r = wxpay.refund(data);
                if (r.get("return_code").equals("SUCCESS") && r.get("result_code").equals("SUCCESS")) {
                    return r;
                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (Exception e) {
            logger.info("处方退款：方法：prescriptionRefund异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
            return null;
        }
    }

}
