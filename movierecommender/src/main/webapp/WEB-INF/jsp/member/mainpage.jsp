<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<c:if test="${not empty recentlyMovie}">
		<h1>최근 개봉 영화</h1><br>
		<table border="1">
			<th></th>
			<th>영화명</th>
			<th>개봉날짜</th>
		
			<c:forEach items="${recentlyMovie}" var="recently">
				<tr>
					<td>${recently.poster}</td>
					<td><a href = "/movie/${recently.movieSeq}">${recently.title}</a></td>
					<td>${recently.releaseDate}</td>
				</tr>
			</c:forEach>
		
		</table>
	</c:if>
	<br><br>
	<c:if test="${not empty viewMovie}">
		<h1>최근 개봉 영화</h1>
		<table border="1">
			<th></th>
			<th>영화명</th>
			<th>개봉날짜</th>
			<c:forEach items="${viewMovie}" var="view">
				<tr>
					<td>${view.poster}</td>
					<td><a href = "/movie/${view.movieSeq}">${view.title}</a></td>
					<td>${view.releaseDate}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<a href="/movie/addform">영화등록</a>
</body>
</html>