package com.yhhis.common.filter;

import com.yhhis.common.util.GetBeanUtil;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * 监听session 过期自动销毁
 */
public class DoctorLoginSessionListener implements HttpSessionListener {

    private static int sessioncount = 0;

    public static synchronized int getcount() {
        return sessioncount++;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session创建：" + getcount());
    }

    //session 销毁时执行
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        Object doccode = session.getAttribute("doccode");
        RedisTemplate<String, String> redisTemplate = (RedisTemplate<String, String>) GetBeanUtil.getObjectFromApplication(se.getSession().getServletContext(), "redisTemplate");
        if (doccode != null) {
            redisTemplate.delete(doccode.toString());
        }
    }
}
