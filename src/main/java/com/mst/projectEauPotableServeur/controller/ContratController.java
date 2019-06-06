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

import com.mst.projectEauPotableServeur.Service.ContratService;
import com.mst.projectEauPotableServeur.entities.Client;
import com.mst.projectEauPotableServeur.entities.Contrat;

@RestController
@RequestMapping("/api/contrats")
@CrossOrigin
public class ContratController {
	@Autowired
	private ContratService contratService;

	@GetMapping
	public List<Contrat> getContrats(){
    	return contratService.findAll();
    	
    }
	
	@PostMapping 
	public void addContrat(@RequestBody Contrat contrat) { 
		contratService.create(contrat);
	}
	
    @PutMapping
    public void updateContrat(@RequestBody Contrat contrat) {
    	contratService.update(contrat);
    }
    
    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable int id) {
    	contratService.delete(contratService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Contrat findById(@PathVariable int id) {
    	return contratService.findById(id);
    }
}
