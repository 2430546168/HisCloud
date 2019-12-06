package com.yhhis.common.wxSDK.pojo;

import com.alibaba.fastjson.JSONObject;
import com.yhhis.common.wxSDK.WeixinException;
import com.yhhis.common.wxSDK.http.Response;

import java.io.Serializable;
import java.util.Date;

/**
 * 微信平台用户凭证对象
 *
 * <p>
 * 通过<tt>Weixin</tt>产生一个请求对象，对应生成一个<tt>HttpClient</tt>，
 * 每次登陆产生一个<tt>OAuth</tt>用户连接,使用<tt>OAuthToken</tt>
 * 可以不用重复向微信平台发送登陆请求，在没有过期时间内，可继续请求。</p>
 *
 * @author yangqisheng
 * @since 0.1.0
 */
public final class Token implements Serializable {

    private String access_token;
    private int expires_in = 7200;
    private long exprexpired_time;
    private long create_time;

    public Token() {
    }

    public Token(String accessToken, int expiresIn) {
        this.access_token = accessToken;
        setExpires_in(expiresIn);
    }

    public Token(String accessToken, int expiresIn, long createTime) {
        this.access_token = accessToken;
        setExpires_in(expiresIn, createTime);
    }

    /**
     * 通过输出对象，从输出对象转换为JSON对象，后获取JSON数据包
     *
     * <p>
     * 要求输出内容为一个标准的JSON数据包，正常情况下， 微信会返回下述JSON数据包给公众号：
     * {"access_token":"ACCESS_TOKEN","expires_in":7200}</p>
     *
     * @param response 输出对象
     *                 微信操作异常
     */
    public Token(Response response) throws WeixinException {
        this(response.asJSONObject());
    }

    /**
     * 通过微信公众平台返回JSON对象创建凭证对象
     *
     * <p>
     * 正常情况下，微信会返回下述JSON数据包给公众号：
     * {"access_token":"ACCESS_TOKEN","expires_in":7200}</p>
     *
     * @param jsonObj JSON数据包
     *                微信操作异常
     */
    public Token(JSONObject jsonObj) throws WeixinException {
        this.access_token = jsonObj.getString("access_token");
        //根据当前时间的毫秒数+获取的秒数计算过期时间
        int expiresIn = jsonObj.getIntValue("expires_in");
        if (jsonObj.containsKey("create_time")) {
            //获取创建时间
            long createTime = jsonObj.getLong("create_time");
            if (createTime > 0) {
                //设定指定日期
                setExpires_in(expiresIn, createTime);
                return;
            }
        }
        setExpires_in(expiresIn);
    }

    /**
     * 获取用户凭证
     *
     * @return 用户凭证
     */
    public String getAccess_token() {
        return access_token;
    }

    /**
     * 设置用户凭证
     *
     * @param access_token 用户凭证
     */
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * 判断用户凭证是否过期
     *
     * @return 过期返回 true,否则返回false
     */
    public boolean isExprexpired() {
        Date now = new Date();
        long nowLong = now.getTime();
        return nowLong >= exprexpired_time;
    }

    /**
     * 获取 凭证有效时间，单位：秒
     *
     * @return 凭证有效时间，单位：秒
     */
    public int getExpires_in() {
        return expires_in;
    }

    /**
     * 设置 凭证有效时间，单位：秒
     *
     * <p>
     * 为了与微信服务器保存同步，误差设置为提前1分钟，即：将创建时间提早1分钟
     * </p>
     *
     * @param expires_in 凭证有效时间，单位：秒
     */
    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
        //使用当前时间记录
        setExpires_in(expires_in, System.currentTimeMillis());
    }

    /**
     * 设置 凭证有效时间，单位：秒
     *
     * <p>
     * 为了与微信服务器保存同步，误差设置为提前1分钟，即：将创建时间提早1分钟
     * </p>
     *
     * @param expires_in  凭证有效时间，单位：秒
     * @param create_time 凭证创建时间
     */
    public void setExpires_in(int expires_in, long create_time) {
        this.expires_in = expires_in;
        //获取当前时间毫秒数
        this.create_time = create_time - 60000;
        //设置下次过期时间 = 当前时间 + (凭证有效时间(秒) * 1000)
        this.exprexpired_time = this.create_time + (expires_in * 1000);
    }

    /**
     * 获取 此次凭证创建时间 单位：毫秒数
     *
     * @return 创建时间 毫秒数
     */
    public long getCreate_time() {
        return this.create_time + 60000;
    }

    /**
     * 将数据转换为JSON数据包
     *
     * @return JSON数据包
     */
    @Override
    public String toString() {
        //对外的时间 需要加上扣掉的 60秒
        return "{\"access_token\":\"" + this.getAccess_token() + "\",\"expires_in\":" + this.getExpires_in() + ",\"create_time\" : " + this.getCreate_time() + "}";
    }
}