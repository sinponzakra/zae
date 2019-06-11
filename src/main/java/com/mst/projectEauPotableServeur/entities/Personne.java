package com.mst.projectEauPotableServeur.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne {
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	protected int id;
	protected String cin;
	protected String nom;
	protected String prenom;
	@Temporal(TemporalType.DATE)
	protected Date dateNaissance;
	protected String lieuNaissance;
	protected String email;
	protected String adresse;
	protected String telephone;
	
	
	public Personne() {
		super();
	}


	public Personne(int id, String cin, String nom, String prenom, Date dateNaissance, String lieuNaissance,
			String email, String adresse, String telephone) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getLieuNaissance() {
		return lieuNaissance;
	}


	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
