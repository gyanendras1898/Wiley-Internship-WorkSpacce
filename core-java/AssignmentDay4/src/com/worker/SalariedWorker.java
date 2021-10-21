package com.worker;

public class SalariedWorker extends Worker {
	
	public SalariedWorker(String name, double salaryrate) {
		super(name, salaryrate);
	}
	public double pay(int hours) {
		setWorkInHour(40);
		return 40*getSalaryrate();
	}
}
