<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
</head>
<body>
<form:form action="saveuser" modelAttribute="user">
	<form:label path="name">Enter the Name</form:label>
	<form:input path="name"/>
	<br>
	<form:label path="phone">Enter the Contact Number</form:label>
	<form:input path="phone"/>
	<br>
	<form:label path="address">Enter the Address</form:label>
	<form:input path="address"/>
	<br>
	<form:label path="email">Enter the email</form:label>
	<form:input path="email"/>
	<br>
	<form:label path="password">Enter the password</form:label>
	<form:input path="password"/>
	<br>
	<input type="submit" value="submit">
</form:form>
</body>
</html>