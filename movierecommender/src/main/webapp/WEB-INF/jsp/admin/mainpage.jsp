<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인페이지</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<h1>관리자 메인페이지</h1>
	
	<a href="/review/list"><input type="button" value="리뷰 관리"/></a>
	<a href="/movie/list"><input type="button" value="영화 목록"/></a>
</body>
</html>