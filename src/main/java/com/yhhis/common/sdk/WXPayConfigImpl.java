package com.yhhis.common.sdk;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class WXPayConfigImpl extends WXPayConfig {

    private static WXPayConfigImpl INSTANCE;
    private byte[] certData;
    private String key;
    private String appID;
    private String mchID;

    private WXPayConfigImpl(String key, String appID, String mchID, String certLocalPath) throws Exception {
        this.appID = appID;
        this.key = key;
        this.mchID = mchID;
        String certPath = certLocalPath;
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public static WXPayConfigImpl getInstance(String key, String appID, String mchID, String certLocalPath) throws Exception {
        if (INSTANCE == null) {
            synchronized (WXPayConfigImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new WXPayConfigImpl(key, appID, mchID, certLocalPath);
                }
            }
        }
        return INSTANCE;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getMchID() {
        return this.mchID;
    }

    public String getKey() {
        return this.key;
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis;
        certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }


    public int getHttpConnectTimeoutMs() {
        return 2000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    public IWXPayDomain getWXPayDomain() {
        return WXPayDomainSimpleImpl.instance();
    }

    public String getPrimaryDomain() {
        return "api.mch.weixin.qq.com";
    }

    public String getAlternateDomain() {
        return "api2.mch.weixin.qq.com";
    }

    @Override
    public int getReportWorkerNum() {
        return 1;
    }

    @Override
    public int getReportBatchSize() {
        return 2;
    }
}
