<%@ page import="java.util.UUID" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.08.2023
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>JSTL tags example</title>
</head>
<body>
<c:set var="UUID" value="${UUID.randomUUID().toString()}"/>
<c:out value="${UUID}"/>
<%--    <h1>  pagega otish tegi</h1>--%>
<%--<c:redirect url="https://online.pdp.uz"/>--%>
<%--      <h1> for each tegi</h1>--%>
<%--<c:forEach begin="1" end="10" var="i" step="3">--%>
<%--    <li>Item :<c:out value="${i}"/>--%>
<%--    </li>--%>
<%--</c:forEach>--%>
<br>
<%--<h1> if exesperrion</h1>--%>
<%--<c:if test="${8 eq 16 div 4}" var="result"/>--%>
<%--<c:out value="${result}"></c:out>--%>
<%--<h1> choose exesperrion</h1>--%>
<%--<c:choose>--%>
<%--    <c:when test="${15 gt 11}">--%>
<%--        <h1>15 katta 11 dan</h1>--%>
<%--    </c:when>--%>
<%--</c:choose>--%>
<c:catch var="e"> <% int a=12/0;%>
</c:catch>
<c:if test="${e!=null}">
    <c:out value="${e.message}"/>
</c:if>
</body>
</html>
