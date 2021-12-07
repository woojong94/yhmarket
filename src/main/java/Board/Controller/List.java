package Board.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Board.dao.BoardDao;
import Board.dto.Board;
import Board.core.Pagination;

public class List extends HttpServlet{
	private static final long serialVersionUID = -1L; 
	private PrintWriter out;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			BoardDao dao = new BoardDao();
			ArrayList<Board> list = dao.getList();
			request.setAttribute("list", list);
			
			int total = dao.getTotal();
			Pagination pagination = new Pagination(request, total);
			String pageLink = pagination.getPageHtml();
			request.setAttribute("pageLink", pageLink);
			
		} catch (Exception e) {
			out.printf("<script>alert('잘못됐습니다. 돌아갑니다!');history.back();</script>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
		rd.include(request, response);
	}
}