<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> fn jsp page</title>
</head>
<body>
<c:set var="name" value="Behzod Farmonov"/>
<c:if test="${fn:contains(name,'Be' )}"/>
<h3>${name} contains Be</h3>
</body>
</html>
