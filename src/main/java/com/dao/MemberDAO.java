package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Exception.AlertException;
import com.core.DB;
import com.dto.MemberDTO;

public class MemberDAO {
	
	/* 회원가입 처리 */
	public boolean join(HttpServletRequest request) {
		String sql = "INSERT INTO member (memId, memPw, memNm) VALUES(?,?,?)";
		try(Connection conn = DB.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			String memId = request.getParameter("memId");
			String memPw = request.getParameter("memPw");
			String memNm = request.getParameter("memNm");
			
			pstmt.setString(1,  memId);
			pstmt.setString(2,  memPw);
			pstmt.setString(3,  memNm);
			
			int result = pstmt.executeUpdate();
			
			if(result < 1)
				return false;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/* 회원가입 필수 입력, 유효 검사 */
	public void CheckData(HttpServletRequest request) throws AlertException {
		/* 필수 입력 항목 */
		String[] required = {
			"memId//아이디를 확인하세요.",
			"memPw//비밀번호를 확인하세요.",
			"memPwRe//비밀번호를 확인하세요.",
			"memNm//회원명을 확인하세요."
		};
		for(String str : required) {
			String[] required2 = str.split("//");
			
			if(request.getParameter(required2[0]) == null || request.getParameter(required2[0]).trim().equals("")) {
				throw new AlertException(required2[1]);
			}
		}
		
		/* ID, PW 자리수 */
		String memId = request.getParameter("memId").trim();
		String memPw = request.getParameter("memPw").trim();
		if(memId.length() < 8 || memId.length() > 12) {
			throw new AlertException("아이디는 한글과 특수문자를 제외한 8~12자리로 입력해주세요.");
		}
		if(memPw.length() < 8 || memPw.length() > 12) {
			throw new AlertException("비밀번호는 특수문자를 포함한 영문자나 숫자 8~12자리로 입력해주세요.");			
		}
		
		/* 아이디 중복 체크 */
		String sql = "SELECT COUNT(*) cnt FROM member WHERE memId = ?";
		try(Connection conn = DB.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, memId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int cnt = rs.getInt("cnt");
				if(cnt > 0) {
					throw new AlertException(memId + " 는 중복된 아이디 입니다.");
				}
			}
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/* 비밀번호 일치 체크 */
		String memPwRe = request.getParameter("memPwRe");
		if(!memPw.equals(memPwRe)) {
			throw new AlertException("비밀번호가 일치하지 않습니다.");
		}
	}

	/* 로그인 처리 */
	public void login(HttpServletRequest request, HttpServletResponse response, String memId, String memPw) throws IOException, AlertException {
		/* 필수 입력란 체크 S */
		if(memId == null) {
			throw new AlertException("아이디를 입력해주세요.");
		}
		if(memPw == null) {
			throw new AlertException("비밀번호를 입력해주세요.");
		}
		/* 필수 입력란 체크 E */
		
		
	}
}
