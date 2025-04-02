<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="com.vatsalya.library_management.AdminBean" 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	out.println("Welcome admin "+ab.getfName()+"<br>");
%>
<a href = "AddBook.html">Add Book</a>
<a href = "DeleteBook.html">Delete Book</a>
<a href = "UpdateBook.html">Update Book</a>
<a href = "ViewAllBooks.html">View All Book</a>
<a href = "Logout">Logout</a>

</body>
</html>