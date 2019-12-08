package com.yhhis.common.wxSDK.pojo;

import java.io.Serializable;

/**
 * 微信js接口config配置
 *
 * @author yangqisheng
 * @since 0.0.1
 */
public class WxConfig implements Serializable {

    private String appId;
    private String timestamp;
    private String nonceStr;
    private String signature;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "{appId:\"" + this.getAppId() + "\",\n"
                + "timestamp: \"" + this.getTimestamp() + "\",\n"
                + "nonceStr: \"" + this.getNonceStr() + "\",\n"
                + "signature: \"" + this.getSignature() + "\",}";
    }
}