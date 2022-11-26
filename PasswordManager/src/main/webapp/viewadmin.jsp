<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
</head>
<body>
<table border="2px">
<tr>
<td>Id</td>
<td>Name</td>
<td>Address</td>
<td>Contact Number</td>
<td>Email</td>
<td>Password</td>
<td>Facebook Password</td>
<td>Gmail Password</td>
<td>Instagram Password</td>
</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.address}</td>
<td>${user.phone}</td>
<td>${user.email}</td>
<td>${user.password}</td>
<td>${user.usersocial.facebookPassword}</td>
<td>${user.usersocial.gmailPassword}</td>
<td>${user.usersocial.instagramPassword}</td>
</tr>
</c:forEach>
</table>
<br>
<br>

<h2>to go back click here<a href="index.jsp">Exit</a></h2>
</body>
</html>