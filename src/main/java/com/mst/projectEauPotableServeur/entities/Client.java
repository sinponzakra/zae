package com.mst.projectEauPotableServeur.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Client extends Personne{

	@Transient
	@OneToMany(mappedBy="client")
	private List<Contrat> contacts;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String cin, String nom, String prenom, Date dateNaissance, String lieuNaissance, String email,
			String adresse, String telephone) {
		super(id, cin, nom, prenom, dateNaissance, lieuNaissance, email, adresse, telephone);
		// TODO Auto-generated constructor stub
	}
	
	

}
