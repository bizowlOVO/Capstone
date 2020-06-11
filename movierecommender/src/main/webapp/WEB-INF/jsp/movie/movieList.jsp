<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>영화 등록</h1>
		<c:forEach items="${movie}" var="movie">
		<td>${movie.title}</td>
		<input type="submit" value="등록"/>
		</c:forEach>
</body>
	<script>
	</script>
</html>