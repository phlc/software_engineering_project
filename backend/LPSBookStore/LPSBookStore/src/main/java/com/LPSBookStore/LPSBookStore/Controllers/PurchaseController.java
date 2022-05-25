package com.LPSBookStore.LPSBookStore.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Entities.FavoriteBooks;
import com.LPSBookStore.LPSBookStore.Entities.Purchase;
import com.LPSBookStore.LPSBookStore.Entities.PurchaseBook;
import com.LPSBookStore.LPSBookStore.Repositories.BookRepository;
import com.LPSBookStore.LPSBookStore.Repositories.ClientRepository;
import com.LPSBookStore.LPSBookStore.Repositories.FavoriteBooksRepository;
import com.LPSBookStore.LPSBookStore.Repositories.PurchaseBookRepository;
import com.LPSBookStore.LPSBookStore.Repositories.PurchaseRepository;

@RestController
@RequestMapping(value="/Purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseRepository purchaseRepository; 
	
	@Autowired
	private ClientRepository clientRepository; 
	
	@Autowired
	private BookRepository bookRepository; 
	
	@Autowired
	private PurchaseBookRepository purchaseBookRepository; 
	
	// Create
	@PostMapping(value="/Provide") 
	public String createPurchase(@RequestBody Map<String, String> request) throws Exception {
		try {
			Purchase purchase = new Purchase();
			
			purchase.setClient(clientRepository.getById(Integer.parseInt(request.get("client_id"))));
			purchase.setStatus(0);
			purchase.setDate(new Date());
			
			purchase = purchaseRepository.save(purchase);
			String idsString = request.get("books_id").replace("[", "");
			idsString = idsString.replace("]", "");
			String[] booksIds = idsString.split(", ");

			for(String id : booksIds) {
				PurchaseBook purchaseBook = new PurchaseBook();
				purchaseBook.setPurchase(purchase);
				purchaseBook.setBook(bookRepository.getById(Integer.parseInt(id)));
				
				purchaseBookRepository.save(purchaseBook);
			}
			
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";		
	}
	
	// GetClientPurchase
	@PostMapping(value="/GetClientPurchase") 
	public List<PurchaseBook> getClientPurchase(@RequestBody Map<String, String> request) throws Exception {
		return purchaseBookRepository.getClientPurchase(Integer.parseInt(request.get("user_id")));
	}
		
}
