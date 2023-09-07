package com.example.librarymanagementsystem;


import jakarta.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.repository.BookRepository;
import com.example.librarymanagementsystem.service.BookService;

@SpringBootTest
@Transactional
@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
//	
//	@Autowired
//	BookService bookService;
//	
//	@MockBean
//	BookRepository bookRepository;
//	
//	@Test
//	public void addBookExpectCreated() {
//		Book book = Book.builder()
//				.name("Book 1")
//				.description("This is book 1")
//				.price(12.99)
//				.build();
//		
//		bookService.createBook(book);
//		
//		Mockito.verify(bookRepository, Mockito.times(1)).save(book);
//	}
//	
}
