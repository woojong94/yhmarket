package Board.Controller;


import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import Board.dto.Board;
import Board.dao.BoardDao;

public class Edit extends HttpServlet {
	private static final long serialVersionUID = -1L;
	
	/** 게시글 수정 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		if (request.getParameter("idx") == null) {
			out.print("<script>alert('없는 게시글 입니다.');history.back();</script>");
			return;
		}
	
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDao dao = new BoardDao();
		Board board = dao.get(idx);
		if (board == null) {
			out.print("<script>alert('게시글이 없습니다.');history.back();</script>");
			return;
		}
		
		request.setAttribute("board", board);
		request.setAttribute("action", "edit");
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/write.jsp");
		rd.include(request, response);
	}
	
	/** 게시글 수정 처리 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDao dao = new BoardDao();
		boolean result = dao.edit(request);
			if (result) {
				out.print("<script>alert('수정했습니다.');</script>");
				out.print("<script>parent.location.href='view?idx=" + idx + "';</script>");
			} else {
				out.print("<script>alert('수정을 실패했습니다.');</script>");
			}
		}
	}
