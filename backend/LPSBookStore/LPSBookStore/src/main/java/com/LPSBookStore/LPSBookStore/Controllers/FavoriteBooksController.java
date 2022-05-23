package com.LPSBookStore.LPSBookStore.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;
import com.LPSBookStore.LPSBookStore.Repositories.BookRepository;
import com.LPSBookStore.LPSBookStore.Repositories.ClientRepository;
import com.LPSBookStore.LPSBookStore.Repositories.FavoriteBooksRepository;

@RestController
@RequestMapping(value="/FavoriteBooks")
public class FavoriteBooksController {
	
	@Autowired
	private FavoriteBooksRepository favoriteBooksRepository; 
	
	@Autowired
	private ClientRepository clientRepository; 
	
	@Autowired
	private BookRepository bookRepository; 
	
	// Create
	@PostMapping(value="/Provide") 
	public String createFavorite(@RequestBody Map<String, String> request) throws Exception {
		try {
			FavoriteBooks fbks = new FavoriteBooks();
			fbks.setBook(bookRepository.getById(Integer.parseInt(request.get("book_id"))));
			fbks.setClient(clientRepository.getById(Integer.parseInt(request.get("client_id"))));
			
			favoriteBooksRepository.save(fbks);			
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";		
	}
	
	// Retorna livros favoritos de um usuário
	@PostMapping(value="/GetFavoritesByUser") 
	public List<FavoriteBooks> getFavoritesByUser(@RequestBody Map<String, String> request) throws Exception {
		System.out.println("ID " + Integer.parseInt(request.get("client_id")));
		return favoriteBooksRepository.getFavoritesByUser(Integer.parseInt(request.get("client_id")));			
	}
		
	
}
