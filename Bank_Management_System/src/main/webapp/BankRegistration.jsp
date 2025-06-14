<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<style type="text/css">
h1{
color:red;
text-align:center;
font-family: cursive;
}
.center{
margin:auto;
}
</style>
</head>
<body>
<% String msg=(String)request.getAttribute("exceptionmsg");%>
<% if(msg!=null){%>
	<%= msg %>
<%} %>

<h1 >Registration Page</h1>
<div class="center">
<form action="registrationrequest">
<input type="text" placeholder="Enter Your Name" name="name"><br>
<input type="email" placeholder="Enter Your Email" name="email"><br>
<input type="tel" placeholder="Enter Your Aadhar Number" name="aadharnumber"><br>
<input type="tel" placeholder="Enter Your Mobile Number" name="mobilenumber"><br>
<input type="text" placeholder="Enter Your Gender" name="gender"><br>
<input type="text" placeholder="Enter Your Address" name="address"><br>
<input type="number" placeholder="Enter Your Amount" name="amount"><br>
<button type="submit">Register</button>
</form>
</div>


</body>
</html>