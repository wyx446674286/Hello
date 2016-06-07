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
@SessionAttributes({"time"})//将key为time的的数据放在session中;
public class SpringmvcController {
	public static final String  SUCCESS = "success";
  	
//RequestMapping不仅可以修饰方法，还可以修饰类；
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
	public String add(Book book,Map<String, Object> map){//add方法之后调用selectAll（）方法;
		//通过依赖关系接到参数; 实体类的名字和参数的名字是一一对应的（文本框里的name=""）;
		System.out.println(book);
		return sellectAll(map);
	}
	@RequestMapping("/a")
	public String a(@RequestParam("id") int id,@RequestParam("name") String name){//传参
		System.out.println(id + ".." + name);
		return SUCCESS;
	}
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)//使用post方法
	public String method(){
		return SUCCESS;
	}
	@RequestMapping("/testRedirect")//重定向
	public String testRedirect(){
		System.out.println("testRedirect");
		return "redirect:/index.jsp";
	}
	@RequestMapping("/select")
	public String sellectAll(Map<String, Object> map){
		//将查询到的数据添加进map集合中，底层就会将map里的数据添加到request
		//前提是map集合必须定义在参数列表中，否则无效;
		map.put("time", new Date());
		//request.setAttribute("time", new Date());
		return SUCCESS;
	}
}
