package com.example.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = bookService.findAllBooks();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Long> addNewBook(@RequestBody Book book) {
		Book insertedBook = bookService.createBook(book);
		
		if(insertedBook == null) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Long> updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Long> deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
