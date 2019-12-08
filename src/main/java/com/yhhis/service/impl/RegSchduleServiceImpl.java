package com.yhhis.service.impl;


import com.yhhis.dao.RegSchduleDao;
import com.yhhis.service.RegScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * pc端 医生排班信息
 *
 * @author zzh
 */
@Service
public class RegSchduleServiceImpl implements RegScheduleService {
    @Resource
    RegSchduleDao regSchduleDao;

    /**
     * 总条数
     */
    @Override
    public int getCount() {
        return regSchduleDao.getCount();
    }

    /**
     * 排班分页
     */
    @Override
    public List<Map<String, Object>> getPage(Integer begin, Integer pageSize) {
        return regSchduleDao.getPage(begin, pageSize);
    }


}
