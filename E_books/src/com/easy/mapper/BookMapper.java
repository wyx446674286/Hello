package com.easy.mapper;

import java.util.List;

import com.easy.model.Book;

public interface BookMapper {

	public abstract int add(Book book);//���ͼ����Ϣ
	public abstract int delete(int id);//ɾ��
	public abstract int update(Book book);//�޸�
	public abstract List<Book> selectAll();//ȫ��ѯ
	public abstract Book selectById(int id);//����id��ѯ
	public abstract List<Book> like(String bookname);//����ģ����ѯ
	
}
