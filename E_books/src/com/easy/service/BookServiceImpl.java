package com.easy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.BookMapper;
import com.easy.model.Book;
@Service		//�൱��BookMapper�ӿ��ϵ�@componentע��;
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookMapper bookMapper;
	
	public int add(Book book) {
			return bookMapper.add(book);	
	}

	public int delete(int id) {
		bookMapper.delete(id);
		return 0;
	}

	public int update(Book book) {
		bookMapper.update(book);
		return 0;
	}

	public List<Book> selectAll() {
		return bookMapper.selectAll();
	}

	public Book selectById(int id) {
		return bookMapper.selectById(id);
	}

	public List<Book> like(String bookname) {
		return bookMapper.like(bookname);
	}

}
