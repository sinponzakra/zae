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

import com.mst.projectEauPotableServeur.Service.typeCompteService;
import com.mst.projectEauPotableServeur.entities.TypeCompte;



@RestController
@RequestMapping("/api/typeComptes")
@CrossOrigin
public class typeCompteController {
	@Autowired
	private typeCompteService typeCompteService;

	@GetMapping
	public List<TypeCompte> getTypeComptes(){
    	return typeCompteService.findAll();
    	
    }
	
	@PostMapping 
	public void addTypeCompte(@RequestBody TypeCompte typeCompte) { 
//		TypeCompte typeCompte = new TypeCompte();
//		typeCompte.setRole(role);
		typeCompteService.create(typeCompte);

	}
    @PutMapping
    public void updateProduit(@RequestBody TypeCompte typeCompte) {
    	typeCompteService.update(typeCompte);
    }
    
    @DeleteMapping("/{id}")
    public void deleteSevice(@PathVariable int id) {
    	
    	typeCompteService.delete(typeCompteService.findById(id));
    }
    
    @GetMapping("/{id}")
    public TypeCompte findById(@PathVariable int id) {
    	return typeCompteService.findById(id);
    }
}
