package Board.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Board.dao.*;

public class Write extends HttpServlet {
	private static final long serialVersionUID = -1L;
	
	/**
	 * Get 글쓰기 포멧 출력
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8");
		
		request.setAttribute("action", "write");
		
		RequestDispatcher re = request.getRequestDispatcher("/board/write.jsp");
		re.include(request, response);
	}
	
	/**
	 * Post 게시글 저장
	 * @throws IOException 
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html charset='utf-8");
		BoardDao dao = new BoardDao();
		int idx;
		try {
			PrintWriter out = response.getWriter();
			idx = dao.write(request);
				if( idx > 0) {
					out.print("<script>parent.location.href='view?idx="+ idx + "';</script>");
				} else {
					out.print("<script>alert('게시글 등록에 실패했습니다');</script>");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
