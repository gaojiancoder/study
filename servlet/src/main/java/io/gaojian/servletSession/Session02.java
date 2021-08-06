package io.gaojian.servletSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *请求转发拿数据只有一次有用
 * 重定向多次访问地址都能拿到数据只要Session不销毁就可以
 */
@WebServlet(name = "02", value = "/02")
public class Session02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();//获取Session对象
        session.setAttribute("upwd", "123456");//设置Session域对象
        request.setAttribute("name", "gao");//设置request域对象

        request.getRequestDispatcher("index.jsp").forward(request, response);   //请求转发

        response.sendRedirect("index.jsp");//重定向
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
