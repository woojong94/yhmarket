<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Board.dto.Board"%>
<%
   Board board = (Board)request.getAttribute("board");
%>
<c:set var="board" value="<%=board%>"/>
<div class="wrap">
      <div class="board_view">
      <table border="0">
         <tr>
            <td class="subject">${board.subject}</td>
            <td class="poster">${board.poster}</td>
         </tr>
         <tr>
            <td colspan="2"><div class="line"></div></td>
         </tr>
         <tr>
            <td class="regDt" colspan="2">작성시간 : ${board.regDt}</td>
         </tr>
         <tr>
            <td class="content" colspan="2">${board.content}</td>
         </tr>
         <tr>
            <td class="price" colspan="2">상품가격(<i class='xi-won' ></i>) : ${board.price}</td>
         </tr>
         <tr>
            <td colspan="2"><div class="line"></div></td>
         </tr>
         <tr>
            <td colspan="2"><div class="menu">
          <div class = "select">  
             <a href='edit?idx=${board.idx}'><button type="button" class="edit">수정</button></a>
              <a href='delete?idx=${board.idx}' onclick="return confirm('정말 삭제하시겠습니까?');"><button type="button" class="delete">삭제</button></a>
               <a href='list'><button type="button" class="list">목록</button></a>
               </div>
            </div></td>
         </tr>
      </table>
   </div>
</div>