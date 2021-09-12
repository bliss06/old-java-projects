package com.deepak.udm.basics.springbootws;

public class Book {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	Long id;
	String author;
	String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + "]";
	}
	public Book(Long id, String author, String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
	}
	
}
