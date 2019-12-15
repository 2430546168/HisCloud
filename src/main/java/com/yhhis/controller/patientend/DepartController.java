//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.util.Util;
import com.yhhis.common.util.WxUtils;
import com.yhhis.service.WxUserService;
import com.yhhis.service.impl.RedisServiceImpl;
import com.yhhis.service.impl.WxConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tempurl.NWebservice;
import org.tempurl.NWebserviceSoap;

@Controller
@RequestMapping({"/depart"})
public class DepartController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartController.class);
    @Autowired
    WxConfig wxConfig;
    @Autowired
    WxUserService wxUserService;
    @Autowired
    private RedisServiceImpl redisService;
    @Resource
    WebServices webServices;

    public DepartController() {
    }

    @RequestMapping(
            value = {"/GetRegDeptList"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public void GetRegDeptList(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        String result = "";

        try {
            writer = response.getWriter();
            result = this.redisService.get("departs");
            if (result == null) {
                NWebserviceSoap Bing = (new NWebservice()).getNWebserviceSoap();
                String str = Bing.getregdeptlist("<Request><TypeID></TypeID><ParDeptID>0</ParDeptID><UserID></UserID></Request>");
                JSONObject xmlJSONObj = XML.toJSONObject(str);
                String jsonPrettyPrintString = xmlJSONObj.toString(4);
                Map<String, Object> leftDepart = this.leftDepart("[" + jsonPrettyPrintString + "]");
                result = JSON.toJSONString(leftDepart);
                this.redisService.set("departs", result);
            }
        } catch (Exception var13) {
            LOGGER.info("url:GetRegDeptList。message:查询挂号科室  首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(var13.getMessage(), var13);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }

    }

    public Map<String, Object> leftDepart(String str) throws JsonParseException, JsonMappingException, IOException {
        HashMap map = new HashMap();

        try {
            Map<String, Object> jsonStrToArray = Util.jsonStrToArray(str);
            Map<String, Object> mmm = new HashMap();
            List<Map<String, Object>> resmap = new ArrayList();
            List<Map<String, Object>> resmap1 = new ArrayList();
            List<Map<String, Object>> resmap2 = new ArrayList();
            List<Map<String, Object>> resmap3 = new ArrayList();
            if (jsonStrToArray != null && jsonStrToArray.size() > 0) {
                Map<String, Object> jsonStrToMap = (Map)jsonStrToArray.get("Response");
                String Items = jsonStrToMap.get("Item").toString();
                List<HashMap> list = JSON.parseArray(Items, HashMap.class);

                for(int i = 0; i < list.size(); ++i) {
                    String depcode = ((HashMap)list.get(i)).get("DeptID").toString();
                    String depname = ((HashMap)list.get(i)).get("DeptName").toString();
                    String sub = depcode.substring(0, depcode.length() - 2);
                    Map<String, Object> newmap = new HashMap();
                    newmap.put("depCode", depcode);
                    newmap.put("depname", depname);
                    byte var18 = -1;
                    switch(sub.hashCode()) {
                        case 1448636001:
                            if (sub.equals("100101")) {
                                var18 = 0;
                            }
                            break;
                        case 1448636002:
                            if (sub.equals("100102")) {
                                var18 = 1;
                            }
                            break;
                        case 1448636003:
                            if (sub.equals("100103")) {
                                var18 = 2;
                            }
                    }

                    switch(var18) {
                        case 0:
                            resmap1.add(newmap);
                            break;
                        case 1:
                            resmap2.add(newmap);
                            break;
                        case 2:
                            resmap3.add(newmap);
                            break;
                        default:
                            resmap.add(newmap);
                    }
                }
            }

            mmm.put("gynaecology", resmap1);
            mmm.put("obstetrics", resmap2);
            mmm.put("pediatrics", resmap3);
            mmm.put("other", resmap);
            map.put("data", mmm);
            map.put("message", "成功");
            map.put("status", "1");
        } catch (Exception var19) {
            LOGGER.info("url:leftDepart。message:查询挂号科室  首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(var19.getMessage(), var19);
        }

        return map;
    }

    @RequestMapping(
            value = {"/DepartDoctors"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public void DepartDoctors(HttpServletRequest request, HttpServletResponse response, String depCode) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        HashMap map = new HashMap();

        try {
            writer = response.getWriter();
            List<String> list = new ArrayList();
            String findDoctor = this.webServices.findDoctor(depCode);
            list.add(findDoctor);
            if (list != null && list.size() > 0) {
                map.put("data", list);
                map.put("message", "成功");
                map.put("status", "1");
            } else {
                map.put("data", "");
                map.put("message", "无数据！");
                map.put("status", "0");
            }
        } catch (Exception var11) {
            LOGGER.info("url:DepartDoctors。message:根据科室编号 查找对应医生集合 首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(var11.getMessage(), var11);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }

    }

    @RequestMapping({"/wxLogin"})
    public String wxLogin(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String status = request.getParameter("status");
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            String backUrl = "http://www.yhtcs.cn/depart/callback.do";
            String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + this.wxConfig.getAppID() + "&redirect_uri=" + URLEncoder.encode(backUrl) + "&response_type=code&scope=snsapi_userinfo&state=" + status + "&connect_redirect=1#wechat_redirect";
            return "redirect:" + url;
        } else {
            return "redirect:http://www.yhtcs.cn#/home";
        }
    }

    @RequestMapping({"/callback"})
    @ResponseBody
    public void callback(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String code = request.getParameter("code");
        String status = request.getParameter("state");
        String openid = "";
        String headimgurl = "";
        new net.sf.json.JSONObject();
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + this.wxConfig.getAppID() + "&secret=" + this.wxConfig.getAppSecret() + "&code=" + code + "&grant_type=authorization_code";

        try {
            net.sf.json.JSONObject jsonObject = WxUtils.doGetJson(url);
            openid = jsonObject.getString("openid");
            String token = jsonObject.getString("access_token");
            String infoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + token + "&openid=" + openid + "&lang=zh_CN";
            net.sf.json.JSONObject userInfo = WxUtils.doGetJson(infoUrl);
            headimgurl = userInfo.getString("headimgurl");
            Cookie openidcookie = new Cookie("openid", openid);
            Cookie headimgurlcookie = new Cookie("headimgurl", headimgurl);
            openidcookie.setMaxAge(120);
            headimgurlcookie.setMaxAge(120);
            openidcookie.setDomain("www.yhtcs.cn");
            headimgurlcookie.setDomain("www.yhtcs.cn");
            openidcookie.setPath("/");
            headimgurlcookie.setPath("/");
            response.addCookie(openidcookie);
            response.addCookie(headimgurlcookie);
            if (status.equals("1")) {
                response.sendRedirect("http://www.yhtcs.cn?" + (int)(Math.random() * 100.0D) + "/#/home");
            } else if (status.equals("2")) {
                response.sendRedirect("http://www.yhtcs.cn?" + (int)(Math.random() * 100.0D) + "/#/appointment");
            } else if (status.equals("3")) {
                response.sendRedirect("http://www.yhtcs.cn?" + (int)(Math.random() * 100.0D) + "/#/Myaccount");
            } else if (status.equals("4")) {
                response.sendRedirect("http://www.yhtcs.cn?" + (int)(Math.random() * 100.0D) + "/#/reportss");
            }
        } catch (Exception var14) {
            LOGGER.info("url:callback。message:回调地址 获取用户的openid 把openid 存到session异常。===请到日志中查询异常信息。===");
            LOGGER.error(var14.getMessage(), var14);
            response.sendRedirect("http://www.yhtcs.cn/#/home");
        }

    }

    @RequestMapping(
            value = {"/getcounts"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public void getcounts(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String cardno = request.getParameter("cardno");
        PrintWriter writer = null;
        String result = null;

        try {
            writer = response.getWriter();
            result = this.redisService.get(cardno);
            if (result == null) {
                result = "0";
            }
        } catch (Exception var10) {
            LOGGER.info("url:getcounts。message:查询websocket的redis的值异常。===请到日志中查询异常信息。===");
            LOGGER.error(var10.getMessage(), var10);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }

    }

    @RequestMapping(
            value = {"/delcounts"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public void delcounts(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;

        try {
            writer = response.getWriter();
            String cardno = request.getParameter("cardno");
            this.redisService.delete(cardno);
        } catch (Exception var8) {
            LOGGER.info("url:delcounts。message:删除websocket的redis的值异常。===请到日志中查询异常信息。===");
            LOGGER.error(var8.getMessage(), var8);
        } finally {
            writer.print("");
            writer.flush();
            writer.close();
        }

    }
}
