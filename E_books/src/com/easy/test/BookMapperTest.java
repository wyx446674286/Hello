package com.easy.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.mapper.BookMapper;
import com.easy.model.Book;

public class BookMapperTest {
			private ApplicationContext applicationContext;
	@Before															//每个方法执行前的操作;
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testAdd() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		Book book = new Book();
		book.setBookname("五个人");
		book.setAuthor("阿加莎");
		book.setPress("大连出版社");
		book.setPresdate("1994-2-2");
		bookMapper.add(book);
		System.out.println(book);
	}

	@Test
	public void testDelete() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		int id = 8;
		bookMapper.delete(id);
		System.out.println("删除成功");
	}

	@Test
	public void testUpdate() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		Book book = new Book();
		book = bookMapper.selectById(2);
		book.setBookname("三口棺材");
		bookMapper.update(book);
		System.out.println(book);
	}

	@Test
	public void testSelectAll() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		List<Book> list = new ArrayList<Book>();
		list = bookMapper.selectAll();
		System.out.println(list);
	}

	@Test
	public void testSelectById() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		Book book = new Book();
		int id = 1;
		book = bookMapper.selectById(id);
		System.out.println(book);
	}

	@Test
	public void testLike() {
		BookMapper bookMapper = (BookMapper) applicationContext.getBean("bookMapper");
		List<Book> list = new ArrayList<Book>();
		String bookname = '%' + "五个人" +'%';
		list = bookMapper.like(bookname);
		System.out.println(list);
	}

}
