package com.yhhis.service;

import com.yhhis.common.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorAfterChildbirthEvalService {

    /**
     * 获取项目名称
     *
     * @return
     */
    public List<Object> getItems();

    /**
     * 通过项目编码获取医生评估内容
     *
     * @return
     */
    public List<Object> getEvaluates();

    /**
     * 通过项目编码和评估内容编码获取医生处理原则
     *
     * @return
     */
    public List<Object> getHandlers();


    /**
     * 通过项目编码和评估编码和处理原则编码获取评估选项
     *
     * @return
     */
    public List<Object> getAssessContexts();

    /**
     * 添加医生评估明细
     *
     * @param eval
     * @return
     */
    public boolean addDoctorEval(DoctorEval eval);

    /**
     * 获取医生所有详情
     *
     * @return
     */
    public List<DoctorEval> getDoctorEvalAll();

    /**
     * 通过患者卡号和创建时间获取医生评估详情
     *
     * @param cardno
     * @return
     */
    public List<DoctorEval> getDoctorEvalByCardnoAndCreateTime(@Param("cardno") String cardno);


}
