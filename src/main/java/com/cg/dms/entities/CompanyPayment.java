package com.cg.dms.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CompanyPayment  extends Payment{

	private Farmer farmer;
	@ManyToOne
	@JoinColumn(name = "farmerId")
	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	

}