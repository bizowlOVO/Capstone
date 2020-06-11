<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.id} 님 안녕하세요?
	<a href="/common/logout"><input type="button" value="로그아웃"></a>
	<a href="/common/mainpage">마이페이지</a>
	<a href="/common/mainpage">홈</a>
</body>
</html>