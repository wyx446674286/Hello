package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Book;
@Component	//�Զ�װ��
public interface BookService {

	public abstract int add(Book book);//���ͼ����Ϣ
	public abstract int delete(int id);//ɾ��
	public abstract int update(Book book);//�޸�
	public abstract List<Book> selectAll();//ȫ��ѯ
	public abstract Book selectById(int id);//����id��ѯ
	public abstract List<Book> like(String bookname);//����ģ����ѯ
}
