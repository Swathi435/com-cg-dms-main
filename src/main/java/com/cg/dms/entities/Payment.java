package com.cg.dms.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Payment_table")
public class Payment  {
	@Column
	private int paymentId;
	@Column
	private LocalDateTime dateTime;
	@Column
	private float bill;
	@Column
	private int milkunits;
	@Column
	private double unitprice;
	public Payment() {
		super();
		
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
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
		return "Payment [paymentId=" + paymentId + ", dateTime=" + dateTime + ", bill=" + bill + ", milkunits="
				+ milkunits + ", unitprice=" + unitprice + "]";
	}
}