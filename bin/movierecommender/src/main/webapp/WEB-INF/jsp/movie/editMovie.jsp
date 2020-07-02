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
	<h1>영화 수정</h1>
	<form action="/movie/${movie.movieSeq}" method="POST">
		영화명    <input type="text" name='title' value='${movie.title}'/><br>
		개봉날짜 <input type="text" name ='releaseDate' value='${movie.releaseDate}'/><br>
		줄거리 <input type="text" name ='synopsis' value='${movie.synopsis}'/><br>
		관람가    <input type="text" name='filmAge' value='${movie.filmAge}'/><br>
		제작국가 <input type="text" name ='directCountry' value='${movie.directCountry}'/><br>
		러닝타임    <input type="text" name='runningTime' value='${movie.runningTime}'/><br>
		다운로드링크 <input type="text" name ='downloadLink' value='${movie.downloadLink}'/><br>
		장르1    <select name='genreFirst'>
					<option value="${movie.genreFirst}">${movie.genreFirst}</option>
	    			<c:forEach items="${genre}" var="genre">
	    			<option value="${genre.genre}">${genre.genre}</option>
	    		</c:forEach>
	    		</select><br>
		장르2 <select name='genreSecond'>
					<option value="${movie.genreSecond}">${movie.genreSecond}</option>
	    			<c:forEach items="${genre}" var="genre">
	    			<option value="${genre.genre}">${genre.genre}</option>
	    		</c:forEach>
	    		</select><br>
		감독 <input type="text" name='director' value='${movie.director}'/><br>
		배우 <input type="text" name='actor' value='${movie.actor}' /><br>
		<input type="submit" value="수정"/>
	</form>
</body>
	<script>
	</script>
</html>