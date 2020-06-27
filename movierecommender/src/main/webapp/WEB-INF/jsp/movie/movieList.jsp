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
	<h1>영화 목록</h1>
	<a href="/movie/addform"><input type="button" value="영화 등록"></a>
	<table border="1">
		<th></th>
		<th>영화명</th>
		<th>개봉날짜</th>
		<th>줄거리</th>
		<th>연령가</th>
		<th>제작국가</th>
		<th>러닝타임</th>
		<th>다운로드링크</th>
		<th>장르1</th>
		<th>장르2</th>
		<th>감독</th>
		<th>배우</th>
		<c:forEach items="${movie}" var="movie">
			<tr>
				<td>${movie.poster}</td>
				<td><a href = "/movie/${movie.movieSeq}">${movie.title}</a></td>
				<td>${movie.releaseDate}</td>
				<td>${movie.synopsis}</td>
				<td>${movie.filmAge}</td>
				<td>${movie.directCountry}</td>
				<td>${movie.runningTime}</td>
				<td>${movie.downloadLink}</td>
				<td>${movie.genreFirst}</td>
				<td>${movie.genreSecond}</td>
				<td>${movie.director}</td>
				<td>${movie.actor}</td>
			</tr>
		</c:forEach>
	</table>
</body>
	<script>
	</script>
</html>