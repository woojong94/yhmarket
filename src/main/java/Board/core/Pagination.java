package Board.core;

import javax.servlet.http.HttpServletRequest;

public class Pagination {
	
	private int num; // 현재 페이지 구간 번호
	private int page; // 현재 페이지 번호
	private int lastNum; // 마지막 페이지 구간번호
	private int lastPageNo; // 마지막 페이지 번호
	private int startNo; // 구간 시작 번호
	private int lastNo; // 구간 종료 번호
	private int prevNo; // 이전 시작 번호
	private int nextNo; // 다음 시작 번호
	
	public Pagination(int page, int total, int pageLinks, int limit) {
		page = (page <= 0)?1:page;
		pageLinks = (pageLinks <= 0)?10:pageLinks;
		limit = (limit <= 0)?10:limit;
		
		this.page = page;
		
		num = (int)Math.floor((page - 1) / pageLinks);
		startNo = num * pageLinks + 1; 
		lastNo =  startNo + pageLinks - 1;
		
		lastPageNo =  (int)Math.ceil(total / (double)limit);
		lastNum = (int)Math.floor((lastPageNo - 1) / pageLinks);
		 
		// 마지막 페이지 구간 끝나는 페이지는 = 마지막 페이지 번호
		if (lastNo > lastPageNo) { 
			lastNo = lastPageNo;
		}
		
		/** 다음 시작 페이지 번호, 이전 시작 페이지 번호 */
		if (num > 0) {
			prevNo = (num - 1) * pageLinks + 1;
		}
		
		if (num < lastNum) {
			nextNo = (num + 1) * pageLinks + 1;
		}
	}
	
	/** 10개 */
	public Pagination(HttpServletRequest request, int total) {
		this(
			request.getParameter("page"),
			total,
			10,
			10
		);
	}
	
	/** 페이지링크, 제한 */
	public Pagination(String page, int total, int pageLinks, int limit) {
		this(
			(page == null)?1:Integer.parseInt(page),
			total,
			pageLinks,
			limit
		);
	}
	
	/** 링크 출력부분 */
	public String getPageHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<ul class='pagination'>");
		
		// 첫 페이지, 이전 페이지 
		if (num > 0) {
			sb.append("<li class='page first'><a href='?page=1'>First</a></li>");
			
			sb.append("<li class='page prev'><a href='?page=");
			sb.append(prevNo);
			sb.append("'>Prev</a></li>");
		}
		
		for (int i = startNo; i <= lastNo; i++) {
			sb.append("<li class='page");
			if (i == page) {
				sb.append(" on");
			}
			sb.append("'>");
			sb.append("<a href='?page=");
			sb.append(i);
			sb.append("'>");
			sb.append(i);
			sb.append("</a>");
			sb.append("</li>");
		}
		
		// 다음페이지 이동, 마지막 페이지 이동
		if (num < lastNum) {
			
			sb.append("<li class='page next'><a href='?page=");
			sb.append(nextNo);
			sb.append("'>Next</a></li>");
			
			sb.append("<li class='page last'><a href='?page=");
			sb.append(lastPageNo);
			sb.append("'>Last</a></li>");
		}
		
		sb.append("</ul>");
		
		return sb.toString();
	}
}



