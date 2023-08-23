
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload file</title>
<jsp:include page="/fragments/css.jsp"/>
</head>
<body>
<form enctype="multipart/form-data" method="post">
    <div class="mb-3">
        <label for="file" class="form-label">Upload file </label>
        <input type="file" name="file" id="file" class="form-control"/>
    </div>
    <button type="submit" class="btn btn-success">upload</button>
</form>
<jsp:include page="/fragments/js.jsp"/>
</body>
</html>