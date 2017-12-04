package com.hbzz.studyservlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;


/**
 * Created by sssss on 2017/12/2.
 */
public class ServletParamsConfigTest implements Servlet {

   ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
            this.config=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        //获取servlet名字
        String confname=config.getServletName();
        System.out.println(confname);
        //获取上下文servletContext对象
        ServletContext context=config.getServletContext();//域对象，内部有一个map用来存储参数 它的寿命特别上 一个项目有一个servletContext对象
        System.out.println(context);

        //获取servlet的初始化配置参数
        String params=config.getInitParameter("zhangsan");
        System.out.println(params);
        System.out.println("===============================================");
        //获取servlet所有的初始化参数
        Enumeration collecs=config.getInitParameterNames();
        while (collecs.hasMoreElements()){
            String paramName= (String) collecs.nextElement();
            String initParameter=config.getInitParameter(paramName);
            System.out.println(initParameter);
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
