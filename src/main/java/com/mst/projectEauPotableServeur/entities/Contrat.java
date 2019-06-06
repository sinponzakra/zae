package com.mst.projectEauPotableServeur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Contrat {
	@Id @GeneratedValue
	private int id;
	private int dateContrat;
	private int refCompteur;
	@ManyToOne(fetch=FetchType.EAGER)
	private Client client;
	@Transient
	@OneToMany(mappedBy="contrat")
	private List<Consomation> consomations;
	
	
	public Contrat() {
		super();
	}
	public Contrat(int id, int dateContrat, int refCompteur, Client client) {
		super();
		this.id = id;
		this.dateContrat = dateContrat;
		this.refCompteur = refCompteur;
		this.client = client;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateContrat() {
		return dateContrat;
	}
	public void setDateContrat(int dateContrat) {
		this.dateContrat = dateContrat;
	}
	public int getRefCompteur() {
		return refCompteur;
	}
	public void setRefCompteur(int refCompteur) {
		this.refCompteur = refCompteur;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Consomation> getConsomations() {
		return consomations;
	}
	public void setConsomations(List<Consomation> consomations) {
		this.consomations = consomations;
	}
	
	
}
