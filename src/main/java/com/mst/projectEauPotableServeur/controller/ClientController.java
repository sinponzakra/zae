package com.mst.projectEauPotableServeur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mst.projectEauPotableServeur.Service.ClientService;
import com.mst.projectEauPotableServeur.entities.Client;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin
public class ClientController {
	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<Client> getClients(){
    	return clientService.findAll();
    	
    }
	
	@PostMapping 
	public void addClient(@RequestBody Client client) { 
		clientService.create(client);
	}
	
    @PutMapping
    public void updateClient(@RequestBody Client client) {
    	clientService.update(client);
    }
    
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id) {
    	clientService.delete(clientService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Client findById(@PathVariable int id) {
    	return clientService.findById(id);
    }
}
