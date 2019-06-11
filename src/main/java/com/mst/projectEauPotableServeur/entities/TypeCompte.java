package com.mst.projectEauPotableServeur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class TypeCompte {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String role;

	@Transient
	@OneToMany(mappedBy="typeCompte")
	private List<Compte> comptes;
	
	public TypeCompte() {
		super();
	}
	public TypeCompte(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
