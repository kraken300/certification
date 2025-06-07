<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<form action="register" method="post">
			
		<h1>Register Page</h1>
		<h4>${message}</h4>
		<label for="name">Enter Name: </label>
		<input type="text" name="name" id="name"> <br>
		
		<label for="email">Enter Email: </label>
		<input type="email" name="email" id="email"> <br>
		
		<label for="password">Enter Password: </label>
		<input type="password" name="password" id="password"> <br>
				
		<input type="submit" value="submit"> <br>
		
		<a href="login.jsp">Login Page</a>
	</form>
</body>
</html>