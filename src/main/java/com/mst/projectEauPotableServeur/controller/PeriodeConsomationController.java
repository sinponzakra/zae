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

import com.mst.projectEauPotableServeur.Service.PeriodeConsomationService;
import com.mst.projectEauPotableServeur.entities.PeriodeConsomation;

@RestController
@RequestMapping("/api/periodeConsomations")
@CrossOrigin
public class PeriodeConsomationController {
	@Autowired
	private PeriodeConsomationService periodeConsomationService;

	@GetMapping
	public List<PeriodeConsomation> getPeriodeConsomations(){
    	return periodeConsomationService.findAll();
    	
    }
	
	@PostMapping 
	public void addPeriodeConsomation(@RequestBody PeriodeConsomation periodeConsomation) { 
		periodeConsomationService.create(periodeConsomation);
	}
	
    @PutMapping
    public void updatePeriodeConsomation(@RequestBody PeriodeConsomation periodeConsomation) {
    	periodeConsomationService.update(periodeConsomation);
    }
    
    @DeleteMapping("/{id}")
    public void deletePeriodeConsomation(@PathVariable int id) {
    	periodeConsomationService.delete(periodeConsomationService.findById(id));
    }
    
    @GetMapping("/{id}")
    public PeriodeConsomation findById(@PathVariable int id) {
    	return periodeConsomationService.findById(id);
    }
}
