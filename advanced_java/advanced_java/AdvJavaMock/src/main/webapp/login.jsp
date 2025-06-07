<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="login" method="post">

		<h1>Login Page</h1>
		<h4>${message}</h4>
		<label for="email">Enter Email: </label> 
		<input type="email" name="email" id="email"> <br> 
		
		<label for="password">Enter Password: </label> 
		<input type="password" name="password" id="password"> <br>
		 
		<input type="submit" value="submit"><br>
		
		<a href="register.jsp">Register Page</a>
	</form>
</body>
</html>