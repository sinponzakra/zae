package com.mst.projectEauPotableServeur.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tournee {
	@Id @GeneratedValue
	private int id;
	@Temporal(TemporalType.DATE)
	private Date dateTournee; 
	@ManyToOne(fetch=FetchType.EAGER)
	private Membre membre;
	@ManyToOne(fetch=FetchType.EAGER)
	private PeriodeConsomation periodeConsomation;
	
	public Tournee() {
		super();
	}
	public Tournee(int id, Date dateTournee, Membre membre, PeriodeConsomation periodeConsomation) {
		super();
		this.id = id;
		this.dateTournee = dateTournee;
		this.membre = membre;
		this.periodeConsomation = periodeConsomation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateTournee() {
		return dateTournee;
	}
	public void setDateTournee(Date dateTournee) {
		this.dateTournee = dateTournee;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	public PeriodeConsomation getPeriodeConsomation() {
		return periodeConsomation;
	}
	public void setPeriodeConsomation(PeriodeConsomation periodeConsomation) {
		this.periodeConsomation = periodeConsomation;
	}
	
	
}
