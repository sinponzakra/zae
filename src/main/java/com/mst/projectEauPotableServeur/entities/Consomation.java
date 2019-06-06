package com.mst.projectEauPotableServeur.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Consomation {
	@Id @GeneratedValue
	private int id;
	private int consomationTotale;
	@OneToOne(fetch = FetchType.EAGER)
	private Facture facture;
	@ManyToOne(fetch = FetchType.EAGER)
	private Contrat contrat;
	@ManyToOne(fetch = FetchType.EAGER)
	private Tournee tournee;
	
	public Consomation() {
		super();
	}
	public Consomation(int id, int consomationTotale,Tournee tournee, Contrat contrat) {
		super();
		this.id = id;
		this.consomationTotale = consomationTotale;
		this.tournee = tournee;
		this.contrat = contrat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConsomationTotale() {
		return consomationTotale;
	}
	public void setConsomationTotale(int consomationTotale) {
		this.consomationTotale = consomationTotale;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Tournee getTournee() {
		return tournee;
	}
	public void setTournee(Tournee tournee) {
		this.tournee = tournee;
	}
	
	
	
}
