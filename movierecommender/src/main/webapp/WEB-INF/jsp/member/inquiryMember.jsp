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
		<a href = "/common/mainpage"><button type="button">메인페이지 가기</button></a>
		<form action="/member/${member.memberId}/delete" method="get">
		<c:if test="${member.memberState eq 'A'}">
			ID : ${member.memberId} <br/> <input type="hidden" name="memberId" value="${member.memberId}"/>
			비밀번호 : <input type="password" name="memberPassword" value="${member.memberPassword}"/> <br/>
			이름 : <input type="text" name="memberName" value="${member.memberName}"/> <br/>
			나이 : <input type="text" name="memberAge" value="${member.memberAge}"/> <br/>
			성별 : <input type="text" name="memberGender" value="${member.memberGender}"/> <br/>
			회원 탈퇴 여부 : 활동중 <br/>
			<input type="submit" id="btn_delete" value="삭제"/>
			<a href = "/member/${member.memberId}/editform"><button type="button" id="btn_edit">수정</button></a></c:if>
		<c:if test="${member.memberState eq 'N'}">탈퇴한 회원입니다.</c:if>
		<c:if test="${member.memberState eq 'C'}">강제탈퇴당한 회원입니다.</c:if>
		</form>
	</body>
</html>