package com.yhhis.common.wxSDK.pojo;

import com.yhhis.common.wxSDK.*;
import com.yhhis.common.wxSDK.component.AbstractComponent;
import com.yhhis.common.wxSDK.component.BaseComponent;
import com.yhhis.common.wxSDK.component.JsSdkComponent;
import com.yhhis.common.wxSDK.component.MessageComponent;
import com.yhhis.common.wxSDK.loader.DefaultTicketLoader;
import com.yhhis.common.wxSDK.loader.DefaultTokenLoader;
import com.yhhis.common.wxSDK.loader.ITicketLoader;
import com.yhhis.common.wxSDK.loader.ITokenLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信平台基础支持对象
 *
 * @author yangqisheng
 * @since 0.0.1
 */
public class Weixin extends WeixinSupport implements java.io.Serializable {

    /**
     * 同步锁
     */
    private final static byte[] LOCK = new byte[0];
    /**
     * 公众号开发者ID
     */
    private final String appId;
    /**
     * 公众号开发者密钥
     */
    private final String secret;
    /**
     * 公众号配置
     *
     * @since 0.1.3
     */
    private final WeixinConfig weixinConfig;
    /**
     * 微信支付配置
     *
     * @since 0.1.3
     */
    private final WeixinPayConfig weixinPayConfig;
    /**
     * 新增组件
     */
    private final Map<String, AbstractComponent> components = new HashMap<String, AbstractComponent>();
    /**
     * AccessToken加载器
     */
    protected ITokenLoader tokenLoader = new DefaultTokenLoader();
    /**
     * Ticket加载器
     */
    protected ITicketLoader ticketLoader = new DefaultTicketLoader();

    /**
     * 单公众号，并且只支持一个公众号方式
     */
    public Weixin() {
        this(Configuration.getOAuthAppId(), Configuration.getOAuthSecret());
    }

    /**
     * 多公众号，同一个环境中使用方式
     *
     * @param appId  公众号开发者AppId
     * @param secret 公众号开发者秘钥
     */
    public Weixin(String appId, String secret) {
        this.appId = appId;
        this.secret = secret;
        weixinConfig = new WeixinConfig();
        weixinConfig.setAppid(appId);
        weixinConfig.setSecret(secret);
        weixinConfig.setOriginalid(Configuration.getProperty("weixin4j.oauth.originalid"));
        weixinConfig.setEncodingtype(Configuration.getIntProperty("weixin4j.oauth.encodingtype"));
        weixinConfig.setEncodingaeskey(Configuration.getProperty("weixin4j.oauth.encodingaeskey"));
        weixinConfig.setOauthUrl(Configuration.getProperty("weixin4j.oauth.url"));
        weixinConfig.setApiDomain(Configuration.getProperty("weixin4j.api.domain"));
        weixinPayConfig = new WeixinPayConfig();
        weixinPayConfig.setPartnerId(Configuration.getProperty("weixin4j.pay.partner.id"));
        weixinPayConfig.setPartnerKey(Configuration.getProperty("weixin4j.pay.partner.key"));
        weixinPayConfig.setNotifyUrl(Configuration.getProperty("weixin4j.pay.notify_url"));
        weixinPayConfig.setCertPath(Configuration.getProperty("weixin4j.http.cert.path"));
        weixinPayConfig.setCertSecret(Configuration.getProperty("weixin4j.http.cert.secret"));
    }

    /**
     * 外部配置注入方式，更灵活
     *
     * @param weixinConfig 微信公众号配置
     * @since 0.1.3
     */
    public Weixin(WeixinConfig weixinConfig) {
        this(weixinConfig, null);
    }

    /**
     * 外部配置注入方式（带微信支付），更灵活
     *
     * @param weixinPayConfig 微信支付配置
     * @since 0.1.3
     */
    public Weixin(WeixinPayConfig weixinPayConfig) {
        this.appId = Configuration.getOAuthAppId();
        this.secret = Configuration.getOAuthSecret();
        weixinConfig = new WeixinConfig();
        weixinConfig.setAppid(Configuration.getOAuthAppId());
        weixinConfig.setSecret(Configuration.getOAuthSecret());
        weixinConfig.setOriginalid(Configuration.getProperty("weixin4j.oauth.originalid"));
        weixinConfig.setEncodingtype(Configuration.getIntProperty("weixin4j.oauth.encodingtype"));
        weixinConfig.setEncodingaeskey(Configuration.getProperty("weixin4j.oauth.encodingaeskey"));
        weixinConfig.setOauthUrl(Configuration.getProperty("weixin4j.oauth.url"));
        weixinConfig.setApiDomain(Configuration.getProperty("weixin4j.api.domain"));
        this.weixinPayConfig = weixinPayConfig;
    }

