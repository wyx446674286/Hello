package com.easy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easy.model.Book;
import com.easy.service.BookService;

@Controller
@RequestMapping("/bookController")
public class BookController {
	@Autowired  	//自动get set方法;
	private BookService bookService;
	
	@RequestMapping("/add")
	public String add(Book book,Map<String, Object> map){
		/*接值;
		 * 1.想用bookService的引用，需要在bookService接口上添加注解
		 * 2.定义一个成员变量private BookService bookService;
		 * 3.在成员变量上面添加@Autowired 注解：自动get，set方法
		*/
	if ( book.getBookname() != "" & book.getAuthor() != "") {
		bookService.add(book);
		return selectAll(map);
		}else {
			return  "redirect:/index.jsp";
	}
}
	@RequestMapping("/selectById")
	public String selectById(int id,Map<String, Object> map){
		Book book = new Book();
		book = bookService.selectById(id);
		map.put("booklist", book);
		return "update";
	}
	@RequestMapping("/update")
	public String update(Book book,Map<String, Object> map){
		bookService.update(book);
		return selectAll(map);
	}
	@RequestMapping("/selectAll")
	public String selectAll(Map<String, Object> map){
		List<Book> booklist = new ArrayList<Book>();
		booklist = bookService.selectAll();
		map.put("book", booklist);
		return "desc";
	}
	@RequestMapping("/delete")
	public String delete(int id,Map<String, Object> map){
		bookService.delete(id);
		return selectAll(map);
	}
	@RequestMapping("/like")
	public String like(String bookname,Map<String, Object> map){
		List<Book> booklist = new ArrayList<Book>();
		booklist = bookService.like(bookname);
		map.put("book", booklist);
		return "desc";
	}
}
