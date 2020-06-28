<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<head><title>회원가입</title></head>
<body>
<div align="center">
	<h3>회원가입</h3>
	<form action="/member" method="post" id="form" name="form">
		ID : <input type="text" name="memberId" id="memberId" onchange="reCheck()"/> 
		<button type="button" name="check_btn" id="check_btn">중복 확인</button><br/>
		 <div class="already" id="already"></div><br/><div class="spaceOne" id="spaceOne"></div><br/>
		비밀번호 : <input type="password" name="memberPassword"/> <br/>
		<div class="spaceTwo" id="spaceTwo"></div><br/>
		이름 : <input type="text" name="memberName"/> <br/>
		<div class="spaceThree" id="spaceThree"></div><br/>
		나이 : <input type="text" name="memberAge"/> <br/>
		<div class="spaceFour" id="spaceFour"></div><br/>
		성별 :
			<input type="radio" name="memberGender" value="M" /> 남자
			<input type="radio" name="memberGender" value="F" /> 여자 <br/>
			<div class="spaceFive" id="spaceFive"></div><br/>
			<button type="button" id="add_btn">등록</button>
		<div class="notice_area" id="notice_area"></div><br/>
		<div class="notice_areae" id="notice_areae"></div><br/>
	</form>
	</div>
</body>
<script>
	$(document).ready(function(){
		    $("#check_btn").click(function() {
		         var memberId = $('#memberId').val();
		         var memberPassword = $('#memberPassword').val();
		         var memberName = $('#memberName').val();
		         var memberAge = $('#memberAge').val();
		         var memberGender = $('#memberGender').val();
		         var isCheck = $("input[name=isChecking]").val();
		            $.ajax({
		               url : '${pageContext.request.contextPath}/member/addform/isduplicate?memberId='+ memberId,
		               type : 'get',
		               success : function(data) {
		            	  if(memberId != ""){
			                  if (data == true) {
			                     $("#already").text("중복 확인이 되었습니다");
			                     $("input[name=isChecking]").val("true")
			                     $("#already").css("color", "black");
			                  } else {
			                     $("#already").text("이 아이디를 사용하실 수 없습니다");
			                     $("#already").css("color", "red");
			                  }
		            	  } else if(memberId == "") {
		            		  $("#already").text("아이디를 입력하세요");
		            		  $("#already").css("color", "red");
		            	  }
		               }
		            });
		      });
	
		
		
		function reCheck() {
			var isCheck = $("input[name=isChecking]").val();
			if (isCheck == "true") {
				$("input[name=isChecking]").val("change");
			}
		};
		
		$("#add_btn").click(function() {
			
			var memberId = $('#memberId').val();
	         var memberPassword = $('#memberPassword').val();
	         var memberName = $('#memberName').val();
	         var memberAge = $('#memberAge').val();
	         var memberGender = $('#memberGender').val();
	         var isCheck = $("input[name=isChecking]").val();
			
	         if (isCheck == "false") {
	 			$("#already").text("중복 체크 후 등록해주세요.");
	 			$("#already").css("color", "red");
	 			console.log("ㅇ여기까진 들어옴");
	 		}  else if (isCheck == "change") {
	 			$("#already").text("중복 체크를 다시 해주세요");
	 			$("#already").css("color", "red");
	 		} else if (memberId == "" 
	 				|| memberPassword == ""
	 				|| memberName == ""
	 				|| memberAge == ""
	 				|| memberGender == "" ) {
	 			$("#notice_areae").text("항목을 모두 채워서 등록해주세요.");
	 			$("#notice_areae").css("color", "red");
	 		} else {
				$("#form").submit();
			} 
		})
	});
/*
	if (memberId == ""){
		$("#spaceOne").text("아이디를 입력해주세요");
		$("#spaceOne").css("color", "red");
	} else if (memberPassword == "") {
		$("#spaceTwo").text("비밀번호를 입력해주세요");
		$("#spaceTwo").css("color", "red");
	} else if (memberName == ""){
		$("#spaceThree").text("이름을 입력해주세요");
		$("#spaceThree").css("color", "red");
	} else if(memberAge == ""){
		$("#spaceFour").text("나이를 입력해주세요");
		$("#spaceFour").css("color", "red");
	} else if(memberGender == ""){
		$("#spaceFive").text("성별을 선택해주세요");
		$("#spaceFive").css("color", "red");
	} else {
		$("#form").submit();
	}
 */
		</script>
</html>
