<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
<img src="res/images/logo.png">
<img src="res/images/background.jpg">
--%>
<link rel="stylesheet" href="res/css/style.css">

<c:forEach var="i" begin="1" end="400">
    <img src="res/images/space/space_${i}.jpg" width="4.8%">
</c:forEach>
</body>
</html>
