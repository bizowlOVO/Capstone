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
		 
		<a href="/bookmark/${movie.movieSeq}"><input type="button" value="관심"></a>
		
		<form action="/movie/${movie.movieSeq}/editform" method="GET" id="inquiryMovie">
			<table border="1">
				<th></th>
				<th>영화명</th>
				<th>줄거리</th>
				<th>연령가</th>
				<th>제작국가</th>
				<th>러닝타임</th>
				<th>다운로드링크</th>
				<th>장르1</th>
				<th>장르2</th>
				<th>감독</th>
				<th>배우</th>
				<tr>
					<td><img src="/img/${movie.poster}" /></td>
					<td>${movie.title}</a></td>
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
			</table>
			<input type="submit" value="수정" />
		</form>
		<a href="/movie/list"><input type="button" value="전체 영화 목록 보기"></a>
	</body>
</html>