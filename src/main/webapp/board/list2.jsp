<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Board.dto.Board" %>
<%
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
	String pageNumber = (String) request.getAttribute("pageNumber");
%>
<c:set var="list" value="<%=list%>" />
	<h1>게시판 목록</h1>
		<ul>
			<c:forEach var="board" items="${list}">
			<li>
				<a href='view?idx=${board.idx}'>
						${board.subject} / {$board.price} / ${board.poster} / ${board.regDt}<br>
				</a>
			</li>
	</c:forEach>
</ul>
<%=pageNumber%>
<a href='write'>글 쓰기</a>