package com.yhhis.service.impl;

import com.yhhis.common.entity.FollowEntity;
import com.yhhis.dao.FollowDao;
import com.yhhis.service.FollowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 关注操作
 *
 * @author zzh
 */
@Service
public class FollowServiceImpl implements FollowService {
    @Resource
    private FollowDao dao;

    //患者关注医生添加
    @Override
    public int insert(FollowEntity f) {
        return dao.insert(f);
    }

    //进入评价页面查询是否已关注 根据患者的openid 和医生的编号
    @Override
    public List<Map<String, Object>> find(FollowEntity entity) {
        return dao.find(entity);
    }

    //根据openid 获取关注的医生信息
    @Override
    public List<Map<String, Object>> findDoctors(String cardno) {
        return dao.findDoctors(cardno);
    }

    //根据openid 取消关注 和医生编号 doccode
    @Override
    public int deleInfo(FollowEntity entity) {
        return dao.deleInfo(entity);
    }


}
