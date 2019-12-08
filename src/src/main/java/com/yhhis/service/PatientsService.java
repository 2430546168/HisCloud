package com.yhhis.service;

import com.yhhis.common.entity.Patients;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface PatientsService {


    /**
     * 订单总条数
     *
     * @return
     */
    int getPatientsCount();

    /**
     * 查询订单
     *
     * @param begin
     * @param pageSize
     * @return
     */
    List<Map<String, Object>> getPatientsPage(Integer begin, Integer pageSize);

    /**
     * 查询openid的卡数量
     *
     * @param openid
     * @return
     */
    int getCountPatient(String openid);

    /**
     * 本地建卡
     *
     * @param patient
     * @return
     */
    boolean newPatient(Patients patient);

    /**
     * 本地绑卡
     *
     * @param cardNo
     * @param name
     * @param openid
     * @return
     */
    List<Map<String, Object>> getBindPatient(String cardNo, String name, String openid);

    /**
     * 查询所有的电子卡
     *
     * @param openid
     * @return
     */
    List<Patients> getAllCards(String openid);

    /**
     * 解绑电子卡
     *
     * @param patient
     * @return
     */
    int UntiedCard(Patients patient);


    /**
     * 查询Patients
     *
     * @param idno
     * @return
     */
    Integer getPatientsByIdnoAndName(String idno);

    /**
     * 通过openid
     *
     * @param openid
     * @return
     */
    List<Patients> getPatientsByOpenid(String openid);

    /**
     * 根据患者卡号获取openid
     *
     * @param cardno
     * @return
     */
    public Patients getOpenid(String cardno);

    /**
     * 根据身份证和openid 判断是否有卡
     *
     * @param openid
     * @param idno   身份证
     * @return
     */
    List<Map<String, Object>> getCardByOpenid(String openid, String idno);

    /**
     * 更新openid
     *
     * @param openid
     * @param idno
     * @return
     */
    Integer updateOpenid(@Param("openid") String openid, @Param("idno") String idno);
}
