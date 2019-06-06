package com.mst.projectEauPotableServeur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class PeriodeConsomation {
	@Id @GeneratedValue
	private int id;
	private String periode;
	@Transient
	@OneToMany(fetch=FetchType.EAGER)
	private List<Tournee> tournees;
	
	public PeriodeConsomation() {
		super();
	}
	public PeriodeConsomation(int id, String periode) {
		super();
		this.id = id;
		this.periode = periode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPeriode() {
		return periode;
	}
	public void setPeriode(String periode) {
		this.periode = periode;
	}
	public List<Tournee> getTournees() {
		return tournees;
	}
	public void setTournees(List<Tournee> tournees) {
		this.tournees = tournees;
	}
	
	
}
