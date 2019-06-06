package com.mst.projectEauPotableServeur.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ConsomationParTranchePK implements Serializable {
	
	/**
	 * 
	 */
	private int tranche;
	private int consomation;
	private Float quantite;
	
	public ConsomationParTranchePK() {
		super();
	}
	
	
	public ConsomationParTranchePK(int tranche, int consomation, Float quantite) {
		super();
		this.tranche = tranche;
		this.consomation = consomation;
		this.quantite = quantite;
	}


	public int getTranche() {
		return tranche;
	}
	public void setTranche(int tranche) {
		this.tranche = tranche;
	}
	public int getConsomation() {
		return consomation;
	}
	public void setConsomation(int consomation) {
		this.consomation = consomation;
	}
	public Float getQuantite() {
		return quantite;
	}
	public void setQuantite(Float quantite) {
		this.quantite = quantite;
	}
	
}
