<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Credentials</title>
</head>
<body>

	<h3>Add Your Credentials</h3>
	
	<form:form action="saveusersocial" modelAttribute="usersocial">
			<h4>Facebook</h4>
		
	
			<form:label path="facebookPassword">Facebook Password</form:label>
			<form:input path="facebookPassword"/>
			
			
			<h4>Instagram</h4>
	
			<form:label path="instagramPassword">Instagram Password</form:label>
			<form:input path="instagramPassword"/>
			
		
			<h4>Gmail</h4>	
	
			<form:label path="gmailPassword">Gmail Password</form:label>
			<form:input path="gmailPassword"/>	
			
			
		<form:button value="submit">Submit</form:button>	
					
		
	</form:form>

</body>
</html>