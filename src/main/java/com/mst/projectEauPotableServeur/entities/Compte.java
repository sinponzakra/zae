package com.mst.projectEauPotableServeur.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Compte {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	@OneToOne(fetch = FetchType.EAGER)
	private Membre membre;
	@ManyToOne(fetch = FetchType.EAGER)
	private TypeCompte typeCompte;
	
	public Compte() {
		super();
	}
	public Compte(int id, String login, String password, Membre membre, TypeCompte typeCompte) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.membre = membre;
		this.typeCompte = typeCompte;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	
}
