<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = request.getParameter("userName");
		String email = request.getParameter("userEmail");
	%>
	
	<h1>Name : <%= name %></h1>
	<h1>Name : <%= email %></h1>

</body>
</html>