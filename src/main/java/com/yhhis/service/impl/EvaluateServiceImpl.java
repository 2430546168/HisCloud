package com.yhhis.service.impl;


import com.yhhis.common.entity.EvaluatePj;
import com.yhhis.dao.EvaluateDao;
import com.yhhis.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 患者对医生的评价
 *
 * @author zzh
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    EvaluateDao dao;

    /**
     * 添加患者对医生的评价
     */
    @Override
    public int insert(EvaluatePj e) {
        return dao.insert(e);
    }

    //根据cardno 获取对医生的评价信息
    @Override
    public List<Map<String, Object>> findEvalate(String cardno, int size) {
        return dao.findEvalate(cardno, size);
    }

    //删除评价列表 （update 修改状态为0）
    @Override
    public int deleteEvalate(String pjdate, String patientid, String doccode, String clinicno) {
        return dao.deleteEvalate(pjdate, patientid, doccode, clinicno);
    }

}
