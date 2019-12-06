package com.yhhis.service.impl;

import com.yhhis.common.entity.*;
import com.yhhis.dao.DoctorAfterChildbirthEvalDao;
import com.yhhis.service.DoctorAfterChildbirthEvalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorAfterChildbirthEvalServiceImpl implements DoctorAfterChildbirthEvalService {

    @Autowired
    private DoctorAfterChildbirthEvalDao doctorAfterChildbirthEvalDao;


    /**
     * 获取医生评估项目
     *
     * @return
     */
    @Override
    public List<Object> getItems() {
        return doctorAfterChildbirthEvalDao.getItems();
    }

    /**
     * 获取医生评估内容
     *
     * @return
     */
    @Override
    public List<Object> getEvaluates() {
        List<Object> evaluates = doctorAfterChildbirthEvalDao.getEvaluates();
        return evaluates;
    }

    /**
     * 获取医生处理原则
     *
     * @return
     */
    @Override
    public List<Object> getHandlers() {
        return doctorAfterChildbirthEvalDao.getHandlers();
    }

    /**
     * 获取评估选项
     *
     * @return
     */
    @Override
    public List<Object> getAssessContexts() {
        return doctorAfterChildbirthEvalDao.getAssessContexts();
    }

    /**
     * 添加医生评估详情
     *
     * @param eval
     * @return
     */
    @Override
    public boolean addDoctorEval(DoctorEval eval) {
        int count = doctorAfterChildbirthEvalDao.addDoctorEval(eval);
        if (count == 1)
            return true;
        else
            return false;
    }

    /**
     * 获取医生所有评估详情
     *
     * @return
     */
    @Override
    public List<DoctorEval> getDoctorEvalAll() {

        return doctorAfterChildbirthEvalDao.getDoctorEvalAll();
    }

    /**
     * 通过患者卡号和创建时间获取医生评估详情
     *
     * @param cardno
     * @return
     */
    @Override
    public List<DoctorEval> getDoctorEvalByCardnoAndCreateTime(String cardno) {
        return doctorAfterChildbirthEvalDao.getDoctorEvalByCardnoAndCreateTime(cardno);
    }


}
