package com.yhhis.service.impl;

import com.yhhis.common.entity.StaffDict;
import com.yhhis.dao.StaffDictDao;
import com.yhhis.service.StaffDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffDictServiceImpl implements StaffDictService {
    @Autowired
    StaffDictDao staffDictDao;

    @Override
    public List<StaffDict> getAllDoctors(String deptCode) {
        return staffDictDao.getAllDoctors(deptCode);
    }

    @Override
    public int updateOnlineStatus(String userName, String onlineStatus) {
        return staffDictDao.updateOnlineStatus(userName, onlineStatus);
    }
}
