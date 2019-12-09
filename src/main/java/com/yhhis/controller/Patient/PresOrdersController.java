package com.yhhis.controller.Patient;

import com.alibaba.fastjson.JSON;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.PresOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 患者总订单支付详情
 *
 * @author zzh
 */
@Controller
@RequestMapping("PresOrders")
public class PresOrdersController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    PresOrdersService presordersservice;

    /**
     * 根据流水号 患者卡号
     * 获取订单详情
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/orderInfo")
    @ResponseBody
    public void orderInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = response.getWriter();
        String serialno = request.getParameter("serialno");
        String cardno = request.getParameter("cardno");//流水号
        try {
            List<Map<String, Object>> result = presordersservice.orderTradeno(serialno, cardno);
            if (result != null && result.size() > 0) {
                map.put(ReturnCode.data, result);
                map.put(ReturnCode.message, "获取订单详情成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "获取订单详情为空");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "获取订单详情异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:orderInfo。message:获取订单详情异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }
}
