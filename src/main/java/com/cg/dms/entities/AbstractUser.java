package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public abstract class AbstractUser {
	@Column
	private String username;
	@Column
	private String firsrtName;
	@Column
	private String lastName;
	@Column
	private String password;
	@Column
	private String mobileNumber;
	@Column
	private String email;
	@Column
	private int milkunits;
	@Column
	private double unitprice;
//	public AbstractUser() {
//		super();
//		
//	}
//	public AbstractUser(String username, String firsrtName, String lastName, String password, String mobileNumber,
//			String email, int milkunits, double unitprice) {
//		super();
//		this.username = username;
//		this.firsrtName = firsrtName;
//		this.lastName = lastName;
//		this.password = password;
//		this.mobileNumber = mobileNumber;
//		this.email = email;
//		this.milkunits = milkunits;
//		this.unitprice = unitprice;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirsrtName() {
		return firsrtName;
	}
	public void setFirsrtName(String firsrtName) {
		this.firsrtName = firsrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMilkunits() {
		return milkunits;
	}
	public void setMilkunits(int milkunits) {
		this.milkunits = milkunits;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", firsrtName=" + firsrtName + ", lastName=" + lastName
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + ", email=" + email + ", milkunits="
				+ milkunits + ", unitprice=" + unitprice + "]";
	}
	
}