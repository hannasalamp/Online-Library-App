package com.example.bookstore.service;


import java.util.List;

import com.example.bookstore.entity.Book;
public interface BookService {

	public void save(Book b);
	
	public List<Book> getAllBook();
	
	public Book getBookById(int id);

	public void deleteById(int id);

}
