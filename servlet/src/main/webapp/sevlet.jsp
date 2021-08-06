<%--
  Created by IntelliJ IDEA.
  User: gaojian
  Date: 8/6/21
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--java在jsp中写代码需要用"%"-->
<%
  //获取参数
  String uname = request.getParameter("uname");
  //获取request作用域
  String upwd = (String) request.getAttribute("upwd");

  //输出内容
    System.out.println(uname);
    System.out.println(upwd);
%>
</body>
</html>
