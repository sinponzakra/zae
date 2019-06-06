package com.mst.projectEauPotableServeur.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RecuPaiment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String NumeroRecu;
	@OneToOne(fetch = FetchType.EAGER	, cascade =  CascadeType.ALL, mappedBy = "recuPaiment")
	private Facture facture;
	
	public RecuPaiment() {
	}
	public RecuPaiment(int id, String numeroRecu) {
		this.id = id;
		NumeroRecu = numeroRecu;
	}
	public RecuPaiment(String numeroRecu) {
		NumeroRecu = numeroRecu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroRecu() {
		return NumeroRecu;
	}
	public void setNumeroRecu(String numeroRecu) {
		NumeroRecu = numeroRecu;
	}
	
}
