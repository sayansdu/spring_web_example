<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <h1>${title}</h1>
        <h1><c:out value="${title}"/></h1>
        <p>${msg}</p>
        <p><c:out value="${msg}"/></p>
    </div>
</body>
</html>
