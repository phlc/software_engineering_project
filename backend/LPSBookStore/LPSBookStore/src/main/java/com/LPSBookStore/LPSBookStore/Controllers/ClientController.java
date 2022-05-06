package com.LPSBookStore.LPSBookStore.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LPSBookStore.LPSBookStore.Entities.Client;
import com.LPSBookStore.LPSBookStore.Repositories.ClientRepository;

@RestController
@RequestMapping(value="/Client")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository; 
	
	@GetMapping(value="/Login")
	public Client login(@RequestBody Map<String, String> login) throws Exception {
		Client client = clientRepository.findClientByLogin(login.get("email"), login.get("password"));			
		return client;		
	}
	
	// Update and Create
	@PostMapping(value="/Provide") 
	public String createUser(@RequestBody Client client) throws Exception {
		try {
			clientRepository.save(client);			
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";		
	}
	
	@PostMapping(value="/Delete")
	public String delete(@RequestBody Map<String, String> id) throws Exception {
		try {
			clientRepository.deleteById(Integer.parseInt(id.get("id")));
		} catch(Exception e) {
			return e.getMessage();
		}
		return "SUCCESS";			
	}
	
	
}