package com.vehicle;

public class Truck extends Vehicle {

	public Truck(String color, String model, int noOfWheels) {
		super(color, model, noOfWheels);
	}

	@Override
	public void start() {
		System.out.println(getNoOfWheels()+" wheels, "+getColor()+" "+ getModel()+" Truck starts...");
	}
	
	

}
