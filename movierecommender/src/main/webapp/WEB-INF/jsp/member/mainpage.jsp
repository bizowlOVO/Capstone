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
	<h1>최근 개봉 영화</h1><br>
	<table border="1">
		<th></th>
		<th>영화명</th>
		<th>개봉날짜</th>
		<c:forEach items="${recentlyMovie}" var="recentlyMovie">
			<tr>
				<td>${recentlyMovie.poster}</td>
				<td><a href = "/movie/${recentlyMovie.movieSeq}">${recentlyMovie.title}</a></td>
				<td>${recentlyMovie.releaseDate}</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<h1>최근 개봉 영화</h1>
	<table border="1">
		<th></th>
		<th>영화명</th>
		<th>개봉날짜</th>
		<th>ㅇㅇ</th>
		<c:forEach items="${viewMovie}" var="viewMovie">
			<tr>
				<td>${viewMovie.poster}</td>
				<td><a href = "/movie/${viewMovie.movieSeq}">${viewMovie.title}</a></td>
				<td>${viewMovie.releaseDate}</td>
				<td>dd</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/movie/addform">영화등록</a>
</body>
</html>