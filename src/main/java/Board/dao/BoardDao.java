package Board.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Board.core.DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import Board.dto.Board;
import Board.core.*;

public class BoardDao {
	
	private PrintWriter out;
	/** 게시판 글 등록 
	 * @throws Exception */
	public int write(HttpServletRequest request) throws Exception {
		
		/** 유효성 검사 */
		checkData(request);
		
		int idx = 0;
		String sql = "insert into board (subject, price, content, poster) value(?, ?, ?, ?)";
		try(Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			request.setCharacterEncoding("UTF-8");
			String subject = request.getParameter("subject");
			String price = request.getParameter("price");
			String content = request.getParameter("content");
			String poster = request.getParameter("poster");
			ps.setString(1, subject);
			ps.setString(2, price);
			ps.setString(3, content);
			ps.setString(4, poster);
			
			int result = ps.executeUpdate();
			if(result > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				
				if(rs.next()) {
					idx = rs.getInt(1);
				}
				rs.close();
			}
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return idx;
	}
	
	/** View */
	public Board view(int idx) {
		Board board =null;
		String sql = "select * from board where idx = ?";
		try(Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, idx);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				board = new Board(rs);
			}
			rs.close();
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public ArrayList<Board> getList() {
		return getList(1, 10);
	}
	
	/** 게시글 보기 */  
	public ArrayList<Board> getList(int page, int limit) {
		ArrayList<Board> list = new ArrayList<>();
		
		page = (page == 0)?1:page;
		limit = (limit == 0)?10:limit;
		
		int offset = (page - 1) * limit; // 시작 지점 
		
		String sql = "select * from board order by idx desc limit ?, ?";
		try(Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, offset);
			ps.setInt(2, limit);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs));
			}
			rs.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/** 게시글 부여 */
	public int getNext() {
		String sql = "select idx from board order by idx desc";
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
			return -1;
		}
	
	/** Delete */
	public boolean delete(int idx) {
		
		String sql = "delete from board where idx = ?";
		try (Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, idx);
			
			int rs = ps.executeUpdate();
			if (rs > 0) 
				return true;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}	
		return false;
	}
	
	/** Edit 
	 * @throws Exception */
	public boolean edit(HttpServletRequest request) {
		
		if (request == null)
			return false;
		
		String sql = "UPDATE board SET poster = ?, price = ?, subject = ?,  content = ? WHERE idx = ?";
		try (Connection conn = DB.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			request.setCharacterEncoding("UTF-8");
			int idx = Integer.parseInt(request.getParameter("idx"));
			pstmt.setString(1, request.getParameter("poster"));
			pstmt.setString(2, request.getParameter("price"));
			pstmt.setString(3, request.getParameter("subject"));
			pstmt.setString(4, request.getParameter("content"));
			pstmt.setInt(5, idx);
			
			int rs = pstmt.executeUpdate(); // rs 1 이상 -> 반영 성공
			if (rs > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	/** 게시글 조회 */
	public Board get(int idx) {
		Board board = null;
		String sql = "select * from board where idx = ?";
		try (Connection con = DB.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, idx);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				board = new Board(rs);
			}
			rs.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return board;
	}
	
	/** 전체 페이지수 */
	public int getTotal() {
		int total = 0;
		String sql = "select count(*) cnt from board";
		try (Connection con = DB.getConnection(); 
			PreparedStatement ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				total = rs.getInt("cnt");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	/** 게시글 작성시 유효성 검사 */
	public void checkData(HttpServletRequest request) throws Exception {
		String[] required = {
				"subject//제목을 입력하세요",
				"price//가격을 적어주세요",
				"content//내용을 입력하세요",
				"poster//작성자를 입력하세요",
		};
		for (String s : required) {
			String[] param = s.split("//");
			String value = request.getParameter(param[0]);
			if (value == null || value.trim().equals("")) {
				throw new Exception(param[1]);
			}
		}
	}
}