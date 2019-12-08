package com.yhhis.service.impl;


import com.yhhis.dao.PatientEvaluationDao;
import com.yhhis.service.PatientEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 医生端的评论中心信息
 *
 * @author fengxian
 */
@Service
public class PatientEvaluationServiceImpl implements PatientEvaluationService {
    @Autowired
    PatientEvaluationDao dao;

    /**
     * 查询医生下所有患者对自己的评价信息
     *
     * @param doccode
     * @return
     */

    @Override
    public List<Map<String, Object>> getEvaluationCenter(String doccode, int size) {
        return dao.getEvaluationCenter(doccode, size);
    }


}
