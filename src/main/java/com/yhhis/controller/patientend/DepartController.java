package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.common.util.Util;
import com.yhhis.common.util.WxUtils;
import com.yhhis.service.WxUserService;
import com.yhhis.service.impl.RedisServiceImpl;
import com.yhhis.service.impl.WxConfig;
import net.sf.json.JSONObject;
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

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 编号1
 * 查询本地诊疗项目
 * 患者首页
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/depart")
public class DepartController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartController.class);

    @Autowired
    WxConfig wxConfig;
    @Autowired
    WxUserService wxUserService;
    @Resource
    WebServices webServices;
    @Autowired
    private RedisServiceImpl redisService;

//    /**
//     * 6.2 查询挂号科室  首页
//     */
//    @RequestMapping(value = "/GetRegDeptList", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult GetRegDeptList() throws IOException {
////        response.setCharacterEncoding("UTF-8");
////        response.setContentType("text/html;charset=UTF-8");
////        PrintWriter writer = null;
////        String result = "";
////        try {
////            writer = response.getWriter();
//        CommonResult commonResult;
//        String result = redisService.get("departs");
//        if (result == null) {
//            NWebserviceSoap Bing = new NWebservice().getNWebserviceSoap();
//            String str = Bing.getregdeptlist("<Request>"
//                    + "<TypeID></TypeID>"
//                    + "<ParDeptID>0</ParDeptID>"
//                    + "<UserID></UserID>"
//                    + "</Request>");
//            //将XML转化json对象
//            org.json.JSONObject xmlJSONObj = XML.toJSONObject(str);
//            String jsonPrettyPrintString = xmlJSONObj.toString(4);
//            Map<String, Object> leftDepart = leftDepart("[" + jsonPrettyPrintString + "]");
//            result = JSON.toJSONString(leftDepart);
//            redisService.set("departs", result);
//            commonResult = CommonResult.success(result);
//            LOGGER.debug("GetRegDeptList success:{}", result);
//        } else {
//            commonResult = CommonResult.success(result);
//            LOGGER.debug("GetRegDeptList success:{}", result);
//        }
//        return commonResult;
////        } catch (Exception e) {
////            LOGGER.info("url:GetRegDeptList。message:查询挂号科室  首页异常。===请到日志中查询异常信息。===");
////            LOGGER.error(e.getMessage(), e);
////        } finally {
////            writer.print(result);
////            writer.flush();
////            writer.close();
////        }
//    }


    /**
     * 6.2 查询挂号科室  首页
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/GetRegDeptList", method = RequestMethod.POST)
    @ResponseBody
    public void GetRegDeptList(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        String result = "";
        try {
            writer = response.getWriter();
            result = redisService.get("departs");
            if (result == null) {
                NWebserviceSoap Bing = new NWebservice().getNWebserviceSoap();
                String str = Bing.getregdeptlist("<Request>"
                        + "<TypeID></TypeID>"
                        + "<ParDeptID>0</ParDeptID>"
                        + "<UserID></UserID>"
                        + "</Request>");
                //将XML转化json对象
                org.json.JSONObject xmlJSONObj = XML.toJSONObject(str);
                String jsonPrettyPrintString = xmlJSONObj.toString(4);
                Map<String, Object> leftDepart = leftDepart("[" + jsonPrettyPrintString + "]");
                result = JSON.toJSONString(leftDepart);
                redisService.set("departs", result);
            }
        } catch (Exception e) {
            LOGGER.info("url:GetRegDeptList。message:查询挂号科室  首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }

    public Map<String, Object> leftDepart(String str) {
        Map<String, Object> map = new HashMap<>();
        try {
            Map<String, Object> jsonStrToArray = Util.jsonStrToArray(str);
            Map<String, Object> mmm = new HashMap<>();
            List<Map<String, Object>> resmap = new ArrayList<>();
            List<Map<String, Object>> resmap1 = new ArrayList<>();
            List<Map<String, Object>> resmap2 = new ArrayList<>();
            List<Map<String, Object>> resmap3 = new ArrayList<>();
            if (jsonStrToArray != null && jsonStrToArray.size() > 0) {
                Map<String, Object> jsonStrToMap = (Map<String, Object>) jsonStrToArray.get("Response");//获取items json
                String Items = jsonStrToMap.get("Item").toString();
                List<HashMap> list = JSON.parseArray(Items, HashMap.class);
                for (int i = 0; i < list.size(); i++) {
                    String depcode = list.get(i).get("DeptID").toString();
                    String depname = list.get(i).get("DeptName").toString();
                    String sub = depcode.substring(0, depcode.length() - 2);
                    Map<String, Object> newmap = new HashMap<String, Object>();
                    newmap.put("depCode", depcode);
                    newmap.put("depname", depname);
                    switch (sub) {
                        case "100101":
                            resmap1.add(newmap);
                            break;
                        case "100102":
                            resmap2.add(newmap);
                            break;
                        case "100103":
                            resmap3.add(newmap);
                            break;
                        default:
                            resmap.add(newmap);
                    }
                }
            }
            mmm.put("gynaecology", resmap1);//妇科门诊
            mmm.put("obstetrics", resmap2);//产科门诊
            mmm.put("pediatrics", resmap3);//儿科门诊
            mmm.put("other", resmap);//其他
            map.put(ReturnCode.data, mmm);
            map.put(ReturnCode.message, "成功");
            map.put(ReturnCode.status, "1");
        } catch (Exception e) {
            LOGGER.info("url:leftDepart。message:查询挂号科室  首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        }
        return map;
    }

    /**
     * 根据科室编号 查找对应医生集合 首页
     *
     * @param request
     * @param response
     * @param depCode  科室编码
     */
    @RequestMapping(value = "/DepartDoctors", method = RequestMethod.POST)
    @ResponseBody
    public void DepartDoctors(HttpServletRequest request, HttpServletResponse response, String depCode) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        Map<String, Object> map = new HashMap<>();
        try {
            writer = response.getWriter();
            List<String> list = new ArrayList<String>();
            String findDoctor = webServices.findDoctor(depCode);
            list.add(findDoctor);
            if (list != null && list.size() > 0) {
                map.put(ReturnCode.data, list);
                map.put(ReturnCode.message, "成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "无数据！");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            LOGGER.info("url:DepartDoctors。message:根据科室编号 查找对应医生集合 首页异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }


    /**
     * 微信授权登录
     */
    @RequestMapping("/wxLogin")
    public String wxLogin(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String status = request.getParameter("status");
        //如果request里面没有cookie，就进行授权，有的话就就直接放行
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
        // backUrl 需要遵循微信官方的定义，微信的接口只能用 https 来访问
        // 所以我这里是直接把整个项目打包成 jar 包，然后扔到自己的服务器上
        String backUrl = wxConfig.getYuming() + "/depart/callback.do";
        String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + wxConfig.getAppID()
                + "&redirect_uri=" + URLEncoder.encode(backUrl) + "&response_type=code" + "&scope=snsapi_userinfo"
                + "&state=" + status + "&connect_redirect=1#wechat_redirect";
        return "redirect:" + url;// 必须重定向，否则不能成功
        } else {
            return "redirect:" + wxConfig.getYuming() + "#/home";
        }
    }

    /**
     * 回调地址 获取用户的openid 把openid 存到session
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/callback")
    @ResponseBody
    public void callback(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String code = request.getParameter("code");
        String status = request.getParameter("state");
        String openid = "";
        String headimgurl = "";
        JSONObject userInfo = new JSONObject();
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + wxConfig.getAppID() + "&secret="
                + wxConfig.getAppSecret() + "&code=" + code + "&grant_type=authorization_code";
        try {
            JSONObject jsonObject = WxUtils.doGetJson(url);
            /**
             * 获取openid和token
             */
            openid = jsonObject.getString("openid");
            String token = jsonObject.getString("access_token");
            // 获取用户信息
            String infoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=" + token + "&openid=" + openid
                    + "&lang=zh_CN";
            userInfo = WxUtils.doGetJson(infoUrl);
            headimgurl = userInfo.getString("headimgurl");
            /**
             * 放到cookie里面
             */
            Cookie openidcookie = new Cookie("openid", openid);
            Cookie headimgurlcookie = new Cookie("headimgurl", headimgurl);
            openidcookie.setMaxAge(60 * 2);  // 设置生命周期为0，不能为负数
            headimgurlcookie.setMaxAge(60 * 2);
            openidcookie.setDomain(wxConfig.getDamion());
            headimgurlcookie.setDomain(wxConfig.getDamion());
            openidcookie.setPath("/");
            headimgurlcookie.setPath("/");
            response.addCookie(openidcookie);
            response.addCookie(headimgurlcookie);
            if (status.equals("1")) {
                response.sendRedirect(wxConfig.getYuming() + "?" + (int) (Math.random() * 100) + "/#/home");
            } else if (status.equals("2")) {
                response.sendRedirect(wxConfig.getYuming() + "?" + (int) (Math.random() * 100) + "/#/appointment");
            } else if (status.equals("3")) {
                response.sendRedirect(wxConfig.getYuming() + "?" + (int) (Math.random() * 100) + "/#/Myaccount");
            } else if (status.equals("4")) {
                response.sendRedirect(wxConfig.getYuming() + "?" + (int) (Math.random() * 100) + "/#/reportss");
            }
        } catch (Exception e) {
            LOGGER.info("url:callback。message:回调地址 获取用户的openid 把openid 存到session异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
            response.sendRedirect(wxConfig.getYuming() + "/#/home");
        }
    }

    /**
     * 查询websocket的redis的值
     */
    @RequestMapping(value = "/getcounts", method = RequestMethod.POST)
    @ResponseBody
    public void getcounts(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String cardno = request.getParameter("cardno");
        PrintWriter writer = null;
        String result = null;
        try {
            writer = response.getWriter();
            result = redisService.get(cardno);
            if (result == null) {
                result = "0";
            }
        } catch (Exception e) {
            LOGGER.info("url:getcounts。message:查询websocket的redis的值异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }


    }

    /**
     * 删除websocket的redis的值
     */
    @RequestMapping(value = "/delcounts", method = RequestMethod.POST)
    @ResponseBody
    public void delcounts(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            String cardno = request.getParameter("cardno");
            redisService.delete(cardno);
        } catch (Exception e) {
            LOGGER.info("url:delcounts。message:删除websocket的redis的值异常。===请到日志中查询异常信息。===");
            LOGGER.error(e.getMessage(), e);
        } finally {
            writer.print("");
            writer.flush();
            writer.close();
        }
    }
}