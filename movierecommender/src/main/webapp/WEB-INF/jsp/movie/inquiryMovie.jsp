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
		<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
		<h1>영화 상세 조회</h1>
		<form action="/review/addform/${movie.movieSeq}" method="GET">
			<input type="submit" value="리뷰작성" />
		</form>
		<form action="/review/list/${movie.movieSeq}" method="GET">
			<input type="submit" value="리뷰보기" />
		</form>
			<table>
				<tr>
					<td><img src="/img/${movie.poster}" style="width:200px; height:auto;"/></td>
					<td><h1>${movie.title}</h1>
					줄거리 : ${movie.synopsis}<br>
					관람가 : ${movie.filmAge}<br>
					제작 국가 : ${movie.directCountry}<br>
					재생 시간 : ${movie.runningTime}<br>
					장르 : ${movie.genreFirst}, ${movie.genreSecond}<br>
					감독 : ${movie.director}<br>
					배우 : ${movie.actor}</td>
				</tr>
			</table>
			<a href=${movie.downloadLink}><input type="button" value="다운로드" /></a><br>
		<c:if test="${sessionScope.id eq 'admin001'}">
			<a href="/movie/${movie.movieSeq}/editform"><input type="button" value="수정" /></a>
			<a href="/movie/list"><input type="button" value="전체 영화 목록 보기"></a>
		</c:if>
	</body>
</html>