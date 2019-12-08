package com.yhhis.service.impl;

import com.yhhis.common.entity.Patients;
import com.yhhis.dao.PatientsDao;
import com.yhhis.service.PatientsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * zsg
 */
@Service("patientserviceimpl")
public class PatientsServiceImpl implements PatientsService {

    @Resource
    private PatientsDao patientsDao;

    /**
     * 订单总条数
     *
     * @return
     */
    @Override
    public int getPatientsCount() {
        return patientsDao.getPatientsCount();
    }

    /**
     * 查询订单（分页）
     *
     * @param begin
     * @param pageSize
     * @return
     */
    @Override
    public List<Map<String, Object>> getPatientsPage(Integer begin, Integer pageSize) {
        return patientsDao.getPatientsPage(begin, pageSize);
    }

    /**
     * 根据openid查询卡数量
     *
     * @param openid 微信用户openid
     * @return
     */
    @Override
    public int getCountPatient(String openid) {
        return patientsDao.getCountPatient(openid);
    }

    /**
     * 本地建卡根据用户（patient）
     *
     * @param patient 用户
     * @return
     */
    @Override
    public boolean newPatient(Patients patient) {
        return patientsDao.newPatient(patient);
    }

    /**
     * 本地绑卡
     *
     * @param cardNo 用户卡号
     * @param name   用户姓名
     * @param openid 微信用户openid
     * @return
     */
    @Override
    public List<Map<String, Object>> getBindPatient(String cardNo, String name, String openid) {
        return patientsDao.getBindPatient(cardNo, name, openid);
    }

    /**
     * 查询所有的电子卡
     *
     * @param openid 微信用户openid
     * @return
     */
    @Override
    public List<Patients> getAllCards(String openid) {
        return patientsDao.getAllCards(openid);
    }

    /**
     * 解绑电子卡
     *
     * @param patient
     * @return
     */
    @Override
    public int UntiedCard(Patients patient) {
        return patientsDao.UntiedCard(patient);
    }

    /**
     * 查询Patients
     *
     * @param idno 用户身份证
     * @return
     */
    @Override
    public Integer getPatientsByIdnoAndName(String idno) {
        return patientsDao.getPatientsByIdnoAndName(idno);
    }

    /**
     * @param openid 微信用户openid
     * @return
     */
    @Override
    public List<Patients> getPatientsByOpenid(String openid) {
        return patientsDao.getPatientsByOpenid(openid);
    }

    /**
     * 根据患者卡号查询openid
     */
    @Override
    public Patients getOpenid(String cardno) {
        // TODO Auto-generated method stub
        return patientsDao.getOpenid(cardno);
    }

    /**
     * 根据身份证和openid 判断是否有卡
     */
    @Override
    public List<Map<String, Object>> getCardByOpenid(String openid, String idno) {
        // TODO Auto-generated method stub
        return patientsDao.getCardByOpenid(openid, idno);
    }

    @Override
    public Integer updateOpenid(String openid, String idno) {
        return patientsDao.updateOpenid(openid, idno);
    }


}
