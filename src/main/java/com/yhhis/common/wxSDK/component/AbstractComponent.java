/*
 * 微信公众平台(JAVA) SDK
 *
 * Copyright (c) 2014, Ansitech Network Technology Co.,Ltd All rights reserved.
 *
 * http://www.weixin4j.org/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yhhis.common.wxSDK.component;

import com.yhhis.common.wxSDK.WeixinSupport;
import com.yhhis.common.wxSDK.pojo.Weixin;

/**
 * 微信组件基础类
 *
 * @author yangqisheng
 * @since 0.1.0
 */
public abstract class AbstractComponent extends WeixinSupport {

    public static Weixin weixin;

    public AbstractComponent(Weixin weixin) {
        if (weixin == null) {
            throw new IllegalArgumentException("weixin can not be null");
        }
        this.weixin = weixin;
    }
}
