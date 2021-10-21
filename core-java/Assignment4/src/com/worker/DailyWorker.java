package com.worker;

public class DailyWorker extends Worker {
		
	public DailyWorker(String name, double salaryrate) {
		super(name, salaryrate);
	}
	
	public double pay(int hours) {
		setWorkInHour(hours);
		return hours*getSalaryrate();
	}
}
