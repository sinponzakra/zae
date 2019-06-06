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

import com.mst.projectEauPotableServeur.Service.RecuPaimentService;
import com.mst.projectEauPotableServeur.entities.RecuPaiment;

@RestController
@RequestMapping("/api/recuPaiments")
@CrossOrigin
public class RecuPaimentController {
	@Autowired
	private RecuPaimentService recuPaimentService;

	@GetMapping
	public List<RecuPaiment> getRecuPaiments(){
    	return recuPaimentService.findAll();
    	
    }
	
	@PostMapping 
	public void addRecuPaiment(@RequestBody RecuPaiment recuPaiment) { 
		recuPaimentService.create(recuPaiment);
	}
	
    @PutMapping
    public void updateRecuPaiment(@RequestBody RecuPaiment recuPaiment) {
    	recuPaimentService.update(recuPaiment);
    }
    
    @DeleteMapping("/{id}")
    public void deleteRecuPaiment(@PathVariable int id) {
    	recuPaimentService.delete(recuPaimentService.findById(id));
    }
    
    @GetMapping("/{id}")
    public RecuPaiment findById(@PathVariable int id) {
    	return recuPaimentService.findById(id);
    }
}
