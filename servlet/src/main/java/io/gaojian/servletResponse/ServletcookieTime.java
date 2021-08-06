package io.gaojian.servletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "time", value = "/time")
public class ServletcookieTime extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", "zhangsan");
        cookie.setMaxAge(0);//到期时间 -1：关闭就失效  正数：存活时间  负数：删除cookie
        response.addCookie(cookie);//响应
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
