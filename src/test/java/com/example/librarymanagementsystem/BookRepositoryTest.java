package com.example.librarymanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.service.BookService;

@SpringBootTest
@Transactional
@ExtendWith(SpringExtension.class)
public class BookRepositoryTest {
//
//	@Autowired
//	BookService bookService;
//	
//	@Test
//	public void GivenCreateBookThenExpectSameBook() {
//		Book book = Book.builder()
//				.name("Book 1")
//				.description("This is book 1")
//				.price(12.99)
//				.build();
//		
//		Book actual = bookService.createBook(book);
//		
//		assertEquals("book5", actual.getName());
//		assertEquals(book.getPrice(), actual.getPrice());
//		assertEquals(book.getDescription(), actual.getDescription());
//	}
	
}
