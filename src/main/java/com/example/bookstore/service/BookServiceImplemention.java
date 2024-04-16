package com.example.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepository;
@Service
public class BookServiceImplemention implements BookService{
	
	@Autowired
	private BookRepository bRepo;

	@Override
	public void save(Book b) {
		bRepo.save(b);
		
	}

	@Override
	public List<Book> getAllBook() {
		return bRepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
	
		return bRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		bRepo.deleteById(id);
		
	}
	

		
	

	
}
