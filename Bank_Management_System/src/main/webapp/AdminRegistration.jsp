<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration</title>
</head>
<body>
<%String msg= (String)request.getAttribute("adminexception");%>
<%  if(msg!=null){%>
	<%= msg %>
<%} %>
<h1>Admin Page</h1>
<form action="adminreq">
<input type="email" placeholder="Enter Your Email" name="emailid"><br>
<input type="password" placeholder="Enter Your Password" name="password"><br>
<input type="text" placeholder="Enter Your Role" name="role"><br>
<button type="submit">Register</button>
</form>
</body>
</html>