package com.mst.projectEauPotableServeur.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Membre extends Personne{
	private String matricule;
	@Temporal(TemporalType.DATE)
	private Date dateAdhesion;
	@OneToOne(fetch = FetchType.EAGER)
	private Compte compte;
	@Transient
	@OneToMany(mappedBy="membre")
	private List<Tournee> tournees;
	
	public Membre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Membre(int id, String cin, String nom, String prenom, Date dateNaissance, String lieuNaissance, String email,
			String adresse, String telephone, String matricule, Date dateAdhesion, Compte compte) {
		super(id, cin, nom, prenom, dateNaissance, lieuNaissance, email, adresse, telephone);
		// TODO Auto-generated constructor stub
		this.matricule = matricule;
		this.dateAdhesion = dateAdhesion;
		this.compte = compte;
	}

	

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public List<Tournee> getTournees() {
		return tournees;
	}

	public void setTournees(List<Tournee> tournees) {
		this.tournees = tournees;
	}
	

}
