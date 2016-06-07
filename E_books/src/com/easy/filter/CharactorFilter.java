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
				//�����ַ�������
				request.setCharacterEncoding(tagChar);
				//������Ӧ���ַ�������
				response.setContentType("text/html;charset=" + tagChar);
				chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
				//��ȡ��ʼ������(web.xml�е�filter��ǩ��<init-param>
				//��<param-name>char</param-name>ֵ)
				tagChar = fConfig.getInitParameter("char");	
		
	}

}
