package com.yhhis.controller.Doctor;


import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.StaffDict;
import com.yhhis.dao.StaffDictDao;
import com.yhhis.service.WXPayService;
import com.yhhis.service.impl.RedisServiceImpl;
import com.yhhis.service.impl.WxConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    private static int i = 1;

    @Resource
    private WebServices webServices;
    @Resource
    private WXPayService wxPayService;
    @Resource
    private RedisServiceImpl redisService;
    @Autowired
    private WxConfig wxConfig;
    @Autowired
    private StaffDictDao staffDictDao;

//    @RequestMapping(value = "/Verified", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult Verified(@RequestParam("deptCode") String deptCode) {
//        CommonResult commonResult;
//        List<String> allDoctors = staffDictDao.getAllDoctors(deptCode);
//        commonResult=CommonResult.success(allDoctors);
//        return commonResult;
//    }

//    @RequestMapping(value = "/Verified", method = RequestMethod.POST)
//    @ResponseBody
//    public String Verified(@RequestParam("openid") String openid,@RequestParam("Name")String name,@RequestParam("IdNumber")String idnum) {
//        CommonResult commonResult;
//        String s = redisService.get(openid);
//        String message = "";
//        RequestModel model = new RequestModel();
//        model.setGwUrl(wxConfig.getId_Url());
//        model.setAppkey(wxConfig.getId_Appkey());
//        Map queryMap = new HashMap();
//        queryMap.put("cardno",idnum); //访问参数
//        queryMap.put("name",name); //访问参数
//        model.setQueryParams(queryMap);
//        WxApiCall call = new WxApiCall();
//        call.setModel(model);
//        if (s == null) {
//            redisService.setTime(openid, (++i) + "", 60L);
//            message=call.request();
//        } else {
//            int s1 = Integer.parseInt(redisService.get(openid));
//            if (s1 <= 3) {
//                redisService.setTime(openid, (++i) + "", 60L);
//                message=call.request();
//            } else {
//                System.out.println("------------------频繁操作，请一个小时之后进行操作-------------");
//                message="频繁操作，请一个小时之后进行操作";
//                commonResult = CommonResult.failed(message);
//                LOGGER.debug("Verified fail:{}", message);
//                return commonResult.toString();
//            }
//        }
//        return message;
//    }

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
        }
    }
}