<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test JSP</title>
</head>
<body>

	<!-- Declaration Tag -->
	
	<%! 
		static int a = 10;
	
		public String getMsg(){
			return "Hello World";
		}
	%>
	
	<!-- Scriptlet Tag -->
	
	<%
		int b = 20;
		out.println(b);
		out.print("Hi this is from JSP Page");
	%>
	
	<!-- Expression Tag -->
	
	<h1><%= b %></h1>
	<h1><%= getMsg() %></h1>

</body>
</html>