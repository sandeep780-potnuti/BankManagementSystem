<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.Optional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
<style type="text/css">
#center{
margin:auto;
}
</style>
</head>
<body>
<%Optional<BankUserDetails>optional=(Optional<BankUserDetails>) request.getAttribute("UserDetails");%>
<div id="center">
<h1>Update User Details</h1>
<form action="">
<label>User Id:</label>
<input value=<%=optional.get().getUserid() %> ><br>
<label>User Name:</label>
<input value=<%=optional.get().getUsername() %> ><br>
<label>User EmailId:</label>
<input value=<%=optional.get().getEmailid() %>><br>
<label>User AadharNumber:</label>
<input value=<%=optional.get().getAadharnumber() %>><br>
<label>User MobileNumber:</label>
<input value=<%=optional.get().getMobilenumber() %>><br>
<label>User Gender:</label>
<input value=<%=optional.get().getGender() %>><br>
<label>Account Number:</label>
<input value=<%=optional.get().getAccountnumber() %> ><br>
<label>User Address:</label>
<input value=<%=optional.get().getAddress() %>><br>
<button type="submit">Update</button>
</form>
</div>
</body>
</html>