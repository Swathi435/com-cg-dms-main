package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company_table")
public class Company {
	@Column
	private String companyName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String mobileNumber;
	@Column
	private String address;
	public Company() {
		super();
		
	}
	public Company(String companyName, String email, String password, String mobileNumber, String address) {
		super();
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", email=" + email + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", address=" + address + "]";
	}
}