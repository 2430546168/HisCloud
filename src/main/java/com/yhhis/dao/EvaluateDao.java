package com.yhhis.dao;

import com.yhhis.common.entity.EvaluatePj;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 评价dao 层
 *
 * @author zzh
 */
public interface EvaluateDao {
    //添加患者对医生的评价
    int insert(EvaluatePj e);

    //根据cardno 获取所有的评价信息
    List<Map<String, Object>> findEvalate(@Param("cardno") String cardno, @Param("size") int size);

    //删除评价列表 （update 修改状态为0）
    int deleteEvalate(@Param("pjdate") String pjdate, @Param("patientid") String patientid, @Param("doccode") String doccode, @Param("clinicno") String clinicno);
}
