package com.yhhis.controller.Doctorend;


import com.his.server.WebServices;
import com.yhhis.common.entity.UserDome;
import com.yhhis.common.util.CardUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    private static int i = 1;

    @Resource
    private WebServices webServices;
//    @Resource
//    private WXPayService wxPayService;
//    @Resource
//    private RedisServiceImpl redisService;
//    @Autowired
//    private WxConfig wxConfig;
//    @Autowired
//    private StaffDictDao staffDictDao;

//    @RequestMapping(value = "/insertdrug", produces = {"application/json;charset=UTF-8"})
//    @ResponseBody
//    public String saveAndUpdataBaseResource(HttpServletRequest httpRequest, @ModelAttribute("baseResource") BaseResource baseResource,
//                                            @RequestParam(value = "basenum", required = false) String basenum,
//                                            @RequestParam(value = "baseName", required = false) String baseName,
//                                            @RequestParam(value = "baseNo", required = false) String baseNo) {
//        String account = (String) httpRequest.getSession().getAttribute("account");
//
//        // form表单提交 的隐藏域
//        basenum = httpRequest.getParameter("basenumV");
//        baseName = httpRequest.getParameter("baseNameV");
//        baseNo = httpRequest.getParameter("baseNoV");
//        String baseResourceImage = httpRequest.getParameter("baseResourceImage");
//
//        try {
////进行判断，如果得到的id为0或者为空则进行添加操作，否则进行编辑操作
//            if (baseResource.getId() == 0 || "".equals(baseResource.getId())) {
//                baseResource.setCreatetime(DateUtils.formatDefaultDateString("yyyy-MM-dd HH:mm:ss"));
//                baseResource.setResourceno(UUID.randomUUID().toString().replace("-", ""));
//                baseResource.setCreater(account);
//                baseResource.setResourcestate("1");
//                baseResource.setBaseno(baseNo);
//                baseResource.setModifier(null);
//                baseResource.setModifytime(null);
//                baseResource.setBrief(null);
//                baseResource.setResourcepic(null);
//                baseResourceService.addBaseResource(baseResource);
//                DBLog.busInfo("add baseResource", account, baseResource.getResourcename(), "机房" + baseName + "添加一条设备资源，名称为" + baseResource.getResourcename(), httpRequest.getRemoteAddr());
////添加完其他信息，在添加图片，注意 图片和信息分两个表，用resourceNo关联
//                BaseResourcePic resourcePic = new BaseResourcePic();
//
////前端页面传来的是base64加密，所以我们就需要进行base64解密
//                String resourceimgUrl = LockSeqUtil.getBaseResourceImgDir();  //封装一个方法，得到图片url的地址，具体后面进行分享
//                String[] pathArray = FileOperateUtils.uploadBase64Img(baseResourceImage, resourceimgUrl); //封装一个方法base64多图片上传，具体后面进行分享
//                for (int i = 0; i < pathArray.length; i++) {
//                    String pathUrl = pathArray[i];
//                    if (StringUtils.isNotBlank(pathUrl)) {
//                        resourcePic.setResourcepic(pathUrl);
//                        resourcePic.setResourceno(baseResource.getResourceno());
//                        resourcePic.setCreater(account);
//                        resourcePic.setCreatetime(DateUtils.formatDefaultDateString("yyyy-MM-dd HH:mm:ss"));
//                        baseResourceService.addBaseResourcePic(resourcePic);
//                    }
//
//                }
//            } else {
//
////编辑这一块的业务逻辑，是根据资源编号先查，查出来后 直接删除，再把所有的图片一起上传
////根据资源编号查询资源图片,查出来后直接删除
//                String resourceNo = baseResource.getResourceno();
//                Map<String, Object> paramMap = new HashMap<String, Object>();
//                paramMap.put("resourceno", resourceNo);
//                List<BaseResourcePic> resourcePicA = baseResourceService.handleGetResourcePic(paramMap); //根据resourceNo查询图片
//                if (resourcePicA.size() > 0) {
//                    for (BaseResourcePic baseResourcePic : resourcePicA) {
//                        Integer picid = baseResourcePic.getId();
//                        baseResourceService.HandleDeleteResourcePic(picid); // 根据id删除图片
//                    }
//                }
//                baseResource.setCreatetime(DateUtils.formatDefaultDateString("yyyy-MM-dd HH:mm:ss"));
//                baseResource.setCreater(account);
//                baseResource.setResourcestate("1");
//                baseResource.setBaseno(baseNo);
//                baseResource.setModifier(account);
//                baseResource.setModifytime(DateUtils.formatDefaultDateString("yyyy-MM-dd HH:mm:ss"));
//                baseResource.setBrief(null);
//                baseResource.setResourcepic(null);
//                baseResourceService.HandleUpdateBaseResource(baseResource);
//                DBLog.busInfo("update baseResource", account, baseResource.getResourcename(), "机房" + baseName + "修改资源设备，名称为" + baseResource.getResourcename(), httpRequest.getRemoteAddr());
//
//
//                BaseResourcePic resourcePic = new BaseResourcePic();
//                String resourceimgUrl = LockSeqUtil.getBaseResourceImgDir();
//                String[] pathArray = FileOperateUtils.uploadBase64Img(baseResourceImage, resourceimgUrl);
//                for (int i = 0; i < pathArray.length; i++) {
//                    String pathUrl = pathArray[i];
//                    if (StringUtils.isNotBlank(pathUrl)) {
//                        resourcePic.setResourcepic(pathUrl);
//                        resourcePic.setResourceno(baseResource.getResourceno());
//                        resourcePic.setCreater(account);
//                        resourcePic.setCreatetime(DateUtils.formatDefaultDateString("yyyy-MM-dd HH:mm:ss"));
//                        baseResourceService.addBaseResourcePic(resourcePic);
//                    }
//
//                }
//            }
//            return "redirect:/baseResource/godetails?baseNo=" + baseNo;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "redirect:godetails";
//        }
//    }

    @RequestMapping(value = "/Verified1", method = RequestMethod.POST)
    @ResponseBody
    public String Verified(@RequestParam("cardno") String cardno) {
        UserDome request = CardUtil.getRequest(cardno);
        return request.getArea();

    }
