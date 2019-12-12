package com.yhhis.service;


import com.yhhis.common.entity.EvaluatePj;

import java.util.List;
import java.util.Map;

/**
 * 评价接口
 *
 * @author zzh
 */
public interface EvaluateService {
    //添加患者对医生的评价
    public int insert(EvaluatePj e);

    //根据openid 获取所有的评价信息
    public List<Map<String, Object>> findEvalate(String cardno, int size);

    //删除评价列表 （update 修改状态为0）
    public int deleteEvalate(String pjdate, String patientid, String doccode, String clinicno);
}
