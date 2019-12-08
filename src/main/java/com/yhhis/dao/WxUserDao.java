package com.yhhis.dao;

import com.yhhis.common.entity.WxUser;
import org.apache.ibatis.annotations.Param;

public interface WxUserDao {
    WxUser getUser(@Param("openid") String openid);

    int addUser(WxUser user);

    //更新用户
    int updateUser(WxUser user);

}
