<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보</title>
	</head>
	<body>
		<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
		<h1>회원 정보 조회</h1>
		<form action="/member/${member.memberId}/delete" method="get">
			ID : ${member.memberId} <br/> <input type="hidden" name="memberId" value="${member.memberId}"/>
			비밀번호 : ${member.memberPassword} <br/>
			이름 : ${member.memberName} <br/>
			나이 : ${member.memberAge} <br/>
			성별 : <c:if test="${member.memberGender eq 'M'}">남성</c:if>
				 <c:if test="${member.memberGender eq 'F'}">여성</c:if><br/>
			회원 활동 여부 : 활동중 <br/>
			<a href = "/member/${member.memberId}/editform"><button type="button" id="btn_edit">수정하기</button></a>
		</form>
		<form action="/member/${memberId}/delete" method="get">
				<input type="submit" id="btn_delete" value="탈퇴하기"/>
		</form>
	</body>
</html>