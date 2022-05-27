package com.LPSBookStore.LPSBookStore.Controllers;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Entities.Book;
import com.LPSBookStore.LPSBookStore.Repositories.BookRepository;

@RestController
@RequestMapping(value="/Book")
public class BookController {
	@Autowired
	private BookRepository bookRepository; 
	
	@PostMapping(value="/GetByTitle")
	public List<Book> getByTitle(@RequestBody Map<String, String> request) throws Exception {
		return bookRepository.getByTitle(request.get("title"));					
	}
	
	@PostMapping(value="/GetByCategory")
	public List<Book> getByCategory(@RequestBody Map<String, String> request) throws Exception {
		return bookRepository.getByCategory(request.get("category"));					
	}
	
	@PostMapping(value="/GetByAuthor")
	public List<Book> getByAuthor(@RequestBody Map<String, String> request) throws Exception {
		return bookRepository.getByAuthor(request.get("author"));					
	}
	
	@GetMapping(value="/GetAll")
	public List<Book> getAllBooks() throws Exception {
		return bookRepository.findAll();					
	}
	
	public void createBook(@RequestBody Book request) throws Exception {
		bookRepository.save(request);			
	}
	
	 @PostConstruct
	 public void init() throws ParseException {
		 bookRepository.saveAll(Book.getInitBooks());
	 }	
	
}
