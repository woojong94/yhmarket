package com.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MemberDAO;

public class JoinController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* 회원가입 양식 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher rd = request.getRequestDispatcher("/member/joinForm.jsp");
		rd.include(request, response);
	}
	
	/* 회원가입 처리 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8"); // 사용자가 전송한 데이터 깨짐 방지
		PrintWriter out = response.getWriter();
		
		try {
			MemberDAO dao = new MemberDAO();
			boolean result = dao.join(request);
			
			if(!result) {
				out.print("<script>alert('회원가입 실패 ㅋㅋ')</script>");
				return;
			}
			out.print("<script>alert('회원가입 성공~~~~')</script>");
		} catch(Exception e) {
			out.print("<script>alert('" + e.getMessage() + "');</script>");
			return;
		}
	}
}

