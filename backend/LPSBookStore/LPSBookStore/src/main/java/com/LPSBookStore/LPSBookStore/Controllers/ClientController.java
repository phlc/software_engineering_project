package com.LPSBookStore.LPSBookStore.Controllers;

import java.util.Map;
import java.util.List;

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
	
	@PostMapping(value="/Login")
	public Client login(@RequestBody Map<String, String> login) throws Exception {
		return clientRepository.findClientByLogin(login.get("email"), login.get("password"));				
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
	
	@GetMapping(value="/GetAll")
    public List<Client> getAllClient() throws Exception {
        return clientRepository.findAll();
    }
	
}
