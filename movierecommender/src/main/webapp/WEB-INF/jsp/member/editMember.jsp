<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<head><title>회원 정보 수정</title></head>
<body>
	<h3>회원 정보</h3>
	<form action="/member/${member.memberId}" method="post">
		ID : <input type="text" name="memberId" value="${member.memberId}"/> <br/>
		비밀번호 : <input type="password" name="memberPassword" value="${member.memberPassword}"/> <br/>
		이름 : <input type="text" name="memberName" value="${member.memberName}"/> <br/>
		나이 : <input type="text" name="memberAge" value="${member.memberAge}"/> <br/>
		성별 : <input type="text" name="memberGender" value="${member.memberGender}"/> <br/>
			
			<input type="submit" value="수정">
	</form>
</body>
</html>