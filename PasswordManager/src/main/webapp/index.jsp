<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Management</title>
</head>
<style>
.container{
	text-align: center;
	
}

.container table{
		border: 2px solid black;
		border-radius: 6px;
		text-align: center !important;
		margin: 16px 570px;
		padding: 16px;
}


a{
	text-decoration: none;
	border: 2px solid black;
	border-radius: 6px;
	color:white;
	background-color:purple;
	font-style:normal;
	font-size: 26px;
	font-weight: 700px;
	font-family: monospace;
	padding:9px;
	
	
}
td{
	font-size: 24px;
	font-weight: 600px;
}
p{
	font-size: 18px;
}
</style>
<body>
<div class="container">
		<h2>Password Management</h2>
		<div>
		
			<table cellpadding="12px">
				<tr>
					<td>
						<a href="login">Login</a>
						<br>
						<br>
						<br>
						<br>
						
						<a href="adminlogin">Admin</a>
					</td>
					
					<td>
						<p>Don't have and account?</p>
						<a href="signup">SignUp</a>
					</td>
					<td></td>
				</tr>
				
			</table>
		</div>
</div>
</body>
</html>