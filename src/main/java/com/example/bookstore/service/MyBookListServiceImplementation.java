package com.example.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entity.MyBookList;
import com.example.bookstore.repository.MyBookListRepository;

@Service
public class MyBookListServiceImplementation implements MyBookListService{
@Autowired	
MyBookListRepository mybookrepo;

@Override
public void saveMyBook(MyBookList book) {
	mybookrepo.save(book);
	
  }

@Override
public List<MyBookList> getAllMyBooks() {
	return mybookrepo.findAll();
}

@Override
public void deleteById(int id) {
	mybookrepo.deleteById(id);
	
}

}
