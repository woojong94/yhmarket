<%@ page contentType="text/html; charset=utf-8"%>

<form method="post" action="join" target="ifrmHidden" autocomplete="off">
	<dl>
		<dt>아이디</dt>
		<dd>
			<input type="text" name="memId" placeholder="아이디를 입력하세요.">
		</dd>
	</dl>
	<dl>
		<dt>비밀번호</dt>
		<dd>
			<input type="password" name="memPw" placeholder="비밀번호를 입력하세요.">
		</dd>
	</dl>
	<dl>
		<dt>비밀번호 확인</dt>
		<dd>
			<input type="password" name="memPwRe" placeholder="비밀번호를 확인하세요.">
		</dd>
	</dl>
	<dl>
		<dt>회원명</dt>
		<dd>
			<input type="text" name="memNm" placeholder="회원명을 입력하세요">
		</dd>
	</dl>
	<input type="submit" value="가입하기">	
</form>
