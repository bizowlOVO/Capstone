<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reivew List</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<h1>해당 영화에 대한 리뷰입니다</h1>
	<table border="1">
		<tr>
			<td>글쓴이</td>
			<td>리뷰</td>
			<td>게시일</td>
			<td>평점</td>
		</tr>
		<c:if test="${not empty reviews}">
			<c:forEach items="${reviews}" var="review">
				<tr>
					<td>${review.memberId}</td>
					<td><a href="/review/editform/${review.reviewSeq}">${review.reviewComment}</a></td>
					<td>${review.reviewPostDate}</td>
					<td>${review.grade}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>