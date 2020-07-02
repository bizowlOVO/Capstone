<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<head><title>회원 정보 수정</title></head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<h3>회원 정보 수정</h3>
	<form action="/member/${member.memberId}" method="post">
		ID : ${member.memberId} <input type="hidden" name="memberId" value="${member.memberId}"/> <br/>
		비밀번호 : <input type="password" name="memberPassword" value="${member.memberPassword}"/> <br/>
		이름 : <input type="text" name="memberName" value="${member.memberName}"/> <br/>
		나이 : <input type="text" name="memberAge" value="${member.memberAge}"/> <br/>
		성별 : <c:if test="${member.memberGender eq 'M'}">
				<input type="radio" name="memberGender" value="M" checked="checked" /> 남자
				<input type="radio" name="memberGender" value="F" /> 여자 <br/> <br/>
			 </c:if>
			 <c:if test="${member.memberGender eq 'F'}">
			 	<input type="radio" name="memberGender" value="M" /> 남자
				<input type="radio" name="memberGender" value="F" checked="checked" /> 여자 <br/> <br/>
			 </c:if><br/>
			
			<input type="submit" value="수정완료">
	</form>
</body>
</html>