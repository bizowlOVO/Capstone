<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<head><title>회원 정보 등록</title></head>
<body>
	<%@ include file="/WEB-INF/jsp/common/top.jsp" %>
	<h3>회원 정보 등록</h3>
	<form action="/member" method="post">
		ID : <input type="text" name="memberId"/> <br/>
		비밀번호 : <input type="password" name="memberPassword"/> <br/>
		이름 : <input type="text" name="memberName"/> <br/>
		나이 : <input type="text" name="memberAge"/> <br/>
		성별 :
			<input type="radio" name="memberGender" value="M" /> 남자
			<input type="radio" name="memberGender" value="F" /> 여자 <br/>
			<input type="submit" value="등록">
	</form>
</body>
</html>