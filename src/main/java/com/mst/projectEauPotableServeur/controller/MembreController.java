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

import com.mst.projectEauPotableServeur.Service.MembreService;
import com.mst.projectEauPotableServeur.entities.Client;
import com.mst.projectEauPotableServeur.entities.Membre;

@RestController
@RequestMapping("/api/membres")
@CrossOrigin
public class MembreController {
	@Autowired
	private MembreService membreService;

	@GetMapping
	public List<Membre> getmembres(){
    	return membreService.findAll();
    	
    }
	
	@PostMapping 
	public void addmembre(@RequestBody Membre membre) { 
		membreService.create(membre);
	}
	
    @PutMapping
    public void updatemembre(@RequestBody Membre membre) {
    	membreService.update(membre);
    }
    
    @DeleteMapping("/{id}")
    public void deletemembre(@PathVariable int id) {
    	membreService.delete(membreService.findById(id));
    }
    
    @GetMapping(value="/{id}")
    public Membre findById(@PathVariable int id) {
    	return membreService.findById(id);
    }
    
    @RequestMapping("/login/{lg}")
    public Membre findByLogin(@PathVariable String lg) {
    	return membreService.findByLogin(lg);
    }
}
