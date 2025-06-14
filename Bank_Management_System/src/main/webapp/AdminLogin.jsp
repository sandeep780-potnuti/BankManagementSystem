<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
<% String msg=(String)request.getAttribute("loginexception");%>
<% if(msg!=null){%>
	<%= msg %>
<% } %>

<h1>Admin Login</h1>
<form action="adminLogin">
<input type="number" placeholder="Enter Your Admin Id" name="Aid"><br>
<button type="submit">Login</button>
</form>
</body>
</html>