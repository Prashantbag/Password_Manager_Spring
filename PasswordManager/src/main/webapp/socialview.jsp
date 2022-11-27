<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ty.password_mnger.dto.User" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Social View Page</title>
</head>
<body>
<% User loggeduser=(User)request.getAttribute("user1"); %>

	<table border="3px" cellpadding="12px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
		</tr>


		<tr>
			<td><%= loggeduser.getId() %></td>
			<td><%= loggeduser.getName() %></td>
			<td><%= loggeduser.getAddress() %></td>
			<td><%= loggeduser.getPhone() %></td>

		</tr>

		<tr>
			<th colspan="4">User Social Media Passwords</th>
		</tr>
		<tr>
			<td colspan="2"><%= loggeduser.getUsersocial().getFacebookPassword()%></td>
			<td><%= loggeduser.getUsersocial().getInstagramPassword()%></td>
			<td><%= loggeduser.getUsersocial().getGmailPassword()%></td>
		</tr>
		<tr></tr>
		<tr>
			<td colspan="2"><a href="edit?id=<%= loggeduser.getId() %>">edit</a></td>
			<td colspan="2"><a href="delete?id=<%= loggeduser.getId() %>">delete</a></td>
		</tr>

	</table>
</body>
</html>