<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Register</title>
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

.register-container {
	background-color: #1e1e1e;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
	width: 300px;
}

.register-container h2 {
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

.register-btn {
	width: 100%;
	padding: 10px;
	background-color: #007BFF;
	border: none;
	border-radius: 5px;
	color: white;
	font-size: 16px;
	cursor: pointer;
}

.register-btn:hover {
	background-color: #0056b3;
}

.login-link {
	text-align: center;
	margin-top: 15px;
	font-size: 14px;
}

.login-link a {
	color: #1e90ff;
	text-decoration: none;
}

.login-link a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="register-container">
		<h2>Register</h2>
		<h4 style="color: lightgreen;">${msg}</h4>
		<form action="register" method="post">
			<div class="form-group">
				<label for="name">Name</label> <input type="text" id="name"
					name="name" required />
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email" id="email"
					name="email" required />
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" required />
			</div>
			<button type="submit" class="register-btn">Register</button>
		</form>
		<div class="login-link">
			Already registered? <a href="login.jsp">Login</a>
		</div>
	</div>
</body>
</html>
