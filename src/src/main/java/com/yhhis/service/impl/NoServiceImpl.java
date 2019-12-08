package com.yhhis.service.impl;


import com.yhhis.dao.INoDao;
import com.yhhis.service.NoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class NoServiceImpl implements NoService {
    @Resource
    INoDao noDao;

    public int getNo(String type, long max) {
        int no = 0;
        try {
            no = noDao.getNo(type);
        } catch (Exception e) {
            e.printStackTrace();
            noDao.newNo(type);
        }
        if (no == 0) {
            no = 1;
        } else {
            noDao.updateNo(type, max);
        }
        return no;
    }
}
