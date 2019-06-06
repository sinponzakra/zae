package com.mst.projectEauPotableServeur.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String etat;
	private Float montant;
	@Temporal(TemporalType.DATE)
	private Date dateLimite;
	private String message;
	private Float penalite;
	private Float autres;
	@Temporal(TemporalType.DATE)
	private Date datePaiment;
	@OneToOne(fetch = FetchType.EAGER)
	private Consomation consomation;
	@OneToOne(fetch = FetchType.EAGER)
	private RecuPaiment recuPaiment;
	
	
	public Facture() {
		super();
	}
	public Facture(int id, String etat, Float montant, Date dateLimite, String message, Float penalite, Float autres,
			Date datePaiment) {
		super();
		this.id = id;
		this.etat = etat;
		this.montant = montant;
		this.dateLimite = dateLimite;
		this.message = message;
		this.penalite = penalite;
		this.autres = autres;
		this.datePaiment = datePaiment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public Date getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Float getPenalite() {
		return penalite;
	}
	public void setPenalite(Float penalite) {
		this.penalite = penalite;
	}
	public Float getAutres() {
		return autres;
	}
	public void setAutres(Float autres) {
		this.autres = autres;
	}
	public Date getDatePaiment() {
		return datePaiment;
	}
	public void setDatePaiment(Date datePaiment) {
		this.datePaiment = datePaiment;
	}
	public Consomation getConsomation() {
		return consomation;
	}
	public void setConsomation(Consomation consomation) {
		this.consomation = consomation;
	}
	public RecuPaiment getRecuPaiment() {
		return recuPaiment;
	}
	public void setRecuPaiment(RecuPaiment recuPaiment) {
		this.recuPaiment = recuPaiment;
	}
	
	
}
