<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management</title>
<style>
</style>
</head>
<body>

<%
session.removeAttribute("abean");
session.removeAttribute("alist");
session.invalidate();
String msg=(String)request.getAttribute("msg");

%>

<script type="text/javascript">
alert("<%= msg %>")
</script>



<%@include file="home.html" %>

</body>
</html>