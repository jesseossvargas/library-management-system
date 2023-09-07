package com.example.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.example.librarymanagementsystem.entity.Book;

public interface BookService {

	List<Book> findAllBooks();
	
	Book createBook(Book book);
	
	void deleteBook(Long id);
	
	Optional<Book> findBookById(Long id);
	
	void updateBook(Book book);
}
