package com.worker;

abstract public class Worker {
	private String name;
	private double salaryrate;
	private int workInHour;
	
	public Worker(String name, double salaryrate) {
		this.name = name;
		this.salaryrate = salaryrate;
	}
	
	abstract double pay(int hrs);
	
	public String getName() {
		return name;
	}
	public double getSalaryrate() {
		return salaryrate;
	}
	public int getWorkInHour() {
		return workInHour;
	}
	public void setWorkInHour(int workInHour) {
		this.workInHour = workInHour;
	}
}
