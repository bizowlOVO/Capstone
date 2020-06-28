<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>top</title>
   <link rel="stylesheet" href="css/bootstrap.css">
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

   <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
   <!-- Transparent Sticky NavBar -->
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <meta http-equiv="X-UA-Compatible" content="ie=edge">

   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
   <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   <script src="js/bootstrap.js"></script>
</head>
<body>

   <div>
      <header>
         <nav>
            <div class="menu-icon">
               <i class="fa"></i>
            </div>
            <div class="logo">
               <a href="/member/mainpage">MRS</a>
            </div>
            <div class="menu">
               <ul>
                  <li><a href="/member/domypage">마이페이지</a></li>

                  <!-- 북마크 href 수정해야함 -->
                  <li><a href="/member/mainpage">북마크</a></li>
                  <li><a href="/common/logout">로그아웃</a></li> 
              </ul>
            </div>
         </nav>
      </header>

      <div class="content">
         <!-- 검색폼 css 수정해야함 -->
         <form action="/movie/searchMovie" method="GET">
            <input type="text" name="search"/>
            <input type="submit" value="검색" />
        </form>
      </div>
   </div>




   <!-- ${sessionScope.id} 님 안녕하세요?
   <a href="/common/logout"><input type="button" value="로그아웃"></a>
   <a href="/member/domypage">마이페이지</a>
   <a href="/common/mainpage">홈</a>
   <br><br>
   
   <form action="/movie/searchMovie" method="GET">
      <input type="text" name="search"/>
      <input type="submit" value="검색" />
   </form> -->
   
</body>
</html>