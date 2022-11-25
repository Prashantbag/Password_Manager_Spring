<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Management</title>
</head>
<body>
<div>
		<h2>Password Management</h2>
		
		<form:form action="verifyuser">
			<form:radiobutton path="user" value="user"/>
			<form:radiobutton path="admin" value="admin"/>
			
			<form:label path="email"></form:label>
			<form:input path="email"/>
			
			<form:label path="password"></form:label>
			<form:password path="password"/>
		</form:form>
		
</div>

</body>
</html>