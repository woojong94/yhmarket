<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Board.dto.Board"%>

<%
   String action = (String)request.getAttribute("action");
   String url = (String)request.getAttribute("url");
   Board board = (Board)request.getAttribute("board");
%>
<c:set var="board" value="<%=board%>" />
<script src="<%=url%>/deco/js/write.js"></script>
<div class="wrap_write">
   <div class="board_write">
      <form name='writeFrm' method="post" action="<%=action%>" target='ifrmHidden'>
         <c:if test="${board != null}">
            <input type='hidden' name='idx' value="<c:out value='${board.idx}' />" />
         </c:if>
          <br>
         <table border="0">
            <tr>
               <td colspan="2" class="subject_write"><input type="text" name="subject" class="write_input" placeholder="제목을 작성하세요" value="<c:out value='${board.subject}' />"></td>
            </tr>
            <tr>
               <td class="poster_write"><input type="text" name="poster" class="write_input" placeholder="작성자" value="<c:out value='${board.poster}' />"></td>
               <td class="price_write"><input type="text" name="price" class="write_input" placeholder="가격을 적어주세요" value="<c:out value='${board.price}' />"></td>
            </tr>
            <tr>
              <td colspan="2"><textarea id="content" name="content" width="1000" height="1000"><c:out value="${board.content}" /></textarea></td>
               </tr>
               <tr>
                  <td><button type="button" id="add"><i class="xi-library-image"></i>이미지 추가</button></td>
                <c:choose>
                  <c:when test='${board == null}'>
                  <td style="float: right"><input type="submit" class="write_input_submit" value="작성하기">
                  </c:when>
                  <c:otherwise>
                  <td style="float: right"><input type="submit" class="write_input_submit" class="edit" value="수정하기">
                  </c:otherwise>
               </c:choose>
               <input type="reset" class="write_input_submit write_cancel" value='작성취소'></td>
            </tr>
         </table>
      </form>
   </div>
</div>


