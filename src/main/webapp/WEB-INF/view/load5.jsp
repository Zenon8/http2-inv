<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--css: 10, js: 20, images: 300--%>
<link rel="stylesheet" href="res/css/style.css">
<link rel="stylesheet" href="res/css/switchery.css">
<link rel="stylesheet" href="res/css/owl.carousel.css">
<link rel="stylesheet" href="res/css/old.css">
<link rel="stylesheet" href="res/css/uniform.default.css">

<link rel="stylesheet" href="res/css/owl.theme.css">
<link rel="stylesheet" href="res/css/owl.transitions.css">
<link rel="stylesheet" href="res/css/owl.carousel.css">
<link rel="stylesheet" href="res/css/magnific-popup.css">
<link rel="stylesheet" href="res/css/font-awesome.css">



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

<script src="res/js/bootstrap-datetimepicker.min.js"></script>
<script src="res/js/cart.js"></script>
<script src="res/js/common.js"></script>
<script src="res/js/confirm.js"></script>
<script src="res/js/d_quickcheckout.min.js"></script>

<script src="res/js/field.js"></script>
<script src="res/js/floating-1.12.js"></script>
<script src="res/js/jquery.magnific-popup.min.js"></script>
<script src="res/js/jquery.maskedinput.min.js"></script>
<script src="res/js/jquery.sharrre.min.js"></script>


<c:forEach var="i" begin="1" end="300">
    <img id="test-image" src="res/images/space/space_${i}.jpg">
</c:forEach>
</body>
</html>
