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

import com.mst.projectEauPotableServeur.Service.CompteService;
import com.mst.projectEauPotableServeur.entities.Client;
import com.mst.projectEauPotableServeur.entities.Compte;

@RestController
@RequestMapping("/api/comptes")
@CrossOrigin
public class CompteController {
	@Autowired
	private CompteService compteService;

	@GetMapping
	public List<Compte> getComptes(){
    	return compteService.findAll();
    	
    }
	
	@PostMapping 
	public void addCompte(@RequestBody Compte compte) { 
		compteService.create(compte);
	}
	
    @PutMapping
    public void updateCompte(@RequestBody Compte compte) {
    	compteService.update(compte);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCompte(@PathVariable int id) {
    	compteService.delete(compteService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Compte findById(@PathVariable int id) {
    	return compteService.findById(id);
    }
}
