package com.cg.dms.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CustomerPayment extends Payment {

	private Dealer dealer;
	@ManyToOne
	@JoinColumn(name = "dealerId")
	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

}