<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.08.2023
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Action jsp</title>
</head>
<body>
<jsp:useBean id="now" scope="application" class="com.example.jakartaeeservlet.CurrentDate" />
<h1>${now.now("Behzod")}</h1>
</body>
</html>
