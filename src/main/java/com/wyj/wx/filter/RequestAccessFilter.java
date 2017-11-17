package com.wyj.wx.filter;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @Author:amorsueno
 * @Description:
 * @Date: 2017/11/17 17:02
 *
 */
@Component
@Log4j2
public class RequestAccessFilter implements  javax.servlet.Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) resp;
        response.setHeader("","");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        log.info("***************** *doFilter RequestAccessFilter *****************");
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {}
}
