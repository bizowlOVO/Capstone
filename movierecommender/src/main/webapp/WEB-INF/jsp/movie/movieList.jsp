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
		<c:forEach items="${movie}" var="movie">
			<tr>
				<td><img src="/img/${movie.poster}" style="width:200px; height:auto;"/></td>
				<td>
					<h1><a href = "/movie/${movie.movieSeq}">${movie.title}</a></h1>
					개봉 날짜 : ${movie.releaseDate}<br>
					재생 시간 : ${movie.runningTime}<br>
					장르 : ${movie.genreFirst}, ${movie.genreSecond}<br>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
	<script>
	</script>
</html>