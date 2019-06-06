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

import com.mst.projectEauPotableServeur.Service.ConsomationService;
import com.mst.projectEauPotableServeur.entities.Client;
import com.mst.projectEauPotableServeur.entities.Consomation;

@RestController
@RequestMapping("/api/consomations")
@CrossOrigin
public class ConsomationController {
	@Autowired
	private ConsomationService consomationService;

	@GetMapping
	public List<Consomation> getConsomations(){
    	return consomationService.findAll();
    	
    }
	
	@PostMapping 
	public void addConsomation(@RequestBody Consomation consomation) { 
		consomationService.create(consomation);
	}
	
    @PutMapping
    public void updateConsomation(@RequestBody Consomation consomation) {
    	consomationService.update(consomation);
    }
    
    @DeleteMapping("/{id}")
    public void deleteConsomation(@PathVariable int id) {
    	consomationService.delete(consomationService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Consomation findById(@PathVariable int id) {
    	return consomationService.findById(id);
    }
}
