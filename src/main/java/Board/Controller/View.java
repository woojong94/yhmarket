package Board.Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import Board.dao.BoardDao;
import Board.dto.Board;

public class View extends HttpServlet {
	private static final long serialVersionUID = -1L;
	private PrintWriter out;
	
	/** 보기 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
		
		BoardDao dao = new BoardDao();
		int idx = Integer.parseInt(request.getParameter("idx"));
		Board board = dao.view(idx);
		request.setAttribute("board", board);
		
		if(board == null) {
			out.print("<script>alert('해당 게시글이 없습니다.');</script>");
			return;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/view.jsp");
		rd.include(request, response);
	}
}
