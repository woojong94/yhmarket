<%@ page contentType="text/html; charset=utf-8" %>
<h3>파일 업로드</h3>
<form name='frame' method="post" action="upload" enctype="multipart/form-data" target='ifrmHidden'>
	<input type="file" name="file">
</form>
<script>
window.addEventListener("DOMContentLoaded", function() {
	const file = document.getElementsByName("file")[0];
	file.addEventListener("change", function() {
		frame.submit();
	});
});
</script>