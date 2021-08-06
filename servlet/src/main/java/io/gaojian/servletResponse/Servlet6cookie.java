package io.gaojian.servletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Cookie的创建和发送
 */
@WebServlet(name = "6", value = "/6")
public class Servlet6cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Cookie cookie = new Cookie("name","admin");//创建cookie
//        response.addCookie(cookie);//发送cookie

        Cookie[] cookies= request.getCookies();//获取cookie数组
        if (cookies!=null&&cookies.length>0){
            for (Cookie cookie:cookies) //遍历数组
            {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("name:"+name +",value"+value);
            }
        }


        }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
