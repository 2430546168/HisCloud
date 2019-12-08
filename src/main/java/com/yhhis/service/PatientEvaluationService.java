package com.yhhis.service;

import java.util.List;
import java.util.Map;

/**
 * 医生端的评论中心信息
 *
 * @author fengxian
 */
public interface PatientEvaluationService {
    /**
     * 查询医生下所有患者对自己的评价信息
     *
     * @param doccode 医生编号
     * @return
     */
    public List<Map<String, Object>> getEvaluationCenter(String doccode, int size);
}
