<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

	<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css"> -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    
    <!-- <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
    <!-- icon -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<style>
		body{
			background:rgba(0, 0, 0, 0.76);
		}
		a {
			color: white;
		}

	</style>
</head>
<body>

	<div class="container">
		<div class="d-flex justify-content-center">
			<div class="card mt-5 col-md-4 animated bounceInDown myForm">
				<div class="card-header">
					<h4 style="text-align: center; font-size: 35px;">MRS</h4>
				</div>
				<div class="card-body">
					<form action="/common/login" method="POST">
						<div id="dynamic_container">
							<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text br-15"><i class="fas fa-user"></i></span>
								</div>
								<input type="text" name='memberId' placeholder="ID" class="form-control"/>
							</div>
							<div class="input-group mt-3">
								<div class="input-group-prepend">
									<span class="input-group-text br-15"><i class="fas fa-key"></i></span>
								</div>
								<input type="password" name='memberPassword' placeholder="PW" class="form-control"/>
							</div>
						</div>

						<div class="card-footer">
							<button class="btn btn-secondary btn-sm" id="add_more">
								<a href="/member/addform">
									<!-- <input type="button" class="btn btn-secondary btn-sm" id="add_more"/> -->
									<i class="fas fa-plus-circle"></i>회원가입
								</a>
							</button>
							<!-- <button class="btn btn-success btn-sm float-right submit_btn">
								<i class="fas fa-arrow-alt-circle-right"></i>로그인
							</button> -->
							<input type="submit" class="btn btn-success btn-sm float-right submit_btn" value="로그인">
							<i class="fas fa-arrow-alt-circle-right"></i>로그인
						</div>

					</form>
				</div>
			</div>
		</div>
		</div>


	<!-- <h1>영화 추천 웹 서비스 로그인</h1>
	<form action="/common/login" method="POST">
	아이디    <input type="text" name='memberId'/><br>
	비밀번호 <input type="password" name ='memberPassword'/><br>
	<input type="submit" value="로그인"/><br><br>
	</form>
	
	<a href="/member/addform"><input type="button" value="회원가입" /></a> -->
</body>
	<script>
	</script>
</html>