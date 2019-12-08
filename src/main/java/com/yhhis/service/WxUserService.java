package com.yhhis.service;

import com.yhhis.common.entity.WxUser;
import org.apache.ibatis.annotations.Param;

public interface WxUserService {
    //获取患者用户信息
    WxUser getUser(@Param("openid") String openid);

    //添加患者用户信息
    int addUser(WxUser user);

    //更新患者用户信息
    public int updateUser(WxUser user);

}
