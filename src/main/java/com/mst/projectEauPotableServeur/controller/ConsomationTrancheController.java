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

import com.mst.projectEauPotableServeur.Service.ConsomationTrancheService;
import com.mst.projectEauPotableServeur.entities.ConsomationParTranche;
import com.mst.projectEauPotableServeur.entities.ConsomationParTranchePK;

@RestController
@RequestMapping("/api/consomationParTranches")
@CrossOrigin
public class ConsomationTrancheController {
	@Autowired
	private ConsomationTrancheService consomationTrancheService;

	@GetMapping
	public List<ConsomationParTranche> getConsomationParTranches(){
    	return consomationTrancheService.findAll();
    	
    }
	
	@PostMapping 
	public void addConsomationParTranche(@RequestBody ConsomationParTranche t) { 
		consomationTrancheService.create(t);
	}
	
    @PutMapping
    public void updateConsomationParTranche(@RequestBody ConsomationParTranche t) {
    	consomationTrancheService.update(t);
    }
    
    @DeleteMapping("/{id}")
    public void deleteConsomationParTranche(@PathVariable int id) {
    	consomationTrancheService.delete(consomationTrancheService.findById(id));
    }
    
    @GetMapping("/{id}")
    public ConsomationParTranche findById(@PathVariable int id) {
    	return consomationTrancheService.findById(id);
    }
}
