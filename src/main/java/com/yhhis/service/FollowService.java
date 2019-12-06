package com.yhhis.service;


import com.yhhis.common.entity.FollowEntity;

import java.util.List;
import java.util.Map;

/**
 * 关注医生操作
 *
 * @author zzh
 */
public interface FollowService {
    //患者关注医生添加
    public int insert(FollowEntity f);

    //进入评价页面查询是否已关注 根据患者的openid 和医生的编号
    public List<Map<String, Object>> find(FollowEntity entity);

    //根据openid 获取关注的医生信息
    public List<Map<String, Object>> findDoctors(String cardno);

    //取消关注 根据openid 和医生编号 doccode
    public int deleInfo(FollowEntity entity);
}
