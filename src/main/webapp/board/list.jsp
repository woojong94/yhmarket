<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Board.dto.Board" %>
<%@ page import="Board.core.Pagination" %>
<%
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	String pageLink = (String)request.getAttribute("pageLink");
%>
<c:set var="list" value="<%=list%>" />
	<div class="wrap">
	 	<div class="list_board">
		<div style="width : 500px; margin : auto; position : relative; padding-bottom : 10px;">
			<h1 style="text-align : center; font-size : 45pxl; padding_top">구매 게시판</h1>
			<div class="line"></div>
			<br>
			<br>
		</div>
		<table border="0" style="width : 100%;">
		 	<tr>
		 		<td class="list_poster">게시글 번호</td>
		 		<td class="list_subject" style="text-align : center">제목</td>
		 		<td class="list_poster">작성자</td>
		 		<td class="list_regDt">작성일</td>
		 	</tr>
		 	<c:forEach var="board" items="${list}">
			 	<tr>
			 		<td colspan="4"><div class="line"></div></td>
			 	</tr>
				<tr>
					<td class="list_idx">${board.idx}</td>
					<td class="list_subject"><a href='view?idx=${board.idx}'>${board.subject}</a></td>
					<td class="list_poster">${board.poster}</td>
					<td class="list_regDt">${board.regDt}</td>
				</tr>
			</c:forEach>
			<tr>
		 		<td colspan="4"><div class="line"></div></td>
		 	</tr>
			<tr>
				<td colspan="4" style="text-align : right; padding : 0 15px;"><button type="button"><a href='write'>글 쓰기</button></a></td>
			</tr>
		</table>
	<%=pageLink %>
	</div>
</div>