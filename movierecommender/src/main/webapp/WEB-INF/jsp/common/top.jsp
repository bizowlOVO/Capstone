<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.id} 님 안녕하세요?
	<a href="/common/logout"><input type="button" value="로그아웃"></a>
	<a href="/member/domypage">마이페이지</a>
	<a href="/common/mainpage">홈</a>
	<br><br>
	<form action="/movie/searchMovie" method="GET">
		<input type="text" name="search"/>
		<input type="submit" value="검색" />
	</form>
</body>
</html>