package com.yhhis.controller.wxpay;

import com.alibaba.fastjson.JSON;
import com.yhhis.common.util.Util;
import com.yhhis.common.util.WxUtils;
import com.yhhis.service.WxUserService;
import com.yhhis.service.impl.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WxTemplate {
    @Resource
    WxUserService wxServiceimpl;
    @Autowired
    WxConfig wxConfig;


    /**
     * 注册成功通知模板
     *
     * @param openid
     * @param cardno
     * @param name
     */
    public static void sendRegistersTemplate(String openid, String cardno, String name) {
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        String token = WxUtils.getAccessToken();// 获取token
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", Util.getTime("yyyy-MM-dd HH:mm"));// 底部提示暂时为空
        remark.put("color", "#000000");
        date.put("remark", remark);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", name);
        keyword2.put("color", "#000000");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", cardno);
        keyword1.put("color", "#000000");
        date.put("keyword1", keyword1);

        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", "(恭喜建卡成功)");
        first.put("color", "#000000");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.REG_TEMPLATE_ID);
        String res = JSON.toJSONString(data);
        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");
    }

    /**
     * 挂号模板
     *
     * @param openid     患者的openid
     * @param name       患者的姓名
     * @param hosdepname 科室名称
     * @param docname    医生姓名
     * @param regdate1   就诊日期
     * @param amorpm     白天还是昼夜
     */
    public static void sendStrationsTemplate(String openid, String name, String hosdepname, String docname,
                                             String regdate1, String amorpm) {
        String token = WxUtils.getAccessToken();
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", "感谢您的使用");// 底部提示暂时为空
        remark.put("color", "#0044CB");
        date.put("remark", remark);

        Map<String, Object> keyword5 = new HashMap<String, Object>();
        keyword5.put("value", regdate1);
        keyword5.put("color", "#0044BB");
        date.put("keyword5", keyword5);

        Map<String, Object> keyword4 = new HashMap<String, Object>();
        keyword4.put("value", docname);
        keyword4.put("color", "#0044BB");
        date.put("keyword4", keyword4);

        Map<String, Object> keyword3 = new HashMap<String, Object>();
        keyword3.put("value", "一楼大厅西侧  " + hosdepname);
        keyword3.put("color", "#0044BB");
        date.put("keyword3", keyword3);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", "滦平县妇幼保健医院");
        keyword2.put("color", "#0044BB");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", name);
        keyword1.put("color", "#0044BB");
        date.put("keyword1", keyword1);

        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", "");
        first.put("color", "#FF3333");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.WXPAYSTRATION_TEMPLATE_ID);
        String res = JSON.toJSONString(data);
        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");
    }

    /**
     * 取消挂号模板
     *
     * @param openid     患者的openid
     * @param name       患者的姓名
     * @param hosdepname 科室名称 *
     * @param docname    医生姓名 *
     * @param regdate    取消日期 *
     * @param amorpm     白天还是昼夜 * registerfee 支付金额*
     */
    public static void sendRefundTemplate(String openid, String name, String hosdepname, String docname, String regdate,
                                          String amorpm, String registerfee) {
        String token = WxUtils.getAccessToken();
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        // 获取token
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", "小贴士：如果您是线上支付，请您在待就诊之前退款。");// 底部提示暂时为空
        remark.put("color", "#0044CB");
        date.put("remark", remark);

        Map<String, Object> keyword5 = new HashMap<String, Object>();
        keyword5.put("value", registerfee);// 退款价格
        keyword5.put("color", "#0044BB");
        date.put("keyword5", keyword5);

        Map<String, Object> keyword4 = new HashMap<String, Object>();
        keyword4.put("value", "微信支付");
        keyword4.put("color", "#0044BB");
        date.put("keyword4", keyword4);

        Map<String, Object> keyword3 = new HashMap<String, Object>();
        keyword3.put("value", regdate + " " + amorpm);
        keyword3.put("color", "#0044BB");
        date.put("keyword3", keyword3);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", docname);
        keyword2.put("color", "#0044BB");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", hosdepname);
        keyword1.put("color", "#0044BB");
        date.put("keyword1", keyword1);
        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", "您的预约已取消！");
        first.put("color", "#FF3333");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.REFUNDWX_TEMPLATE_ID);
        String res = JSON.toJSONString(data);
        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");
    }

    /**
     * 开处方成功通知
     *
     * @param openid
     * @param orderby    就诊科室
     * @param doctorname 医生姓名
     * @param visitdate  就诊日期
     * @param serialno   流水号
     */
    public static void sendprescriptionTemplate(String openid, String orderby, String doctorname, String visitdate,
                                                String serialno) {
        String token = WxUtils.getAccessToken();
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        // 获取token
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", "感谢您的使用");//
        remark.put("color", "#0044CB");
        date.put("remark", remark);

        Map<String, Object> keyword5 = new HashMap<String, Object>();
        keyword5.put("value", serialno);// 流水号
        keyword5.put("color", "#0044BB");
        date.put("keyword5", keyword5);

        Map<String, Object> keyword4 = new HashMap<String, Object>();
        keyword4.put("value", visitdate);// 就诊日期
        keyword4.put("color", "#0044BB");
        date.put("keyword4", keyword4);

        Map<String, Object> keyword3 = new HashMap<String, Object>();
        keyword3.put("value", doctorname);// 医生姓名
        keyword3.put("color", "#0044BB");
        date.put("keyword3", keyword3);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", orderby);// 就诊科室
        keyword2.put("color", "#0044BB");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", "滦平妇幼保健医院");
        keyword1.put("color", "#0044BB");
        date.put("keyword1", keyword1);
        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", "您的处方已经开具！");
        first.put("color", "#FF3333");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.PRESCRIPTION_SUCCESS_ID);
        String res = JSON.toJSONString(data);

        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");
    }
    // kai

    /**
     * 通知（检查）
     *
     * @param username   患者名字
     * @param visitdate  时间
     * @param items      子项目
     * @param tradeno    订单号
     * @param openid
     * @param remarkText remark 尾部提示信息 value
     * @param firstText  first 头部value
     */
    public static void sendCheckTemplate(String username, String visitdate, String items, String tradeno, String openid,
                                         String remarkText, String firstText) {
        String token = WxUtils.getAccessToken();
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        // 获取token
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", remarkText);// 请去检查科报到。
        remark.put("color", "#0044BB");
        date.put("remark", remark);

        Map<String, Object> keyword4 = new HashMap<String, Object>();
        keyword4.put("value", tradeno);// 检查单号--订单号
        keyword4.put("color", "#0044BB");
        date.put("keyword4", keyword4);

        Map<String, Object> keyword3 = new HashMap<String, Object>();
        keyword3.put("value", items);// 检查项目
        keyword3.put("color", "#0044BB");
        date.put("keyword3", keyword3);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", visitdate);// 检查时间
        keyword2.put("color", "#0044BB");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", username);// 就诊人
        keyword1.put("color", "#0044BB");
        date.put("keyword1", keyword1);
        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", firstText);// firstText 您的检查已经开具！
        first.put("color", "#FF3333");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.CHECK_SUCCESS_ID);
        String res = JSON.toJSONString(data);
        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");

    }

    /**
     * 化验-检验）
     *
     * @param username   患者名字
     * @param visitdate  时间
     * @param items      子项目
     * @param tradeno    订单号
     * @param openid
     * @param remarkText remark 尾部提示信息 value
     * @param firstText  first 头部value
     */
    public static void sendChemicalexamTemplate(String username, String visitdate, String items, String tradeno,
                                                String openid, String remarkText, String firstText) {
        String token = WxUtils.getAccessToken();
        Map<String, Map<String, Object>> date = new HashMap<String, Map<String, Object>>();
        // 获取token
        Map<String, Object> remark = new HashMap<String, Object>();
        remark.put("value", remarkText);//
        remark.put("color", "#0044CB");
        date.put("remark", remark);

        Map<String, Object> keyword4 = new HashMap<String, Object>();
        keyword4.put("value", tradeno);
        keyword4.put("color", "#0044BB");
        date.put("keyword4", keyword4);

        Map<String, Object> keyword3 = new HashMap<String, Object>();
        keyword3.put("value", items);// 检查项目
        keyword3.put("color", "#0044BB");
        date.put("keyword3", keyword3);

        Map<String, Object> keyword2 = new HashMap<String, Object>();
        keyword2.put("value", visitdate);// 就诊日期
        keyword2.put("color", "#0044BB");
        date.put("keyword2", keyword2);

        Map<String, Object> keyword1 = new HashMap<String, Object>();
        keyword1.put("value", username);// 患者姓名
        keyword1.put("color", "#0044BB");
        date.put("keyword1", keyword1);
        Map<String, Object> first = new HashMap<String, Object>();
        first.put("value", firstText);
        first.put("color", "#FF3333");
        date.put("first", first);

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", date);
        data.put("touser", openid);
        data.put("template_id", WxConfig.CHEMICALEXAM_SUCCESS_ID);
        String res = JSON.toJSONString(data);
        WxUtils.doPost(WxConfig.TEMPLATE_URL.replace("ACCESS_TOKEN", token), res, null, null, "utf-8");
    }
}
