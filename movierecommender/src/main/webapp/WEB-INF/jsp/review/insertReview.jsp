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
		</table>
		<input type ="submit" value="등록">
	</form>
</body>
</html>