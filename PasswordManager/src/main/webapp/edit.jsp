<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Edit view</title>
</head>
<body>

<form:form action ="updateuser" modelAttribute="user" >

<form:label path="id">ID</form:label>
<form:input path="id" readonly="true"/>

<form:label path="name">Name</form:label>
<form:input path="name"/>

<form:label path="address">Address</form:label>
<form:input path="address"/>

<form:label path="email">Email</form:label>
<form:input path="email"/>

<form:label path="password">Password</form:label>
<form:password path="password"/>

<form:label path="phone">Phone</form:label>
<form:input path="phone"/>

<%-- <form:label path="facebookPassword">FacebookPassword</form:label>
<form:input path="facebookPassword"/>

<form:label path="instagramPassword">InstagramPassword</form:label>
<form:input path="instagramPassword"/>

<form:label path="gmailPassword">GmailPassword</form:label>
<form:input path="gmailPassword"/>
 --%>
<input type="Submit" value ="submit">

</form:form>
</body>
</html>