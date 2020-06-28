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
		<h1>영화 상세 조회</h1>
		<form action="/review/addform/${movie.movieSeq}" method="GET">
			<input type="submit" value="리뷰작성" />
		</form>
		<form action="/review/list/${movie.movieSeq}" method="GET">
			<input type="submit" value="리뷰보기" />
		</form>
		 
		<a href="/bookmark/${movie.movieSeq}"><input type="button" value="관심없음"></a>
		
		<form action="/movie/${movie.movieSeq}/editform" method="GET" id="inquiryMovie">
			<table>
				<tr>
					<td><img src="/img/${movie.poster}" style="width:200px; height:auto;"/></td>
					<td><h1>${movie.title}</h1>
					줄거리 : ${movie.synopsis}<br>
					관람가 : ${movie.filmAge}<br>
					제작 국가 : ${movie.directCountry}<br>
					재생 시간 : ${movie.runningTime}<br>
					${movie.downloadLink}<br>
					장르 : ${movie.genreFirst}, ${movie.genreSecond}<br>
					감독 : ${movie.director}<br>
					배우 : ${movie.actor}</td>
				</tr>
			</table>
			<input type="submit" value="수정" />
		</form>
		<a href="/movie/list"><input type="button" value="전체 영화 목록 보기"></a>
	</body>
</html>