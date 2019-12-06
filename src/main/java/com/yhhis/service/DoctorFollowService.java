package com.yhhis.service;

import java.util.List;
import java.util.Map;

/**
 * 医生的粉丝
 *
 * @author fengxian
 */
public interface DoctorFollowService {
    //查询医生的粉丝
    List<Map<String, Object>> getDoctorsFans(String doccode, int size);

}
