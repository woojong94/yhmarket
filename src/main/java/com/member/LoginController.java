package com.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MemberDAO;

public class LoginController extends HttpServlet {

	/* 로그인 양식 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/loginForm.jsp");
		rd.include(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
	
		/* 로그인 성공시 */

		//dao.login(request); // DAO에 login 메서드 추가하자
		
		
	}
}
