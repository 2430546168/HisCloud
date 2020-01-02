package com.yhhis.service;

import com.yhhis.common.entity.ResultObject;

import java.util.List;

public interface CertificateService {
    int addImage(String doctorNo, String imageUrl);

    List<ResultObject> getAll(String docCode);

    int delete(String imageUrl);

}
