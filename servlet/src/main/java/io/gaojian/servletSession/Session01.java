package io.gaojian.servletSession;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * request.getSession()  获取Session对象
 * 会先判断是否存在Session有则获取没有就创建
 */
@WebServlet(name = "01", value = "/01")
public class Session01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();//获取Session对象
        String id = session.getId();//获取Session的会话标识符
        System.out.println(id);
        System.out.println(session.getCreationTime());//获取Session创建时间
        System.out.println(session.getLastAccessedTime());//最后一次访问时间
        System.out.println(session.isNew());//是否为新的Session对象

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
