package com.easy.model;

public class Book {
	private int id ;		    //ͼ��id
	private String bookname;	//����
	private String author;		//����
	private String press;		//������
	private String presdate;    //����ʱ��
	public Book() {
		super();
	}
	
	@Override
	public String toString() {
		return  id + ", bookname=" + bookname + ", author=" + author + ", press=" + press + ", presdate="
				+ presdate;
	}

	public Book(int id, String bookname, String author, String press,
			String presdate) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.presdate = presdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPresdate() {
		return presdate;
	}
	public void setPresdate(String presdate) {
		this.presdate = presdate;
	}
}
