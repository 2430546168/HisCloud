package com.yhhis.common.timing.service.impl;

import com.his.server.WebServices;
import com.yhhis.service.WXPayService;
import com.yhhis.service.impl.RedisServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 测试类
 *
 * @author 小贵
 */
public class DepartTiming {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartTiming.class);
    //    @Autowired
//    InitClassService initClassController;
    @Autowired
    RedisServiceImpl redisServiceImpl;
    @Resource
    WebServices webServices;
    @Autowired
    private WXPayService wxPayService;

    /**
     * 定时删除未支付订单 定时5分钟 根据卡号删除
     */
    public void deleteOrderUnpaid() {

    }

    /**
     * 定时退费（挂号没开处方的订单） 每天下午5点执行
     *
     * @throws Exception
     */
    public void refund() {
//        initClassController.init();// 更新检查类别 和 化验类别
        System.out.println("-------------------------------定时退款-------------------------------");
        String registerCanRefundPatients = webServices.getRegisterCanRefundPatients();
        JSONArray arry = JSONArray.fromObject(registerCanRefundPatients);
        for (int i = 0; i < arry.size(); i++) {
            JSONObject jsonObject = arry.getJSONObject(i);
            String visitdate = (String) jsonObject.get("visitdate");//就诊时间
            String clinicno = (String) jsonObject.get("clinicno");//订单号
            int registfee = (int) (((double) jsonObject.get("registfee")) * 100);//挂号费用
            String cardno = (String) jsonObject.get("cardno");//患者卡号
            String visitno = jsonObject.get("visitno").toString();//就诊序号
            try {
                System.out.println(visitdate + "---" + clinicno + "---" + registfee + "---" + cardno + "---" + visitno);
                refunds(visitdate, cardno, visitno, registfee, clinicno);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void refunds(String visitdate, String cardno, String visitno, int price, String tradeno) {
        String result = webServices.registerRefundWx(visitdate, cardno, visitno);
        switch (result) {
            case "1":
                Map<String, String> stringStringMap = wxPayService.reFund(price, tradeno);
                LOGGER.debug("registeredRefund success:{}", stringStringMap);
                break;
            case "0":
                LOGGER.debug("registeredRefund fail:{}", "0");
                break;
            case "-1":
                LOGGER.debug("registeredRefund exception:{}", "-1");
                break;
            default:
                LOGGER.debug("registeredRefund exception:{}", "");
        }
    }
}
