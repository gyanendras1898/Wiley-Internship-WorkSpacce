package com.worker;

public class Main {
	public static void main(String[] args) {
		SalariedWorker salariedWorker=new SalariedWorker("Raman",100);
		DailyWorker dailyWorker=new DailyWorker("Aman",80.5);
		
		double ramanWage=salariedWorker.pay(35);
		double amanWage=dailyWorker.pay(55);
		
		System.out.println(salariedWorker.getName()+" salay:"+ramanWage+", for "
		+salariedWorker.getWorkInHour()+" hours @"+salariedWorker.getSalaryrate());
		
		System.out.println(dailyWorker.getName()+" salay:"+amanWage+", for "
				+dailyWorker.getWorkInHour()+" hours @"+dailyWorker.getSalaryrate());
	}
}
