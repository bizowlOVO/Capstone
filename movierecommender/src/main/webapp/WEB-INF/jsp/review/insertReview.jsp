<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
<body>
	<h1>리뷰 등록</h1>
	<form action="/review" method="POST">
		<table border="1">
			<tr>
				<td>ID</td>
				<td>${sessionScope.id}</td>
			</tr>
			<tr>
				<td>Movie</td>
				<td>${movieInfo.title}</td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><input type="text" id="comment" name="comment"></td>
			</tr>
		</table>
		<input type ="submit" value="등록">
	</form>
</body>
</html>