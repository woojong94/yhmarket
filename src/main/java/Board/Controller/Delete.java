package Board.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Board.dao.BoardDao;

public class Delete extends HttpServlet{
	private static final long serialVersionUID = -1L;
	private PrintWriter out;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		BoardDao dao = new BoardDao();
		int idx = Integer.parseInt(request.getParameter("idx"));
		boolean result = dao.delete(idx);
		if (result) {
			response.sendRedirect("list");
		} else {
			out.print("<script>alert('삭제 실패했습니다.');history.back();</script>");
		}
		
	}
}
