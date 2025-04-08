<%@page import="com.vatsalya.library_management.*"%>

<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Students</title>
<style >
body {
    font-family: Arial, sans-serif;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
    background-color: #f0f8ff; 
}
img{
width:100%;
height:100%;
}
.container {
	position:absolute;
    text-align: center;
    background-color: #ffffff;
    padding: 40px 60px;
    border-radius: 12px;
    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
}
</style>

</head>
<body>
<img src="https://img.freepik.com/free-photo/library-with-books_1063-98.jpg?t=st=1742911317~exp=1742914917~hmac=0f217b15d54bbccdd16b88eb9d8cc91007d292a3a18717d36d0d62a1c81cf68e&w=1380">
<div class="container">
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<BookBean> al=(ArrayList<BookBean>) session.getAttribute("alist");

out.println("<h2>Page belongs to admin "+ab.getuName().toUpperCase()+"</h2>");
out.println("<h2>All Book Details</h2>");
if(al.size()==0){
	out.println("No Book Available...<br>");
	
}else{
	
	%>
	<table align="center" border="1" cellpadding="10" cellspacing="0" >
	<tr>
	<th>Sr.No.</th>
	<th>Book Id</th>
	<th>Book Name</th>
	<th>Book Author</th>
	<th>Book Price</th>
	<th>Book Qty</th>
	</tr>
	<% 
	Iterator<BookBean> it= al.iterator();
	int count=1;
	while(it.hasNext()){
		BookBean bb=(BookBean)it.next();
		%>
		
		<tr>
		<td><%=count++ %></td>
		<td><%=bb.getbId() %></td>
		<td><%=bb.getbName() %></td>
		<td><%=bb.getbAuthor() %></td>
		<td><%=bb.getbPrice() %></td>
		<td><%=bb.getbQty() %></td>
		</tr>
		
		<%
		
	}%></table> <%
}

%>
</div>
</body>
</html>