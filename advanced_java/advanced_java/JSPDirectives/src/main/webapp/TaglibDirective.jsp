<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="myTag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<myTag:set var="a" value="100"></myTag:set>
	<myTag:out value="${a}"></myTag:out>
	<br>
	<myTag:choose>
		<myTag:when test="${a>100}">a is greater than 100</myTag:when>
		<myTag:when test="${a<100}">a is lesser than 100</myTag:when>
		<myTag:otherwise>a is greater than 100</myTag:otherwise>
	</myTag:choose>
</body>
</html>