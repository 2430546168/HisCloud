package com.yhhis.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 医生端的评论中心信息
 *
 * @author fengxian
 */
public interface PatientEvaluationDao {
    //查询医生下所有患者对自己的评价信息
    List<Map<String, Object>> getEvaluationCenter(@Param("doccode") String doccode, @Param("size") int size);

}
