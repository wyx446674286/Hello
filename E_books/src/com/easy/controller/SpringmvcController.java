package com.easy.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.easy.model.Book;

@Controller
@RequestMapping("/springmvc")
@SessionAttributes({"time"})//��keyΪtime�ĵ����ݷ���session��;
public class SpringmvcController {
	public static final String  SUCCESS = "success";
  	
//RequestMapping�����������η����������������ࣻ
	@RequestMapping("/adds")
	public String add(HttpServletRequest request,HttpServletResponse response){
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		String presdate = request.getParameter("presdate");
		Book book = new Book(1,bookname,author,press,presdate);
		System.out.println(book);
		return SUCCESS;
	}
	@RequestMapping("/add")
	public String add(Book book,Map<String, Object> map){//add����֮�����selectAll��������;
		//ͨ��������ϵ�ӵ�����; ʵ��������ֺͲ�����������һһ��Ӧ�ģ��ı������name=""��;
		System.out.println(book);
		return sellectAll(map);
	}
	@RequestMapping("/a")
	public String a(@RequestParam("id") int id,@RequestParam("name") String name){//����
		System.out.println(id + ".." + name);
		return SUCCESS;
	}
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)//ʹ��post����
	public String method(){
		return SUCCESS;
	}
	@RequestMapping("/testRedirect")//�ض���
	public String testRedirect(){
		System.out.println("testRedirect");
		return "redirect:/index.jsp";
	}
	@RequestMapping("/select")
	public String sellectAll(Map<String, Object> map){
		//����ѯ����������ӽ�map�����У��ײ�ͻὫmap���������ӵ�request
		//ǰ����map���ϱ��붨���ڲ����б��У�������Ч;
		map.put("time", new Date());
		//request.setAttribute("time", new Date());
		return SUCCESS;
	}
}
