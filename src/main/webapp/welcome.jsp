<%--
  Created by IntelliJ IDEA.
  Modals.User: ADMIN
  Date: 2/2/2021
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="Modals.User"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>hello page</h3>
<%--code java trong jsp bằng cặp kểu ký tự <% %>--%>
<%
    // biến môi trường  request , response, out, session
    User user =(User) request.getAttribute("user");

%>
<h1><%=user.getName()%></h1>

</body>
</html>
