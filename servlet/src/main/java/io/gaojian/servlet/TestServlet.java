package io.gaojian.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer url = request.getRequestURL();
        System.out.println("获取全部路径"+url);
        String uri = request.getRequestURI();
        System.out.println("获取部分路径"+uri);
        String queryString = request.getQueryString();
        System.out.println("请求时参数字符串"+queryString);
        String method = request.getMethod();
        System.out.println("请求方式"+method);
        String protocol = request.getProtocol();
        System.out.println("协议版本"+protocol);
        String path = request.getContextPath();
        System.out.println("项目站点名"+path);
        String parameter = request.getParameter("uname");
        System.out.println(""+parameter);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
