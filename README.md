<h1 align="center"> 연희마켓 YeonHee Market </h1>
<h1 align="center"> <img src="https://user-images.githubusercontent.com/86515946/144834647-f880f7ee-8035-43bb-ae3b-931bedcda581.png" width="250px" > </h1>

# • Project YeonHee Market 
```sh
TEAM B-2 연희마켓 프로젝트입니다.
KREAM.co.kr 웹사이트의 디자인을 기반으로 웹사이트를 제작하였습니다.
연희마켓은 당근마켓, 번개장터, 중고나라 와 비슷한 플랫폼의 중고거래 사이트를 목표로 제작하였습니다.
```

# 🔔 Team Member 조원 소개
• 조장 김민균 <br>
　↳ Mainpage(메인페이지), FrontEnd(JavaScipt, HTML, CSS)<br>
 <br>
• 이주영 <br>
　↳ Board(게시판), BackEnd(Java, JSP, JavaScript, MySQL, DataBase)<br>
 <br>
• 안형우 <br>
　↳ Social-Login(소셜로그인 연동), BackEnd(Java, JSP, JavaScript, MySQL, DataBase)<br>
 <br>
• 박우종 <br>
　↳ Social-Login(소셜로그인 연동), BackEnd(Java, JSP, JavaScript, MySQL, DataBase)<br>
 <br>
• 정윤호 <br>
　↳ Board(게시판), FrontEnd(JavaScript, HTML, CSS)<br>
 <br>
• 방원석 <br>
　↳ Board-FileUpload(게시판), BackEnd(Java, JSP, JavaScript, MySQL, DataBase)<br>
 <br>
• 오유성 <br>
　↳ Mainpage(메인페이지), FrontEnd(JavaScipt, HTML, CSS)
 
# 📎 연희마켓 기능 소개 (Mode-Function)
```sh
메인 페이지
-> 많이 거래되는 품목들 위주로 유저에게 게시글을 추천함 
-> 현재 진행중인 이벤트를 큰 슬라이더로 제공
-> 심플하고 정돈된 UI 
Login
-> 각 사진 캡쳐 
-> 회원가입 -> 로그인
 -> 아이디 및 비밀번호의 자리수 및 혼합문자를 사용.
 -> 비밀번호는 bcrypt를 이용하여 해쉬처리를 했습니다.
-> 네이버 로그인(Naver API를 이용)
 -> SocialLogin 하나의 추상클래스를 만들어서 구성.
 -> extends를 사용하여 편하게 사용.
Board
-> 각 사진 캡쳐 
-> 구매 게시판, 판매 게시판 -> 2개의 게시판을 분리하여 편의성을 Up.
<WritePage> -> 유효성검사를 통해 작성하지 않은 부분을 확인하고, 글이 작성안되게 설정
<EditPage> -> 수정 및 삭제가 가능하며, 바로 List로 이동이 가능하게 설정
<ViewPage> -> 수정 및 삭제가 가능
<ListPage> -> 가격을 Not Null로 설정함으로써 게시판 내용을 클릭해서 확인하기 전에 가격을 확인 가능.
```

# • 연희마켓
<h1 align="center"> 연희마켓 Mainpage (초기화면) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144835923-070edc67-1793-4781-b10c-9e8eeab27040.png">

<h1 align="center"> 게시글 작성 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144848010-47ff0b4b-e901-4446-9220-a572bb5deaa2.png">

<h1 align="center"> 게시글 보기 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144848227-34979b74-a1bd-4d60-b1d9-1fb12a3f795e.png">

<h1 align="center"> 게시글 수정 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144848413-f1dc9d10-e882-44ec-97ba-a84fdaf7216d.png">

<h1 align="center"> 게시글 삭제 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144848691-4d2696dd-10bf-45b4-950f-037334d93fb8.png">

<h1 align="center"> 로그인 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144899726-fea401c0-67a4-4d97-9444-166e7d9a688e.png">

<h1 align="center"> 회원가입 (연희마켓) </h1>
<img src="https://user-images.githubusercontent.com/86515946/144901302-9d4ab635-752f-46d4-869a-762acbc9f21b.png">

