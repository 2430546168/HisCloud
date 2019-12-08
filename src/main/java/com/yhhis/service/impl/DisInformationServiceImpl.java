package com.yhhis.service.impl;

import com.yhhis.common.entity.DisInformation;
import com.yhhis.dao.DisInformationDao;
import com.yhhis.service.DisInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisInformationServiceImpl implements DisInformationService {

    @Autowired
    private DisInformationDao disInformationDao;

    @Override
    public int insertInformaintion(DisInformation disInformation) {
        return disInformationDao.insertInformaintion(disInformation);
    }
}