    /**
     * 外部配置注入方式（带微信支付），更灵活
     *
     * @param weixinConfig    微信公众号配置
     * @param weixinPayConfig 微信支付配置
     * @since 0.1.3
     */
    public Weixin(WeixinConfig weixinConfig, WeixinPayConfig weixinPayConfig) {
        this.appId = weixinConfig.getAppid();
        this.secret = weixinConfig.getSecret();
        this.weixinConfig = weixinConfig;
        this.weixinPayConfig = weixinPayConfig;
    }

    public String getAppId() {
        return appId;
    }

    public String getSecret() {
        return secret;
    }

    /**
     * 获取Token对象
     *
     * @return Token对象
     * 微信操作异常
     * @since 0.1.0
     */
    public Token getToken() throws WeixinException {
        Token token = tokenLoader.get();
        if (token == null) {
            synchronized (LOCK) {
                token = tokenLoader.get();
                if (token == null) {
                    token = base().token();
                    tokenLoader.refresh(token);
                }
            }
        }
        return token;
    }

    /**
     * 获取jsapi开发ticket
     *
     * @return jsapi_ticket
     * 微信操作异常
     */
    public Ticket getJsApiTicket() throws WeixinException {
        Ticket ticket = ticketLoader.get(TicketType.JSAPI);
        if (ticket == null) {
            synchronized (LOCK) {
                ticket = ticketLoader.get(TicketType.JSAPI);
                if (ticket == null) {
                    ticket = js().getJsApiTicket();
                    ticketLoader.refresh(ticket);
                }
            }
        }
        return ticket;
    }

    public BaseComponent base() {
        String key = BaseComponent.class.getName();
        if (components.containsKey(key)) {
            return (BaseComponent) components.get(key);
        }
        BaseComponent component = new BaseComponent(this);
        components.put(key, component);
        return component;
    }

    public JsSdkComponent js() {
        String key = JsSdkComponent.class.getName();
        if (components.containsKey(key)) {
            return (JsSdkComponent) components.get(key);
        }
        JsSdkComponent component = new JsSdkComponent(this);
        components.put(key, component);
        return component;
    }

//    public UserComponent user() {
//        String key = UserComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (UserComponent) components.get(key);
//        }
//        UserComponent component = new UserComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public SnsComponent sns() {
//        String key = SnsComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (SnsComponent) components.get(key);
//        }
//        SnsComponent component = new SnsComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public SnsComponent sns(String authorize_url) {
//        String key = SnsComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (SnsComponent) components.get(key);
//        }
//        SnsComponent component = new SnsComponent(this, authorize_url);
//        components.put(key, component);
//        return component;
//    }
//
//    public TagsComponent tags() {
//        String key = TagsComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (TagsComponent) components.get(key);
//        }
//        TagsComponent component = new TagsComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public GroupsComponent groups() {
//        String key = GroupsComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (GroupsComponent) components.get(key);
//        }
//        GroupsComponent component = new GroupsComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public PayComponent pay() {
//        String key = PayComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (PayComponent) components.get(key);
//        }
//        PayComponent component = new PayComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public RedpackComponent redpack() {
//        String key = RedpackComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (RedpackComponent) components.get(key);
//        }
//        RedpackComponent component = new RedpackComponent(this);
//        components.put(key, component);
//        return component;
//    }

    public MessageComponent message() {
        String key = MessageComponent.class.getName();
        if (components.containsKey(key)) {
            return (MessageComponent) components.get(key);
        }
        MessageComponent component = new MessageComponent(this);
        components.put(key, component);
        return component;
    }
//
//    public MenuComponent menu() {
//        String key = MenuComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (MenuComponent) components.get(key);
//        }
//        MenuComponent component = new MenuComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    @Deprecated
//    public MediaComponent media() {
//        String key = MediaComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (MediaComponent) components.get(key);
//        }
//        MediaComponent component = new MediaComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    @Deprecated
//    public FileComponent file() {
//        String key = FileComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (FileComponent) components.get(key);
//        }
//        FileComponent component = new FileComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public MaterialComponent material() {
//        String key = MaterialComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (MaterialComponent) components.get(key);
//        }
//        MaterialComponent component = new MaterialComponent(this);
//        components.put(key, component);
//        return component;
//    }
//
//    public QrcodeComponent qrcode() {
//        String key = QrcodeComponent.class.getName();
//        if (components.containsKey(key)) {
//            return (QrcodeComponent) components.get(key);
//        }
//        QrcodeComponent component = new QrcodeComponent(this);
//        components.put(key, component);
//        return component;
//    }

    /**
     * 获取微信配置对象
     *
     * @return 微信配置对象
     * @since 0.1.3
     */
    public WeixinConfig getWeixinConfig() {
        return weixinConfig;
    }

    /**
     * 获取微信支付配置对象
     *
     * @return 微信支付配置对象
     * @since 0.1.3
     */
    public WeixinPayConfig getWeixinPayConfig() {
        return weixinPayConfig;
    }
}