package com.cg.dms.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer extends AbstractUser {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
