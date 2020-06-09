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
			ID : ${memeber.memberId} <br/>
			비밀번호 : ${member.memberPassword} <br/>
			이름 : ${member.memberName} <br/>
			나이 : ${member.memberAge} <br/>
			성별 : ${member.memberGender} <br/>
			회원 탈퇴 여부 :
	</body>
</html>