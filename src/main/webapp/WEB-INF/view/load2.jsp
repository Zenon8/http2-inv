<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--css: 5, js: 10, images: 50--%>
<link rel="stylesheet" href="res/css/style.css">
<link rel="stylesheet" href="res/css/switchery.css">
<link rel="stylesheet" href="res/css/owl.carousel.css">
<link rel="stylesheet" href="res/css/old.css">
<link rel="stylesheet" href="res/css/uniform.default.css">
<script src="res/js/_field.js"></script>
<script src="res/js/additional-methods.js"></script>
<script src="res/js/backbone.bootstrap-modal.js"></script>
<script src="res/js/backbone.epoxy.min.js"></script>
<script src="res/js/backbone.validation.min.js"></script>

<script src="res/js/backbone-forms.js"></script>
<script src="res/js/backbone-min.js"></script>
<script src="res/js/backbone-nested.js"></script>
<script src="res/js/bootstrap.js"></script>
<script src="res/js/bootstrap3.js"></script>


<c:forEach var="i" begin="1" end="50">
    <img id="test-image" src="res/images/space/space_${i}.jpg">
</c:forEach>
</body>
</html>
