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

import com.mst.projectEauPotableServeur.Service.TourneeService;
import com.mst.projectEauPotableServeur.entities.Tournee;

@RestController
@RequestMapping("/api/tournees")
@CrossOrigin
public class TourneeController {
	@Autowired
	private TourneeService tourneeService;

	@GetMapping
	public List<Tournee> getTournees(){
    	return tourneeService.findAll();
    	
    }
	
	@PostMapping 
	public void addTournee(@RequestBody Tournee tournee) { 
		tourneeService.create(tournee);
	}
	
    @PutMapping
    public void updateTournee(@RequestBody Tournee tournee) {
    	tourneeService.update(tournee);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTournee(@PathVariable int id) {
    	tourneeService.delete(tourneeService.findById(id));
    }
    
    @GetMapping("/{id}")
    public Tournee findById(@PathVariable int id) {
    	return tourneeService.findById(id);
    }
}
