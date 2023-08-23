<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Download File</title>
    <jsp:include page="/fragments/css.jsp"/>
</head>
<body>
<form method="get">
    <div class="mb-3">
        <label for="text" class="form-label">Enter File Name </label>
        <input type="text" name="text" id="text" class="form-control"/>
    </div>
    <button type="submit" class="btn btn-success">Download</button>
</form>
<jsp:include page="/fragments/js.jsp"/>
</body>
</html>