//
//    public String getTime(String doctorno, String time) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Date date = new Date();//此时date为当前的时间
//        Date s2 = sdf1.parse(time + " 08:00:00");
//        Date s3 = sdf1.parse(time + " 12:00:00");
//        Date s4 = sdf1.parse(time + " 14:30:00");
//        Date s5 = sdf1.parse(time + " 17:00:00");
//        Date b = sdf.parse(time);
//        Date now = new Date();
//        String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
//        JSONObject jsonObject = JSONObject.parseObject(result);
//        int num = jsonObject.get("number").hashCode();
//        if (b.before(date)) {
//            if (num == 0) {
//                Date s1 = new Date();
//                if (!s1.after(s2)) {
//                    s2 = new Date(s2.getTime() + 900000 * (num + 1));
//                    System.out.println(sdf.format(s2));
//                    return (sdf2.format(s2) + "之前过来就诊");
//                } else if (!s2.after(s1) && !s3.before(s1)) {
//                    s1 = new Date(s1.getTime() + 900000 * (num + 1));
//                    return (sdf2.format(s1) + "之前过来就诊");
//                } else if (!s3.after(s1) && !s4.before(s1)) {
//                    s4 = new Date(s4.getTime() + 900000 * (num + 1));
//                    return (sdf2.format(s4) + "之前过来就诊");
//                } else if (!s4.after(s1) && !s5.before(s1)) {
//                    s1 = new Date(s1.getTime() + 900000 * (num + 1));
//                    return (sdf2.format(s1) + "之前过来就诊");
//                }
//            } else if (num <= 16) {
//                String registtime = jsonObject.get("registtime").toString();
//                Date s1 = sdf1.parse(registtime);
//                if (s2.after(s1)) {
//                    s2 = new Date(s2.getTime() + 900000 * num);
//                    System.out.println(sdf.format(s2));
//                    return (sdf2.format(s2) + "之前过来就诊");
//                } else if (!s1.before(s2) && !new Date(s1.getTime() + 900000).after(s3)) {
//                    if (now.after(new Date(s1.getTime()))) {
//                        s1 = new Date(s1.getTime() + 900000);
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    } else if (now.after(s4)) {
//                        s1 = new Date(now.getTime() + 900000);
//                        if (s1.after(s5)) {
//                            return "医生可能即将下班，请及时就诊或退款";
//                        }
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    } else if (now.after(s3) && now.before(s4)) {
//                        return (sdf2.format(s4) + "之前过来就诊");
//                    } else {
//                        return (sdf2.format(s4) + "之前过来就诊");
//                    }
//                } else if (!new Date(s1.getTime() + 900000).before(s3) && !new Date(s1.getTime() + 900000).after(s4)) {
//                    if (now.before(new Date(s1.getTime()))) {
//                        s1 = new Date(s1.getTime() + 900000);
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    } else if (now.after(s4)) {
//                        s1 = new Date(now.getTime() + 900000);
//                        if (s1.after(s5)) {
//                            return "医生可能即将下班，请及时就诊或退款";
//                        }
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    } else if (now.after(s3) && now.before(s4)) {
//                        return (sdf2.format(s4) + "之前过来就诊");
//                    } else {
//                        return (sdf2.format(s4) + "之前过来就诊");
//                    }
////                    s4 = new Date(s4.getTime() + 900000 );
////                    return (sdf2.format(s4) + "之前过来就诊");
//                } else if (!s1.before(s4) && !new Date(s1.getTime() + 900000).after(s5)) {
//                    if (now.before(new Date(s1.getTime()))) {
//                        s1 = new Date(s1.getTime() + 900000);
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    } else {
//                        s1 = new Date(now.getTime() + 900000);
//                        if (s1.after(s5)) {
//                            return "医生可能即将下班，请及时就诊或退款";
//                        }
//                        return (sdf2.format(s1) + "之前过来就诊");
//                    }
////                    s1 = new Date(s1.getTime() + 900000 );
////                    return (sdf2.format(s1) + "之前过来就诊");
//                }
//            } else if (num > 16 && num < 27) {
//                String registtime = jsonObject.get("registtime").toString();
//                Date s1 = sdf1.parse(registtime);
//                if (s2.after(s1)) {
//                    s4 = new Date(s4.getTime() + 900000 * (num - 17));
//                    if (s4.after(now)) {
//                        return (sdf2.format(s4) + "之前过来就诊");
//                    } else if (s4.before(now) && s5.after(new Date(now.getTime() + 900000))) {
//                        return (sdf2.format(new Date(now.getTime() + 900000)) + "之前过来就诊");
//                    } else {
//                        return "医生可能即将下班，请及时就诊或退款";
//                    }
//                } else if (!s1.before(s2) && !new Date(now.getTime() + 900000).after(s3)) {
//                    now = new Date(now.getTime() + 900000);
//                    return (sdf2.format(now) + "之前过来就诊");
//                } else if (!now.after(s4)) {
//                    s4 = new Date(s4.getTime() + 900000);
//                    return (sdf2.format(s4) + "之前过来就诊");
//                } else if (!now.before(s4) && !new Date(s1.getTime() + 900000).after(s5)) {
//                    now = new Date(now.getTime() + 900000);
//                    return (sdf2.format(now) + "之前过来就诊");
//                }
//            }
////            System.out.println(true);
////            String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
////            JSONObject jsonObject = JSONObject.parseObject(result);
////            num = jsonObject.get("number").hashCode();
////            Date s1;
////            if (num == 0) {
////                s1 = date;
////            } else {
////                String registtime = jsonObject.get("registtime").toString();
////                s1 = sdf1.parse(registtime);
////            }
////
////            if (s1.before(s2) && new Date(s2.getTime() + 900000 * (num + 1)).before(s3)) {
////                s2 = new Date(s2.getTime() + 900000 * (num + 1));
////                System.out.println(sdf.format(s2));
////                return (sdf2.format(s2) + "之前过来就诊");
////            } else if (s1.after(s2) && s1.before(s3)) {
////                s1 = new Date(s1.getTime() + 900000);
////                System.out.println(sdf1.format(s1));
////                return (sdf2.format(s1) + "之前过来就诊");
////            } else if (s1.after(s3) && s1.before(s4)) {
////                s4 = new Date(s4.getTime() + 900000);
////                System.out.println(sdf1.format(s4));
////                return (sdf2.format(s4) + "之前过来就诊");
////            } else if (s1.after(s3) && new Date(s1.getTime() + 900000).before(s5)) {
////                s1 = new Date(s1.getTime() + 900000);
////                System.out.println(sdf1.format(s1));
////                return (sdf2.format(s1) + "之前过来就诊");
////            } else if (s1.before(s5)) {
////                System.out.println("不准挂号");
////                return "不准挂号";
////            }
//        } else {
////            String result = webServices.getRegisterNumberAndLastTimeAndNumber(doctorno, time);
////            JSONObject jsonObject = JSONObject.parseObject(result);
////            int num = jsonObject.get("number").hashCode();
//            if (!s3.before(new Date(s2.getTime() + 900000 * num))) {
//                s2 = new Date(s2.getTime() + 900000 * num);
//                System.out.println(sdf.format(s2));
//                return (sdf2.format(s2) + "之前过来就诊");
//            } else if (!s4.before(new Date(s3.getTime() + 900000 * (num - 17)))) {
//                s4 = new Date(s4.getTime() + 900000 * (num - 17));
//                System.out.println(sdf.format(s4));
//                return (sdf2.format(s4) + "之前过来就诊");
//            }
//        }
//        return "医生可能即将下班，请及时就诊或退款";
//    }
//
////    @RequestMapping(value = "/Verified", method = RequestMethod.POST)
////    @ResponseBody
////    public String Verified(@RequestParam("openid") String openid,@RequestParam("Name")String name,@RequestParam("IdNumber")String idnum) {
////        CommonResult commonResult;
////        String s = redisService.get(openid);
////        String message = "";
////        RequestModel model = new RequestModel();
////        model.setGwUrl(wxConfig.getId_Url());
////        model.setAppkey(wxConfig.getId_Appkey());
////        Map queryMap = new HashMap();
////        queryMap.put("cardno",idnum); //访问参数
////        queryMap.put("name",name); //访问参数
////        model.setQueryParams(queryMap);
////        WxApiCall call = new WxApiCall();
////        call.setModel(model);
////        if (s == null) {
////            redisService.setTime(openid, (++i) + "", 60L);
////            message=call.request();
////        } else {
////            int s1 = Integer.parseInt(redisService.get(openid));
////            if (s1 <= 3) {
////                redisService.setTime(openid, (++i) + "", 60L);
////                message=call.request();
////            } else {
////                System.out.println("------------------频繁操作，请一个小时之后进行操作-------------");
////                message="频繁操作，请一个小时之后进行操作";
////                commonResult = CommonResult.failed(message);
////                LOGGER.debug("Verified fail:{}", message);
////                return commonResult.toString();
////            }
////        }
////        return message;
////    }
//
//    public void refunds(String visitdate, String cardno, String visitno, int price, String tradeno) {
//        String result = webServices.registerRefundWx(visitdate, cardno, visitno);
//        switch (result) {
//            case "1":
//                Map<String, String> stringStringMap = wxPayService.reFund(price, tradeno);
//                LOGGER.debug("registeredRefund success:{}", stringStringMap);
//                break;
//            case "0":
//                LOGGER.debug("registeredRefund fail:{}", "0");
//                break;
//            case "-1":
//                LOGGER.debug("registeredRefund exception:{}", "-1");
//                break;
//        }
//    }
}
