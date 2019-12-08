package com.yhhis.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Session_Filter implements Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        req.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        /*HttpSession session = req.getSession();
        session.setAttribute("hisInfo", "");
        Object openid = session.getAttribute("openid");*/
        /// System.out.println(openid);

        //  String userAgent = req.getHeader("user-agent").toLowerCase();
/*        if(userAgent.indexOf("micromessenger")>-1){
        	req.setAttribute("isWx", "1");
        	System.out.println("微信端");
        }else{
        	//不是微信端提示请使用微信打开
        	req.setAttribute("isWx", "0");
        	System.out.println("不是微信端");
        }*/
        chain.doFilter(request, response);
       /*if(openid!=null){
        	//没有登录返回首页
        	//请求转发
        	req.getRequestDispatcher("/index.html").forward(request, response);
        	//resp.encodeRedirectURL("URL"); 重定向
        }else{
        	chain.doFilter(request, response);
        }*/
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }

}
