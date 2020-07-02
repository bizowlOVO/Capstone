<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.0.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
</head>
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
<body>
	<h1>리뷰 등록</h1>
	<form action="/review" method="POST">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="hidden"value="${sessionScope.id}"name="memberId">
					<input type="text"value="${sessionScope.id}"name="memberIdShow" disabled>
				</td>
			</tr>
			<tr>
				<td>Movie</td>
				<td><input type="hidden"value="${movieInfo.movieSeq}"name="movieSeq" >
					<input type="hidden"value ="${movieInfo.title}"name="title">
					<input type="text"value ="${movieInfo.title}"name="titleShow"disabled>
				</td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><input type="text"name="reviewComment"></td>
			</tr>
			<tr>
				<td>Grade</td>
				<td><input type="radio" name="grade" value="1">1
					<input type="radio" name="grade" value="2">2
					<input type="radio" name="grade" value="3">3
					<input type="radio" name="grade" value="4">4
					<input type="radio" name="grade" value="5">5
				</td>
			</tr>
		</table>
		<input type="submit" value="등록하기"/>
	</form>
</body>
</html>