package io.gaojian.servletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * 响应数据
 * getWrite
 * getOutputStream
 */
@WebServlet(name = "Servlet1", value = "/1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletOutputStream out= response.getOutputStream();//得到字节输出流
        out.write("hi".getBytes(StandardCharsets.UTF_8));//输出字节

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
