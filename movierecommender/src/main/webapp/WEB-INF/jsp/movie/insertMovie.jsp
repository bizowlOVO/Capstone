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
	<h1>영화 등록</h1>
	<form action="/movie" method="POST">
		영화명    <input type="text" name='title'/><br>
		개봉날짜 <input type="text" name ='releaseDate'/><br>
		줄거리 <input type="text" name ='synopsis'/><br>
		관람가    <input type="text" name='filmAge'/><br>
		제작국가 <input type="text" name ='directCountry'/><br>
		러닝타임    <input type="text" name='runningTime'/><br>
		다운로드링크 <input type="text" name ='downloadLink'/><br>
		장르1 <select name='genreFirst'>
				<option value="">장르 선택(필수)</option>
				<c:forEach items="${genre}" var="genre">
	    			<option value="${genre.genre}">${genre.genre}</option>
	    		</c:forEach>
	    	 </select><br>
		장르2 <select name='genreSecond'>
				<c:forEach items="${genre}" var="genre">
	    			<option value="${genre.genre}">${genre.genre}</option>
	    		</c:forEach>
	    	</select><br>
		감독 <input type="text" name ='directorSeq'/><br>
		<input type="submit" value="등록"/>
	</form>
</body>
	<script>
	</script>
</html>