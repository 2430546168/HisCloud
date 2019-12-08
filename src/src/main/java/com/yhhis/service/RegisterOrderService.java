package com.yhhis.service;

import java.util.List;
import java.util.Map;


public interface RegisterOrderService {
    /**
     * 挂号列表总条数patients
     *
     * @return
     */
    public int getRegisterOrderCount();

    /**
     * 查询挂号列表patients
     *
     * @param begin
     * @param pageSize
     * @return
     */
    public List<Map<String, Object>> getRegisterOrderPage(Integer begin, Integer pageSize);


}
