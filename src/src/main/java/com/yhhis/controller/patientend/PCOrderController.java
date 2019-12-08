package com.yhhis.controller.patientend;

import com.alibaba.fastjson.JSON;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.entity.PageBean;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.RegisterOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/registerOrder")
public class PCOrderController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private RegisterOrderService registerOrderService;

    /**
     * 查询挂号订单列表
     *
     * @param request
     * @param response
     * @param page
     */
    @RequestMapping(value = "/findregisterOrder", method = RequestMethod.POST)
    @ResponseBody
    public void getegisterOrder(HttpServletRequest request, HttpServletResponse response, PageBean page) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            writer = response.getWriter();
            page.setCount(registerOrderService.getRegisterOrderCount());
            //获取挂号列表  分页
            List<Map<String, Object>> result = registerOrderService.getRegisterOrderPage(page.getBegin(), page.getPageSize());
            int count = registerOrderService.getRegisterOrderCount();
            // 查询总条数
            if (result != null && result.size() > 0) {
                map.put("count", count);
                map.put("pageCount", page.getPageCount());// 总页数
                map.put("nowPage", page.getNowPage());// 当前页
                map.put(ReturnCode.data, result);
                map.put(ReturnCode.message, "挂号订单列表获取成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "挂号订单列表获取失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "挂号订单列表获取异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:findregisterOrder。message:查询挂号订单列表异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }
}
