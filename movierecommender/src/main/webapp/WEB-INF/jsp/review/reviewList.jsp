<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>reivew List</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<table border="1">
		<tr>
			<td>글쓴이</td>
			<td>리뷰</td>
			<td>게시일</td>
		</tr>
		<c:if test="${not empty reviews}">
			<c:forEach items="${reviews}" var="review">
				<tr>
					<td>${review.memberId}</td>
					<td>${review.reviewComment}</td>
					<td>${review.reviewPostDate}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>