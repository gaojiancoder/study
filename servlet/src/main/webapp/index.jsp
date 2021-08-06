<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>获取域对象</title>
</head>
<body>
<%
    Object upwd = request.getSession().getAttribute("upwd");
    Object name = request.getAttribute("name");
    System.out.println("uname："+upwd);
    System.out.println("uname："+name);
%>


</body>
</html>