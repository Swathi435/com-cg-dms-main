package com.cg.dms.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Farmer extends AbstractUser {
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int farmerId;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
}