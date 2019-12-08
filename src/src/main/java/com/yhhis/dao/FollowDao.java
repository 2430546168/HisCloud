package com.yhhis.dao;

import com.yhhis.common.entity.FollowEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 患者关注医生操作
 *
 * @author zzh
 */
public interface FollowDao {
    //患者关注医生时添加
    int insert(FollowEntity f);

    //进入评价页面查询是否已关注 根据患者的openid 和医生的编号
    List<Map<String, Object>> find(FollowEntity entity);

    //根据卡号 获取关注的医生信息
    List<Map<String, Object>> findDoctors(@Param("cardno") String openid);

    //根据 openid 和医生编号取消关注
    int deleInfo(FollowEntity entity);
}
