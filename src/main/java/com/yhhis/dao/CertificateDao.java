package com.yhhis.dao;

import com.yhhis.common.entity.ResultObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CertificateDao {
    int addImage(@Param("doctorNo") String doctorNo, @Param("imageUrl") String imageUrl);

    List<ResultObject> getAll(@Param("doctorNo") String docCode);

    int delete(@Param("imageUrl") String imageUrl);
}
