package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Book;
@Component	//自动装配
public interface BookService {

	public abstract int add(Book book);//添加图书信息
	public abstract int delete(int id);//删除
	public abstract int update(Book book);//修改
	public abstract List<Book> selectAll();//全查询
	public abstract Book selectById(int id);//按照id查询
	public abstract List<Book> like(String bookname);//书名模糊查询
}
