package com.yhhis.service.impl;

import com.yhhis.dao.DoctorFollowDao;
import com.yhhis.service.DoctorFollowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 医生的粉丝
 *
 * @author fengxian
 */
@Service
public class DoctorFollowServiceImpl implements DoctorFollowService {
    @Resource
    private DoctorFollowDao doctorFollowDao;

    @Override
    public List<Map<String, Object>> getDoctorsFans(String doccode, int size) {
        // TODO Auto-generated method stub
        return doctorFollowDao.getDoctorsFans(doccode, size);
    }
}
