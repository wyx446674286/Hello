package com.easy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharactorFilter implements Filter{
	private String tagChar = "UTF-8";
	
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
				//设置字符集编码
				request.setCharacterEncoding(tagChar);
				//设置响应的字符集编码
				response.setContentType("text/html;charset=" + tagChar);
				chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
				//获取初始化参数(web.xml中的filter标签中<init-param>
				//的<param-name>char</param-name>值)
				tagChar = fConfig.getInitParameter("char");	
		
	}

}
