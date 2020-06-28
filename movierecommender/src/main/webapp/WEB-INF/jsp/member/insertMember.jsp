<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<head> 
	<title>회원가입</title>
	<link rel="stylesheet" href="css/bootstrap.css">
 	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        
        <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
	
	<div class="create-account">
		<div class="row">
			<div class="col-md-5 mx-auto">
				<div id="first">
					<div class="myform form">
						<div>
							<div class="text-center">
								<h2>회원가입</h2>
							</div>
						</div>
					<form action="/member" method="post" name="form" id="form" >
							<div class="form-group">
								<!-- 중복확인 기능 -->
								<label>아이디</label>
								<input type="text" name="memberId" id="memberId" onchange="reCheck()" class="form-control" placeholder="아이디를 입력하세요">
								<button type="button" class="btn btn-secondary btn-sm " name="check_btn" id="check_btn" style="float: right; margin-top: 5px;">중복확인</button>
								<div class="already" id="already"></div>
							</div><br>
							<div class="form-group">
								<label>비밀번호</label>
								<input type="password" name="memberPassword" id="password"  class="form-control" placeholder="비밀번호를 입력하세요">
							</div>
							<div class="form-group">
								<label>이름</label>
								<input type="text" name="memberName" class="form-control" id="name"  placeholder="이름을 입력하세요">
							</div>
							<div class="form-group">
								<label>나이</label>
								<input type="text" name="memberAge" class="form-control" id="age" placeholder="나이를 입력하세요">
							</div>
							<div class="form-group form-cf">
								<h6>성별</h6><br>
								<form class="form-cf">
									<section class="plan cf">
										<input type="radio" name="memberGender" id="maleRadio" value="M"><label for="maleRadio">남자</label>
										<input type="radio" name="memberGender" id="femaleRadio" value="F" checked><label for="femaleRadio">여자</label>
									</section>
								</form>
							</div>
							
							<div class="col-md-12 text-center ">
								<button type="submit" id="add_on" class="btn btn-success float-center submit_btn" style="margin-top: 3rem;">완료</button>
							<div class="notice_area" id="notice_area"></div><br/>
							<div class="notice_areae" id="notice_areae"></div><br/>
							</div>
							</form>
						</form>
					
					</div>
				</div>
			</div>
	  </div>   
	</div>



   <!-- 

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

    -->


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
      
      $("#add_on").click(function() {
         
         var memberId = $('#memberId').val();
            var memberPassword = $('#memberPassword').val();
            var memberName = $('#memberName').val();
            var memberAge = $('#memberAge').val();
            var memberGender = $('#memberGender').val();
            var isCheck = $("input[name=isChecking]").val();
         
            if (isCheck == "false") {
             $("#already").text("중복 체크 후 등록해주세요.");
             $("#already").css("color", "red");
s          }  else if (isCheck == "change") {
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