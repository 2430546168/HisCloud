package com.yhhis.controller.Doctorend;

import java.util.HashMap;
import java.util.Map;

import com.wxapi.WxApiCall.WxApiCall;
import com.wxapi.model.RequestModel;

public class TestNameAndIdno {


    public static void main(String[] args) {
        RequestModel model = new RequestModel();
        model.setGwUrl("https://way.jd.com/yingyan/idcard");
        model.setAppkey("56fc0f41cd3b25ad59dfeb485afc820a");
        Map queryMap = new HashMap();
        queryMap.put("cardno", "42118219961107371X"); //访问参数
        queryMap.put("name", "张胜贵"); //访问参数
        model.setQueryParams(queryMap);
        WxApiCall call = new WxApiCall();
        call.setModel(model);
        call.request();
        String request = call.request();
        System.out.println(request);
    }
}



