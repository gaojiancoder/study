package io.gaojian.servletContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "11", value = "/11")
public class Servletcontext01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过request对象获取
        ServletContext servletContext = request.getServletContext();
        //通过Session对象获取
        ServletContext servletContext2 = request.getSession().getServletContext();
        //通过ServletConfig对象获取
        ServletContext servletContext1 = getServletConfig().getServletContext();
        //直接获取
        ServletContext servletContext3 = getServletContext();

        //常用方法
        String serverInfo = request.getServletContext().getServerInfo();//获取当前服务器版本信息
        System.out.println("当前服务器版本信息："+serverInfo);
        String contextPath = request.getServletContext().getContextPath();//获取项目真实路径
        System.out.println("项目真实路径："+contextPath);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
