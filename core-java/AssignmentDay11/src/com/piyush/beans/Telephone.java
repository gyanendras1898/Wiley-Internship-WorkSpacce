package com.piyush.beans;

public class Telephone {
	private String phNo;
	private Customer customer;
	public Telephone(String phNo, Customer customer) {
		super();
		this.phNo = phNo;
		this.customer = customer;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Telephone [phNo=" + phNo + ", customer=" + customer + "]";
	}
	
	

}
