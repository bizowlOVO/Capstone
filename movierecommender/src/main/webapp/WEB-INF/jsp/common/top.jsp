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
	${sessionScope.id} 님 안녕하세요?
	<a href="/common/logout"><input type="button" value="로그아웃"></a>
	<a href="/member/${sessionScope.id}">마이페이지</a>
	<c:if test="${sessionScope.id eq 'admin001'}">
		<a href="/admin/mainpage">홈</a>
	</c:if>
	<c:if test="${sessionScope.id ne 'admin001'}">
		<a href="/member/mainpage">홈</a>
	</c:if>
	<br><br>
	<form action="/movie/searchMovie" method="GET">
		<input type="text" name="search"/>
		<input type="submit" value="검색" />
	</form>
</body>
</html>