package io.gaojian.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", value = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        StringBuffer url = request.getRequestURL();
//        System.out.println("获取全部路径"+url);
//        String uri = request.getRequestURI();
//        System.out.println("获取部分路径"+uri);
//        String queryString = request.getQueryString();
//        System.out.println("请求时参数字符串"+queryString);
//        String method = request.getMethod();
//        System.out.println("请求方式"+method);
//        String protocol = request.getProtocol();
//        System.out.println("协议版本"+protocol);
//        String path = request.getContextPath();
//        System.out.println("项目站点名"+path);

        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        System.out.println("uname :"+uname);
        System.out.println("upwd :"+upwd);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        new StringBuilder().append("name:  " + name);
        PrintWriter writer = response.getWriter();
        writer.println(name);
    }
}
