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
	<h1>영화 추천 웹 서비스 로그인</h1>
	<form action="/common/login" method="POST">
	아이디    <input type="text" name='memberId'/><br>
	비밀번호 <input type="password" name ='memberPassword'/><br>
	<input type="submit" value="로그인"/><br><br>
	</form>
	
	<a href="/member/addform"><input type="button" value="회원가입" /></a>
</body>
	<script>
	</script>
</html>