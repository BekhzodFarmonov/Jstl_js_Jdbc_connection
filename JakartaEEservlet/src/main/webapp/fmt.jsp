<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>fmt jstl page</title>
</head>
<body>
<%--<h3> formatted number </h3>--%>
<%--<c:set var="number" value="${200 div 3}"/>--%>
<%--<h1>${number}</h1>--%>
<%--<fmt:formatNumber value="${number}" type="currency" var="cur"/>--%>
<%--<h3>${cur}</h3>--%>
<%--<fmt:formatNumber value="${number}" type="number" var="num1"/>--%>
<%--<h3>${num1}</h3>--%>
<hr/>
<%--<h3> formateDate </h3>--%>
<%--<c:set value="<%= new Date()%>" var="now"/>--%>
<%--<fmt:formatDate value="${now}" var="def_now" pattern="yyyy-MM-dd HH:mm:ss"/>--%>
<%--<h2>${def_now}</h2>--%>
<fmt:setLocale value="uz"/>
<fmt:setBundle basename="messages" var="local"/>
<fmt:message key="Hello" bundle="${local}"  var="hello_msg"/>
<h3>${hello_msg}</h3>
</body>
</html>
