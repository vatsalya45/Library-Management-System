<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>

</head>
<body>

<%
	String msg=(String)request.getAttribute("msg");
	

%> 
<script type="text/javascript">
alert("<%= msg %>")
</script>
	
	
	<%@include file="home.html" %>


	
</body>
</html>