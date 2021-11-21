package com.cg.dms.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DealerPayment extends Payment {
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}