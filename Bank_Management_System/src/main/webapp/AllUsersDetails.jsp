<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Users Details</title>
<style type="text/css">
#center{
margin:auto;
}
.info{
color:blue;
text-align: center;
}
#b1{
background-color: green;
color:white;
}
#b2{
background-color: red;
color:white;
}
</style>
</head>
<body>
<h1 class="info">Magadha Bank User Details</h1>
<% List<BankUserDetails> list=(List<BankUserDetails>)request.getAttribute("listOfUsers"); %>
<h2 class="info">Total Users Count:<%= list.size() %></h2>
<table border="1"id="center">
<tr>
<th>User Name</th>
<th>User EmaiId</th>
<th>User Mobile Number</th>
<th>User Aadhar Number</th>
<th>User Address</th>
<th>Gender</th>
<th colspan="2"></th>
</tr>
<% for(BankUserDetails bankUserDetails:list){%>
<tr>
<td><%= bankUserDetails.getUsername() %></td>
<td><%= bankUserDetails.getEmailid() %></td>
<td><%= bankUserDetails.getMobilenumber() %></td>
<td><%= bankUserDetails.getAadharnumber() %></td>
<td><%= bankUserDetails.getAddress() %></td>
<td><%= bankUserDetails.getGender() %></td>
<td>
<form action="updateUserDetails">
<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="id">
<button id="b1" type="submit">Update</button></form></td>
<td>
<form action="deleteUserDetails">
<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="userid">
<button id="b2" type="submit">Delete</button></form></td>
</tr>
<%} %>
</table>
</body>
</html>