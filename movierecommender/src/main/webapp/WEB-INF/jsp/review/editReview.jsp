<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
<body>
<h1>리뷰수정</h1>
	<form action="/review/${reviewSeq}" method="POST">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="hidden"value="${result.memberId}"name="memberId">
					<input type="text"value="${result.memberId}"name="memberIdShow" disabled>
				</td>
			</tr>
			<tr>
				<td>Movie</td>
				<td><input type="hidden"value="${movieInfo.movieSeq}"name="movieSeq" >
					<input type ="hidden" value="${result.reviewSeq}" name="reviewSeq">
					<input type="hidden"value ="${movieInfo.title}"name="title">
					<input type="text"value ="${movieInfo.title}"name="titleShow"disabled>
				</td>
			</tr>
			<tr>
				<td>Comment</td>
				<td><input type="text"name="reviewComment" value="${result.reviewComment}"></td>
			</tr>
		</table>
	<c:if test="${sessionScope.id eq result.memberId}">
	<input type="submit" value="수정하기"/>
	</c:if>
	</form>
	<form action="/review/delete/${result.reviewSeq}" method="GET">
		<input type="hidden"value="${movieInfo.movieSeq}"name="movieSeq" >
		<c:if test="${sessionScope.id eq result.memberId}">
		<input type="submit" value="삭제" />
		</c:if>
	</form>
</body>
</html>