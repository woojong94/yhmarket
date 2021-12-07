package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import Board.core.DB;

/** 필터 설정 */
public class MainFilter implements Filter{
	private FilterConfig filterConfig;
	private String[] staticDirs ={"deco"};
	
	/** 초기화 */
	@Override
	public void init(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
		DB.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	String url = request.getServletContext().getContextPath();
	request.setAttribute("url", url);
	
		header(request, response);
		
		chain.doFilter(request, response);
		
		footer(request, response);
	}
	
	/** Header */
	public void header(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if(isNeed(request)) {
		response.setContentType("text/html; charset=utf-8");
		RequestDispatcher rd = request.getRequestDispatcher("/outline/header.jsp");
		rd.include(request, response);
		}
	}
	
	/** Footer */
	public void footer(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if(isNeed(request)) {
		RequestDispatcher rd = request.getRequestDispatcher("/outline/footer.jsp");
		rd.include(request, response);
		}
	}
	
	/** Header, Footer 필요 체크 */
	public boolean isNeed(ServletRequest request) {
		if(request instanceof HttpServletRequest) {
			HttpServletRequest re = (HttpServletRequest)request;
			String method = re.getMethod().toUpperCase();
			if(!method.equals("GET")) return false;
			
			String URI = re.getRequestURI();
			for(String dir : staticDirs) {
	            if (URI.indexOf("/" + dir) != -1) {
	               return false;
	            }
	         }   
		}
		return true;
	}
}
			


