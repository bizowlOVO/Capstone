# Capstone
## team 5 movie recomender
### Author
  이선진, 이민정, 김솔잎, 이영성

* MRS Program List

*****

  1 agent
  
    - Admin.java
    
    - Bookmark.java
    
    - Genre.java
    
    - Member.java
    
    - Movie.java
    
    - RecommendByAge.java
    
    - Review.java
    
  각 분류별 데이터 접근을 위한 DAO 객체
  
  2 common
  
    -CommonController.java : 공통 기능 전반의 컨트롤러 레이어 객체
    
    -CommonService.java : 공통 기능 전반의 서비스 레이어 인터페이스
    
    -CommonServiceImpl.java : 공통 기능 전반의 서비스 레이어 구현체
    
    -MrsInterceptor.java : 로그인을 통해 세션을 부여받은 사용자만 접근이 가능하게끔 만드는 Interceptor 객체
    
    -WebConfig : Interceptor를 통해 접근 가능한 영역과 불가능한 영역을 기술한 WebConfig 객체
    
    
  3 genre
  
    -GenreMapper.java : 장르 부분 데이터 접근을 위한 매퍼 객체
    
    -GenreMapper.xml : 장르 부분 매핑 구문을 기술한 Xml 파일
    
    -GenreService.java : 장르 기능 전반의 서비스 레이어 인터페이스
    
    -GenreServiceImpl.java : 장르 기능 전반의 서비스 레이어 구현체
    
    
  4 member
  
    -MemberController.java : 사용자 기능 전반의 컨트롤러 레이어 객체
    
    -MemberMapper.java : 사용자 부분 데이터 접근을 위한 매퍼 객체
    
    -MemberMapper.xml : 사용자 부분 매핑 구문을 기술한 Xml 파일
    
    -MemberService.java : 사용자 기능 전반의 서비스 레이어 인터페이스
    
    -MemberServiceImpl.java : 사용자 기능 전반의 서비스 레이어 구현체
    
  5 movie
  
    -MovieController.java : 영화 기능 전반의 컨트롤러 레이어 객체
    
    -MovieMapper.java : 영화 부분 데이터 접근을 위한 매퍼 객체
    
    -MovieMapper.xml : 영화 부분 매핑 구문을 기술한 Xml 파일
    
    -MovieService.java : 영화 기능 전반의 서비스 레이어 인터페이스
    
    -MOvieServiceImpl.java : 영화 기능 전반의 서비스 레이어 구현체
    
  6 recommendation
  
    -RecommendationService : 추천 서비스를 위한 서비스 레이어 인터페이스
    
    -RecommendationServiceImpl : 추천 서비스를 위한 서비스 레이어 구현체
    
  7 review
  
    -ReviewController.java : 리뷰 기능 전반의 컨트롤러 레이어 객체
    
    -ReviewMapper.java : 리뷰 부분 데이터 접근을 위한 매퍼 객체
    
    -ReviewMapper.xml : 리뷰 부분 매핑 구문을 기술한 Xml 파일
    
    -ReviewService.java : 리뷰 기능 전반의 서비스 레이어 인터페이스
    
    -ReviewServiceImpl : 리뷰 기능 전반의 서비스 레이어 구현체
    
  8 mrs
  
    -MovierecommenderApplication.java
    
    웹 기반 영화 추천 서비스(mrs) 구동을 위한 실행 파일
    
    
    -----------------------------------------------------------------------------------------------
* MRS jsp List

  1 admin
  
    -mainpage.jsp : 관리자 전용 메인 페이지
    
  2 common
  
    -login.jsp : 공통 부분 로그인을 위한 페이지
    
    -top.jsp : 공통 부분 웹 페이지 기준 상단에 지속적으로 노출되도록 유도하는 페이지
  3 member
  
    -editMember.jsp : 회원 정보 수정을 위한 form
    
    -inquiryMember.jsp : 회원 정보 조회를 위한 페이지
    
    -insertMember.jsp : 회원 정보 등록을 위한 form
    
    -mainpage.jsp : 일반 회원을 위한 메인 페이지
    
  4 movie
  
    -editMovie.jsp : 영화 정보의 수정을 위한 form
    
    -inquiryMovie.jsp : 영화 정보 조회를 위한 페이지
    
    -insertMovie.jsp : 영화 정보 등록을 위한 form
    
    -movieList : 영화의 목록이 출력되기 위한 페이지
    
  5 review
  
    -editReview.jsp : 리뷰를 수정하기 위한 form
    
    -insertReview.jsp : 리뷰를 등록하기 위한 form
    
    -inquiryReview.jsp : 리뷰 정보를 조회하기 위한 페이지
    
    -reviewList.jsp : 리뷰 목록을 출력하기 위한 페이지
    
    -------------------------------------------------------------------------------------------------------------
    
* Else

  pom.xml : 의존 설정
    
