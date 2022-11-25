<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Social View Page</title>
</head>
<body>
	<form:form modelAttribute="user">

		<form:label path="id">User ID</form:label>
		<form:input path="id" readonly="true" />

		<form:label path="name">User Name</form:label>
		<form:input path="name" readonly="true" />
		<br>
		<form:label path="phone">User Number</form:label>
		<form:input path="phone" readonly="true" />
		<br>
		<form:label path="address">User Address</form:label>
		<form:input path="address" readonly="true" />
		<br>
		<form:label path="email">User Email</form:label>
		<form:input path="email" readonly="true" />
		<br>
		<form:label path="password">User Password</form:label>
		<form:input path="password" readonly="true" />
		<br>

		<form:label path="facebookPassword">User Facebook Password</form:label>
		<form:input path="facebookPassword" readonly="true" />
		<br>

		<form:label path="instagramPassword">User Instagram Password</form:label>
		<form:input path="instagramPassword" readonly="true" />
		<br>

		<form:label path="gmailPassword">User Gmail Password</form:label>
		<form:input path="gmailPassword" readonly="true" />
		<br>

		<td><a href="delete"path="id">Delete</a>
		<td><a href="edit">Edit</a>
	</form:form>
</body>
</html>