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

import com.mst.projectEauPotableServeur.Service.FactureService;
import com.mst.projectEauPotableServeur.entities.Facture;

@RestController
@RequestMapping("/api/factures")
@CrossOrigin
public class FactureController {
	@Autowired
	private FactureService factureService;

	@GetMapping
	public List<Facture> getFactures(){
    	return factureService.findAll();
    	
    }
	
	@PostMapping 
	public void addFacture(@RequestBody Facture facture) { 
		factureService.create(facture);
	}
	
    @PutMapping
    public void updateFacture(@RequestBody Facture facture) {
    	factureService.update(facture);
    }
    
    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable int id) {
    	factureService.delete(factureService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Facture findById(@PathVariable int id) {
    	return factureService.findById(id);
    }
}
