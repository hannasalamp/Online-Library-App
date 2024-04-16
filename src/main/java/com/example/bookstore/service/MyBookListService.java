package com.example.bookstore.service;

import java.util.List;

import com.example.bookstore.entity.MyBookList;

public interface MyBookListService {
	public void saveMyBook(MyBookList book);

	public List<MyBookList> getAllMyBooks();

	public void deleteById(int id);
}
