package com.yhhis.service.impl;

import com.yhhis.common.entity.ResultObject;
import com.yhhis.dao.CertificateDao;
import com.yhhis.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    CertificateDao certificateDao;

    @Override
    public int addImage(String doctorNo, String imageUrl) {
        return certificateDao.addImage(doctorNo, imageUrl);
    }

    @Override
    public List<ResultObject> getAll(String docCode) {
        return certificateDao.getAll(docCode);
    }

    @Override
    public int delete(String imageUrl) {
        return certificateDao.delete(imageUrl);
    }
}
