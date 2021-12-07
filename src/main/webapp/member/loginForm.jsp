<%@ page contentType="text/html; charset=utf-8"%>

<form method="post" action="login" target="ifrmHidden" autocomplete="off">
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
	<input type="submit" value="로그인!">
</form>