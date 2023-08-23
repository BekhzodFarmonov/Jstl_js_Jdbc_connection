<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.08.2023
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Jstl simple example</title>
</head>
<body>
<ol>
<c:forTokens items="Java,Scala,C#,Phyton" delims="," var="lang">
    <li><c:out value="${lang}" />
    </li>
</c:forTokens>
</ol>
</body>
</html>
