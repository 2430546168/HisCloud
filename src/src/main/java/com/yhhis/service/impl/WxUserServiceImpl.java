package com.yhhis.service.impl;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.yhhis.common.entity.WxUser;
import com.yhhis.common.util.Util;
import com.yhhis.common.sdk.Sign;
import com.yhhis.dao.WxUserDao;
import com.yhhis.service.WxUserService;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;


@Service
public class WxUserServiceImpl implements WxUserService {
    //    @Resource
    WxConfig config = new WxConfig();
    @Resource
    WxUserDao wxUserDao;

    /**
     * 获取微信jsapi配置
     *
     * @param url 调用接口的地址
     */
    public Map<String, String> getJsConfig(String url) {
        String appId = config.getAppID();
        String accessToken = "";
        String jspaiTicket = "";
        accessToken = getAccessToken(appId, config.getAppSecret());
        jspaiTicket = getJsApiTicket(accessToken);
        Map<String, String> ret = Sign.sign(jspaiTicket, url);//获取签名
        ret.put("appid", appId);
        return ret;
    }

    /**
     * 获取access_token
     *
     * @param appID     公众号appid
     * @param appSecret 开发者密码
     */
    public String getAccessToken(String appID, String appSecret) {
        String accessToken = config.getAccessToken();
        String accessTime = config.getAccessTime();
        int tokenExpiresIn = config.getTokenExpiresIn();
        long accessTimeL = 0;
        long currentTimeL = 0;
        currentTimeL = new Date().getTime();
        accessTimeL = Util.getTimeFromString("yyyyMMddHHmmss", accessTime);

        String currentTime = "";
        int expiresIn = 0;

        if (accessToken.equals("") || accessTime.equals("") || (currentTimeL - accessTimeL) / 1000 >= tokenExpiresIn) {
            String url = config.getAccessUrl();
            url = url.replace("APPID", appID);
            url = url.replace("APPSECRET", appSecret);
            currentTime = Util.getTime("yyyyMMddHHmmss");
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = null;
            String content = "";
            try {
                //执行get方法
                response = httpclient.execute(httpget);
                if (response.getStatusLine().getStatusCode() == 200) {
                    content = EntityUtils.toString(response.getEntity(), "utf-8");
                    JSONObject baseinfo = JSONObject.parseObject(content);
                    accessToken = baseinfo.getString("access_token");
                    expiresIn = baseinfo.getIntValue("expires_in") - 1800;
                    config.setAccessToken(accessToken);
                    config.setTokenExpiresIn(expiresIn);
                    config.setAccessTime(currentTime);
                }
            } catch (ClientProtocolException e) {
                Util.logException("获取access_token失败", e);
            } catch (IOException e) {
                Util.logException("获取access_token失败", e);
            } catch (JSONException e) {
                Util.logException("获取access_token失败 " + " content:" + content, e);
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    Util.logException("response关闭异常", e);
                }
            }
        }
//        System.out.println("token:" + accessToken + " time:" + accessTime + " expires_in:" +tokenExpiresIn);
        return accessToken;
    }

    /**
     * 获取jsapi_ticket
     */
    public String getJsApiTicket(String token) {
        String jspaiTicket = config.getJsapiTicket();
        String tickeTime = config.getTicketTime();
        int ticketExpiresIn = config.getTicketExpiresIn();

        long tickeTimeL = 0;
        long currentTimeL = 0;
        currentTimeL = new Date().getTime();
        String currentTime = "";
        int expiresIn = 0;
        currentTime = Util.getTime("yyyyMMddHHmmss");
        tickeTimeL = Util.getTimeFromString("yyyyMMddHHmmss", tickeTime);
        if (jspaiTicket.equals("") || tickeTime.equals("") || (currentTimeL - tickeTimeL) / 1000 >= ticketExpiresIn) {
            String url = config.getTicketUrl();
//        	System.out.println(url);
            url = url.replace("ACCESS_TOKEN", token);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = null;
            String content = "";
            try {
                //执行get方法
                response = httpclient.execute(httpget);
                if (response.getStatusLine().getStatusCode() == 200) {
                    content = EntityUtils.toString(response.getEntity(), "utf-8");
                    JSONObject baseinfo = JSONObject.parseObject(content);
//                    System.out.println(baseinfo.getInt("errcode"));
                    if (baseinfo.getIntValue("errcode") == 40001) {
                        config.setTokenExpiresIn(0);
                    } else {
                        jspaiTicket = baseinfo.getString("ticket");
                        expiresIn = baseinfo.getIntValue("expires_in") - 1800;
                        config.setJsapiTicket(jspaiTicket);
                        config.setTicketExpiresIn(expiresIn);
                        config.setTicketTime(currentTime);
                    }
                }
            } catch (ClientProtocolException e) {
                Util.logException("获取jsapiticket失败", e);
            } catch (IOException e) {
                Util.logException("获取jsapiticket失败", e);
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    Util.logException("response关闭异常", e);
                }
            }
        }
        return jspaiTicket;
    }

    /**
     * 获取用户关注信息，目前用来判断是否关注公众号
     *
     * @param openid
     * @return
     */
    public boolean getUserFollow(String openid) {
        boolean isFollow = false;
        String url = config.GET_USERINFO_URL;
        if (!Util.isEmpty(openid)) {
            String token = getAccessToken(config.getAppID(), config.getAppSecret());
            url = url.replace("ACCESS_TOKEN", token);
            url = url.replace("OPENID", openid);
            String content = "";
            JSONObject result = null;
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = null;
            try {
                response = httpclient.execute(httpget);
                if (response.getStatusLine().getStatusCode() == 200) {
                    content = EntityUtils.toString(response.getEntity(), "utf-8");
                    result = JSONObject.parseObject(content);
//	                System.out.println(result);
                    if (result.get("subscribe") != null
                            && result.getIntValue("subscribe") == 1) {
                        isFollow = true;
                    }
                }
            } catch (Exception e) {
                Util.log("获取用户信息失败,返回:" + result.toString() + "\ntoken:" + token);
                Util.logException("获取用户信息失败", e);
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    Util.logException("response关闭异常", e);
                }
            }
        }
        return isFollow;
    }

    /**
     * 获取网页授权url
     */
    public String getAuthUrl(String scope, String redirect, String state) {
        String url = config.AUTH_URL;
        url = url.replace("APPID", config.getAppID());
        try {
            url = url.replace("URL", URLEncoder.encode(redirect, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Util.logException("getAuthUrl urlEncode失败", e);
        }
        url = url.replace("SCOPE", scope);
        url = url.replace("STATE", state);
        return url;
    }

    /**
     * 获取授权token
     */
    public JSONObject getWxAuth(String code) {
        String url = config.AUTH_ACCESS_URL;
        url = url.replace("APPID", config.getAppID());
        url = url.replace("SECRET", config.getAppSecret());
        url = url.replace("CODE", code);
//		System.out.println(url);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        String content = "";
        try {
            //执行get方法
            response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() == 200) {
                content = EntityUtils.toString(response.getEntity(), "utf-8");
                JSONObject result = JSONObject.parseObject(content);
                return result;
            }
        } catch (Exception e) {
            Util.logException("获取access_token失败", e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                Util.logException("response关闭异常", e);
            }
        }
        return null;
    }

    /**
     * 获取用户信息
     */
    public WxUser getUserInfo(String token, String openid) {
        WxUser userInfo = wxUserDao.getUser(openid);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getSession().setAttribute("userinfo", userInfo);
        if (userInfo != null) {
            return userInfo;
        } else if (Util.isEmpty(token)) {
            return null;
        } else {
            String url = config.USERINFO_URL;
            url = url.replace("ACCESS_TOKEN", token);
            url = url.replace("OPENID", openid);
            String content = "";
            JSONObject result = null;
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = null;
            try {
                response = httpclient.execute(httpget);
                if (response.getStatusLine().getStatusCode() == 200) {
                    content = EntityUtils.toString(response.getEntity(), "utf-8");
                    result = JSONObject.parseObject(content);
                    result.remove("privilege");
                    userInfo = (WxUser) JSONObject.parseObject(result.toJSONString(), WxUser.class);
                    if (!Util.isEmpty(userInfo.getOpenid())) {
                        //下载头像图片
                        String headImgUrl = userInfo.getHeadimgurl();
                        userInfo.setHeadimgurl(getHeadImg(openid, headImgUrl));
                        wxUserDao.addUser(userInfo);
                    }
                    request.getSession().setAttribute("userinfo", userInfo);
                    return userInfo;
                }
            } catch (Exception e) {
                Util.log("获取用户信息失败,返回:" + result.toString() + "\ntoken:" + token);
                Util.logException("获取用户信息失败", e);
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    Util.logException("response关闭异常", e);
                }
            }
            return null;
        }
    }

    /**
     * 下载微信头像
     */
    public String getHeadImg(String openId, String url) {
        String realPath = Util.contextPath;

        realPath = realPath.substring(0, realPath.lastIndexOf("\\"))
                + "\\wxhead";
        String filepath = "../../wxhead/" + openId + ".jpg";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        byte[] img = null;
        try {
            response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() == 200) {
                img = EntityUtils.toByteArray(response.getEntity());
                //文件保存位置
                File saveDir = new File(realPath);
                if (!saveDir.exists()) {
                    saveDir.mkdirs();
                }
                File file = new File(saveDir + File.separator + openId + ".jpg");
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(img);
                if (fos != null) {
                    fos.close();
                }
            }
        } catch (Exception e) {
            Util.logException("微信头像下载异常", e);
        }
        return filepath;
    }


    /**
     * 发送客服消息
     *
     * @param toUser
     * @param msg
     * @return
     */
    public boolean sendTextCoustomMsg(String toUser, String msg) {
        String token = getAccessToken(config.getAppID(), config.getAppSecret());
        String url = config.CUSTOM_SERVICE_MSG_URL;
        url = url.replace("ACCESS_TOKEN", token);
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        HttpResponse response = null;
        String sendMsg = "";
        sendMsg = "{\"touser\":\"" + toUser + "\",\"msgtype\":\"text\",\"text\":{\"content\":\"" + msg + "\"}}";
        try {
            StringEntity entity = new StringEntity(sendMsg, Charset.forName("UTF-8"));
            post.setEntity(entity);
            response = httpclient.execute(post);
            System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
        } catch (Exception e) {
            Util.logException("发送客服消息异常", e);
            return false;
        }
        return true;
    }

    /**
     * 获取图文消息素材列表
     *
     * @param offset
     * @param count
     * @return
     */
    public String getNewsList(int offset, int count) {
        String token = getAccessToken(config.getAppID(), config.getAppSecret());
        String url = config.BATCHGET_MATERIAL_URL;
        url = url.replace("ACCESS_TOKEN", token);
        String result = "";
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        HttpResponse response = null;
        String sendMsg = "";
        sendMsg = "{\"type\":\"news\",\"offset\":" + offset + ",\"count\":" + count + "}";
        try {
            StringEntity entity = new StringEntity(sendMsg, Charset.forName("UTF-8"));
            post.setEntity(entity);
            response = httpclient.execute(post);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
            return result;
        } catch (Exception e) {
            Util.logException("获取图文消息素材列表异常", e);
            return result;
        }
    }

    public byte[] getNewsCover(String url) {
        if (Util.isEmpty(url)) {
            return null;
        }
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        byte[] img = null;
        try {
            response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() == 200) {
                img = EntityUtils.toByteArray(response.getEntity());
            }
        } catch (Exception e) {
            Util.logException("图文封面获取异常", e);
        }
        return img;

    }

    public String toShortUrl(String url) {
        if (Util.isEmpty(url)) {
            return "";
        }
        String shortUrl = "";
        if (Util.isEmpty(shortUrl)) {
            String token = getAccessToken(config.getAppID(), config.getAppSecret());
            String apiUrl = config.SHORT_URL_API;
            apiUrl = apiUrl.replace("ACCESS_TOKEN", token);
            String result = "";
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost post = new HttpPost(apiUrl);
            HttpResponse response = null;
            String sendMsg = "{\"action\":\"long2short\",\"long_url\":,\"" + url + "\":}";
            try {
                StringEntity entity = new StringEntity(sendMsg, Charset.forName("UTF-8"));
                post.setEntity(entity);
                response = httpclient.execute(post);
                shortUrl = EntityUtils.toString(response.getEntity(), "utf-8");
                System.out.println(shortUrl);
            } catch (Exception e) {
                Util.logException("长链接转异常", e);
                return result;
            }
        }
        return shortUrl;
    }

    @Override
    public WxUser getUser(String openid) {
        // TODO Auto-generated method stub
        return wxUserDao.getUser(openid);
    }

    @Override
    public int addUser(WxUser user) {
        // TODO Auto-generated method stub
        return wxUserDao.addUser(user);
    }

    @Override
    public int updateUser(WxUser user) {
        // TODO Auto-generated method stub
        return wxUserDao.updateUser(user);
    }
}
