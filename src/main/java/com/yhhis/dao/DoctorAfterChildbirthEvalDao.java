package com.yhhis.dao;

import com.yhhis.common.entity.*;
import org.apache.ibatis.annotations.Param;


import javax.websocket.server.PathParam;
import java.util.List;

public interface DoctorAfterChildbirthEvalDao {


    /**
     * 获取项目名称
     *
     * @return
     */
    public List<Object> getItems();

    /**
     * 通过项目编码获取医生评估内容
     *
     * @param itemCode 项目编码
     * @return
     */
    public List<Object> getEvaluates();

    /**
     * 通过项目编码和评估内容编码获取医生处理原则
     *
     * @param itemCode 项目编码
     * @param evalCode 处理原则编码
     * @return
     */
    public List<Object> getHandlers();


    /**
     * 通过项目编码和评估编码和处理原则编码获取评估选项
     *
     * @param itemCode    项目编码
     * @param evalCode    评估内容编码
     * @param handlerCode 处理原则编码
     * @return
     */
    public List<Object> getAssessContexts
    ();

    /**
     * 向医生评估详情表添加数据
     *
     * @param doctorEval
     * @return
     */
    public int addDoctorEval(DoctorEval doctorEval);

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
