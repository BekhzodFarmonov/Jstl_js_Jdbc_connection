<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.08.2023
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scripting jsp</title>
    <link rel="stylesheet" href="/recourse/css/main.css">
</head>
<body>
 <% if(request.getMethod().equals("GET")){%>
 <form method="post">
     <label for="name">FullName</label>
     <input type="text" id="name" name="fullName" placeholder="john doe">
     <label for="age">Age</label>
     <input type="number" id="age" name="age" placeholder="28">
     <input type="submit" value="send">
 </form>
<% }   %>

 <% if(request.getMethod().equals("POST")){%>
 <h1> fullName:  <%= request.getParameter("fullName")%></h1>
 <P>age : <%= request.getParameter("age")%>
 </P>
 <% }   %>

</body>
</html>
