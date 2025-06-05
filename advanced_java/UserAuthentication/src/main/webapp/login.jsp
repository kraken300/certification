<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #121212;
	color: #ffffff;
	font-family: Arial, sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.login-container {
	background-color: #1e1e1e;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
	width: 300px;
}

.login-container h2 {
	text-align: center;
	margin-bottom: 20px;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
	font-size: 14px;
}

.form-group input {
	width: 100%;
	padding: 10px;
	background-color: #2a2a2a;
	border: none;
	border-radius: 5px;
	color: white;
	font-size: 14px;
}

.form-group input:focus {
	outline: none;
	background-color: #333333;
}

.login-btn {
	width: 100%;
	padding: 10px;
	background-color: #28a745;
	border: none;
	border-radius: 5px;
	color: white;
	font-size: 16px;
	cursor: pointer;
}

.login-btn:hover {
	background-color: #1e7e34;
}

.register-link {
	text-align: center;
	margin-top: 15px;
	font-size: 14px;
}

.register-link a {
	color: #1e90ff;
	text-decoration: none;
}

.register-link a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="login-container">
		<h2>Login</h2>
		<h4 style="color: lightgreen;">${msg}</h4>
		<form action="login" method="post">
			<div class="form-group">
				<label for="email">Email</label> <input type="email" id="email"
					name="email" required />
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" required />
			</div>
			<button type="submit" class="login-btn">Login</button>
		</form>
		<div class="register-link">
			Don't have an account? <a href="register.jsp">Register</a>
		</div>
	</div>
</body>
</html>
