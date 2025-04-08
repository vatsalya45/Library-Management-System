<%@page import="com.vatsalya.library_management.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
    background-color: #f0f8ff; 
}
.container {
	position:absolute;
    text-align: center;
    background-color: #ffffff;
    padding: 40px 60px;
    border-radius: 12px;
    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
}
h1 {
    color: #333;
    margin-bottom: 20px;
}

.links a {
    display: inline-block;
    margin: 10px 15px;
    padding: 10px 20px;
    background-color: #4CAF50; 
    color: #ffffff;
    text-decoration: none;
    border-radius: 5px;
    transition: background 0.3s ease;
}

.links a:hover {
    background-color: #45a049; 
}
img{width:100%;
}

</style>
<body>

<img src="https://img.freepik.com/free-photo/ancient-books-adorn-library-carefully-arranged-with-classics-rare-gems_157027-2575.jpg?t=st=1742449232~exp=1742452832~hmac=d3629d73e7b763294fe07ecc9cffd821aa47ab82e838c99ffb353c2dc7dae046&w=1380">
	<div class="container">
	<% 
	AdminBean ab=(AdminBean)session.getAttribute("abean");
	out.println("<h1>Page belongs to admin "+ab.getuName()+"</h1><br>");
	String msg=(String)request.getAttribute("msg");
	%>
	
	<script type="text/javascript">
	alert("<%= msg %>")
	</script>
	
		<div class="links"> 
		
		<a href="AddBook.html">Add Book</a>
		<a href="UpdateBook.html">Update Book</a>
		<a href="DeleteBook.html">Delete Book</a>
		<a href="view">ViewAll Book</a>
		<a href="logout">Logout</a>
		
		</div>
	</div>
	
</body>
</html>