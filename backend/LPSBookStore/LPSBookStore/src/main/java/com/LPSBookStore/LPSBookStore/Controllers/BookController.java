package com.LPSBookStore.LPSBookStore.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Repositories.BookRepository;

@RestController
@RequestMapping(value="/Book")
public class BookController {
	@Autowired
	private BookRepository bookRepository; 
}
