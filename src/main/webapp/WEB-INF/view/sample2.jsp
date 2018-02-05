<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h4>Push 400 images</h4>

<c:forEach var="i" begin="1" end="400">
    <img id="test-image" src="res/images/space/space_${i}.jpg">
</c:forEach>
</body>
</html>
