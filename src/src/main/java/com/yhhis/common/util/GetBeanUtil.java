package com.yhhis.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * 获取spring 的bean
 *
 * @author fengxian
 */

public class GetBeanUtil {
    /**
     * 获取对应的bean
     *
     * @param servletContext
     * @param beanName
     * @return
     */
    public static Object getObjectFromApplication(ServletContext servletContext, String beanName) {
        // 通过WebApplicationContextUtils 得到Spring容器的实例。
        ApplicationContext application = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        // 返回Bean的实例。
        return application.getBean(beanName);
    }

}
