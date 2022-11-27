<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
</head>
<style>
	.label{
	
		font-size: 19px;
		font-weight: 600px;
		font-style: normal;
		color:purple;
		text-align: left !important;
		
	}
	.container{
		text-align: center;
	}
	.inputheight{
		height: 24px !important;
		border: 1px solid purple;
		border-radius: 4px;
	}
	.table{
		margin: 0px 470px;
		border: 2px solid black;
		padding: 16px;
		border-radius: 8px;
		width: 500px;
		
	}
	.table .tr .labeltr{
		width: 490px !important;
	}
	.btn{
		border: 2px solid black;
		border-radius: 6px;
		color:white;
		background-color:purple;
		font-style:normal;
		font-size: 22px;
		font-weight: 700px;
		font-family: monospace;
		padding:9px;
		cursor: pointer;
	}

</style>
<body>
<div class="container">
	<h2> User Signup </h2>
			<table class="table">
			<form:form action="userlogin" modelAttribute="user" >
				
					<tr class="tr">
						<td class="labeltr">
							<form:label path="name" class="label">Enter the Name</form:label>
						</td>
						<td>	
							<form:input path="name" class="inputheight"/>
						</td>	
					</tr>
					<br>
					<tr class="tr">
						<td class="labeltr">
							<form:label path="phone" class="label">Enter the Contact Number</form:label>
						</td>
						<td>	
							<form:input path="phone" class="inputheight"/>
						</td>
					</tr>		
					<br>
					<tr class="tr">
						<td class="labeltr">
							<form:label path="address" class="label">Enter the Address</form:label>
						</td>
						<td>	
							<form:input path="address" class="inputheight"/>
						</td>
					</tr>		
					<br>
					<tr class="tr">
						<td class="labeltr">
							<form:label path="email" class="label">Enter the email</form:label>
						</td>
						<td>	
							<form:input path="email" class="inputheight"/>
						</td>	
					</tr>	
					<br>
					<tr class="tr">
						<td class="labeltr">
							<form:label path="password" class="label">Enter the password</form:label>
						</td>
						<td>	
							<form:input path="password" class="inputheight"/>
						</td>
					</tr>		
					<br>
					<tr>
						<td>
							<input type="submit" value="Signup" class="btn">
						</td>	
					</tr>	
				
			</form:form>
	</table>
</div>
</body>
</html>