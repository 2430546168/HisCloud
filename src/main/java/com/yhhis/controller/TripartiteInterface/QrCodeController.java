package com.yhhis.controller.TripartiteInterface;

import com.alibaba.fastjson.JSON;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.common.util.SMSUtil;
import com.yhhis.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 发送验证码
 */
@Controller
@RequestMapping("/code")
public class QrCodeController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    RedisServiceImpl redisServiceImpl;

    /**
     * 发送验证码
     *
     * @throws IOException
     */
    @RequestMapping(value = "/sendcode", method = RequestMethod.POST)
    @ResponseBody
    public void sendnumtest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String phone = request.getParameter("phone");// 手机号
        Map<String, Object> map = new HashMap<String, Object>();
        Integer code = (int) ((Math.random() * 9 + 1) * 100000);// 随机验证码
        PrintWriter writer = response.getWriter();
        redisServiceImpl.setTime("phone_" + phone, code.toString(), 1L);
        SMSUtil.getRequest2(phone, code);
        map.put(ReturnCode.data, code);
        map.put(ReturnCode.message, "验证码信息录入成功(已发送)");
        map.put(ReturnCode.status, "1");
        writer.print(JSON.toJSONString(map));
        writer.flush();
        writer.close();
    }
}
