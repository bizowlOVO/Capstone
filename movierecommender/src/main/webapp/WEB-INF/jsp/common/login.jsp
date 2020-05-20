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
	아이디    <input type="text" name='id'/><br>
	비밀번호 <input type="password" name ='password'/><br>
	<input type="submit" value="로그인"/>
	</form>
</body>
	<script>
	</script>
</html>