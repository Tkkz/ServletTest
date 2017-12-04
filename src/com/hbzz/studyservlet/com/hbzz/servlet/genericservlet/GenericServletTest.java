package com.hbzz.studyservlet.com.hbzz.servlet.genericservlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * 抽象类GenericServlet
 * abstract class GenericServlet implements Servlet, ServletConfig, Serializable {
 */
public class GenericServletTest extends GenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
