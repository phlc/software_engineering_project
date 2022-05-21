package com.LPSBookStore.LPSBookStore.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;
import com.LPSBookStore.LPSBookStore.Repositories.FavoriteBooksRepository;

@RestController
@RequestMapping(value="/FavoriteBooks")
public class FavoriteBooksController {
	
	@Autowired
	private FavoriteBooksRepository FavoriteBooksRepository; 
	
	
/*	// Update and Create
	@PostMapping(value="/Provide") 
	public String createUser(@RequestBody FavoriteBooks FavoriteBooks) throws Exception {
		try {
			FavoriteBooksRepository.save(FavoriteBooks);			
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";		
	}
	
	@PostMapping(value="/Delete")
	public String delete(@RequestBody Map<String, String> id) throws Exception {
		try {
			FavoriteBooksRepository.deleteById(Integer.parseInt(id.get("id")));
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";			
	}*/
	
}
