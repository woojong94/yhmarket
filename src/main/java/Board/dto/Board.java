package Board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Board {
	private int idx;
	private String price;
	private String subject;
	private String content;
	private String poster;
	private String regDt;
	
	
	public Board() {}
	
	/** 출력처리 */
	public Board(ResultSet rs) throws SQLException {
		if(rs != null) {
			idx = rs.getInt("idx");
			price = rs.getString("price");
			subject = rs.getString("subject");
			content = rs.getString("content");
			poster = rs.getString("poster");
			Timestamp time = rs.getTimestamp("regDt");
			SimpleDateFormat sd = new SimpleDateFormat("yy.MM.dd HH:mm");
			regDt = sd.format(time);
		}
	}

	public Board(int idx, String price, String subject, String content, String poster, String regDt) {
		this.idx = idx;
		this.price = price;
		this.subject = subject;
		this.content = content;
		this.poster = poster;
		this.regDt = regDt;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

}
