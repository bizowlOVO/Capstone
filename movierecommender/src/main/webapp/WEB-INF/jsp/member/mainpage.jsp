<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<<<<<<< HEAD
<meta charset="UTF-8">
<title>메인!</title>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<c:if test="${not empty recentlyMovie}">
		<h1>최근 개봉 영화</h1><br>
		<table>
			<c:forEach items="${recentlyMovie}"  var="recently">
					<td>
					<img src="/img/${recently.poster}" style="width:200px; height:auto;"/><br>
					<a href = "/movie/${recently.movieSeq}">${recently.title}</a><br>
					${recently.releaseDate}
					</td>
			</c:forEach>
		</table>
	</c:if>
	<br><br>
	<c:if test="${not empty viewMovie}">
		<h1>사용자들이 많이 보는 영화</h1>
		<table>
			<c:forEach items="${viewMovie}" var="view">
					<td>
					<img src="/img/${view.poster}" style="width:200px; height:auto;"/><br>
					<a href = "/movie/${view.movieSeq}">${view.title}</a><br>
					${view.releaseDate}
					</td>
			</c:forEach>
		</table>
	</c:if>
	<br><br>
	<c:if test="${not empty reviewMovie}">
		<h1>사용자들의 반응이 좋은 영화</h1>
		<table>
			<c:forEach items="${reviewMovie}" var="review">
					<td>
					<img src="/img/${review.poster}" style="width:200px; height:auto;"/><br>
					<a href = "/movie/${review.movieSeq}">${review.title}</a><br>
					${review.releaseDate}
					</td>
			</c:forEach>
		</table>
	</c:if>
=======
   <meta charset="UTF-8">
   <title>메인</title>
</head>
<body>
   <%@ include file="/WEB-INF/jsp/common/top.jsp" %>
      <c:if test="${not empty recentlyMovie}">
         <h1>최근 개봉 영화</h1><br>
         <table border="1">
            <th></th>
            <c:forEach items="${recentlyMovie}" var="recently">
               <tr>
                  <td>
                  ${recently.poster}<br>
                  <a href = "/movie/${recently.movieSeq}">${recently.title}</a><br>
                  ${recently.releaseDate}
                  </td>
               </tr>
            </c:forEach>
         </table>
      </c:if>
      <br><br>
      <c:if test="${not empty viewMovie}">
         <h1>조회수가 많은 영화</h1>
         <table border="1">
            <th></th>
            <c:forEach items="${viewMovie}" var="view">
               <tr>
                  <td>
                  ${view.poster}<br>
                  <a href = "/movie/${view.movieSeq}">${view.title}</a><br>
                  ${view.releaseDate}
                  </td>
               </tr>
            </c:forEach>
         </table>
      </c:if>
      <a href="/movie/addform">영화등록</a>
>>>>>>> Lsj
</body>
</html>