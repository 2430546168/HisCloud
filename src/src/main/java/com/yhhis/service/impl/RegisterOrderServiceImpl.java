package com.yhhis.service.impl;


import com.yhhis.dao.RegisterOrderDao;
import com.yhhis.service.RegisterOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegisterOrderServiceImpl implements RegisterOrderService {

    @Autowired
    private RegisterOrderDao registerOrderDao;

    /**
     * 查询订单总条数
     */
    public int getRegisterOrderCount() {
        return registerOrderDao.getRegisterOrderCount();
    }

    /**
     * 查询订单分页
     */
    public List<Map<String, Object>> getRegisterOrderPage(Integer begin, Integer pageSize) {
        return registerOrderDao.getRegisterOrderPage(begin, pageSize);
    }


}
