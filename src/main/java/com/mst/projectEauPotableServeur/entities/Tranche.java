package com.mst.projectEauPotableServeur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tranche {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String refTranche;
	private int volumeMax;
	private int volumeMin;
	private Float tarif;
	
	
	public Tranche() {
	}


	public Tranche(int id, String refTranche, int volumeMax, int volumeMin, Float tarif) {
		this.id = id;
		this.refTranche = refTranche;
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.tarif = tarif;
	}
	
	public Tranche(String refTranche, int volumeMax, int volumeMin, Float tarif) {
		this.refTranche = refTranche;
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.tarif = tarif;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRefTranche() {
		return refTranche;
	}


	public void setRefTranche(String refTranche) {
		this.refTranche = refTranche;
	}


	public int getVolumeMax() {
		return volumeMax;
	}


	public void setVolumeMax(int volumeMax) {
		this.volumeMax = volumeMax;
	}


	public int getVolumeMin() {
		return volumeMin;
	}


	public void setVolumeMin(int volumeMin) {
		this.volumeMin = volumeMin;
	}


	public Float getTarif() {
		return tarif;
	}


	public void setTarif(Float tarif) {
		this.tarif = tarif;
	}
	
	
	
}
