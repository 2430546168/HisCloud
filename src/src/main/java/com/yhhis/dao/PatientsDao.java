package com.yhhis.dao;

import com.yhhis.common.entity.Patients;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface PatientsDao {
    //卡的数量
    int getCountPatient(@Param("phone") String phone);

    //在本地数据库建卡操作
    boolean newPatient(Patients patient);

    //绑卡
    List<Map<String, Object>> getBindPatient(@Param("cardno") String cardNo, @Param("name") String name,
                                             @Param("openid") String openid);

    //查询所有的电子卡
    List<Patients> getAllCards(@Param("openid") String openid);

    //解绑电子卡
    int UntiedCard(Patients patient);

    //通过身份证个名字查询信息
    Integer getPatientsByIdnoAndName(@Param("idno") String idno);

    //通过opneid查询个人信息
    List<Patients> getPatientsByOpenid(@Param("openid") String openid);

    //总条数
    int getPatientsCount();

    //分页
    List<Map<String, Object>> getPatientsPage(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);

    //根据患者卡号获取openid
    public Patients getOpenid(@Param("cardno") String cardno);

    //根据身份证和openid 判断是否有卡
    List<Map<String, Object>> getCardByOpenid(@Param("openid") String openid, @Param("idno") String idno);

    //更新openid
    Integer updateOpenid(@Param("openid") String openid, @Param("idno") String idno);
}
