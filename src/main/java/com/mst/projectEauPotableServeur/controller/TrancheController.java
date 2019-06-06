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

import com.mst.projectEauPotableServeur.Service.TrancheService;
import com.mst.projectEauPotableServeur.entities.Tranche;

@RestController
@RequestMapping("/api/tranches")
@CrossOrigin
public class TrancheController {
	@Autowired
	private TrancheService trancheService;

	@GetMapping
	public List<Tranche> getTranches(){
    	return trancheService.findAll();
    	
    }
	
	@PostMapping 
	public void addTranche(@RequestBody Tranche tranche) { 
		trancheService.create(tranche);
	}
	
    @PutMapping
    public void updateTranche(@RequestBody Tranche tranche) {
    	trancheService.update(tranche);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTranche(@PathVariable int id) {
    	trancheService.delete(trancheService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Tranche findById(@PathVariable int id) {
    	return trancheService.findById(id);
    }
}
