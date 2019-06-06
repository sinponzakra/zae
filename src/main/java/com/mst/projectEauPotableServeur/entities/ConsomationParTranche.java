package com.mst.projectEauPotableServeur.entities;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ConsomationParTranche {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ConsomationParTranchePK id;
	@ManyToOne
	@JoinColumn(name = "consomation", referencedColumnName = "id", insertable = false, updatable = false)
	private Consomation consomation;
	@ManyToOne
	@JoinColumn(name = "tranche", referencedColumnName = "id", insertable = false, updatable = false)
	private Tranche tranche;

	public ConsomationParTranche() {
		super();
	}

	public ConsomationParTranche(ConsomationParTranchePK id, Consomation consomation, Tranche tranche) {
		super();
		this.id = id;
		this.consomation = consomation;
		this.tranche = tranche;
	}

	public ConsomationParTranchePK getId() {
		return id;
	}

	public void setId(ConsomationParTranchePK id) {
		this.id = id;
	}

	public Consomation getConsomation() {
		return consomation;
	}

	public void setConsomation(Consomation consomation) {
		this.consomation = consomation;
	}

	public Tranche getTranche() {
		return tranche;
	}

	public void setTranche(Tranche tranche) {
		this.tranche = tranche;
	}
	
	
	
}
