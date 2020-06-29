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
	<h1>영화 목록</h1>
	<table border="1">
		<c:forEach items="${review}" var="review">
			<c:forEach items="${movies}" var="movie">
				<tr>
					<td>
						작성자 : ${review.memberId}<br>
						영화명 : ${movie.title}<br>
						내용 : ${review.reviewComment}<br>
						평점 : ${review.grade}<br>
						작성 날짜 : ${review.reviewPostDate}<br>
					</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
</body>
	<script>
	</script>
</html>