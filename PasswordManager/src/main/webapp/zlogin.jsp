<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div>
		<h2>Password Management System</h2>

		<form:form action="verifyuser">

			<form:radiobutton path="user" value="user" />
			<form:radiobutton path="admin" value="admin" />

			<form:label path="email">Email</form:label>
			<form:input path="email" />

			<form:label path="password">Password</form:label>
			<form:password path="password" />

			<label>Not a User ?<a href=signup>Signup</a></label>
			
			<input type="Submit" value="Submit">
		</form:form>

	</div>

</body>
</html>