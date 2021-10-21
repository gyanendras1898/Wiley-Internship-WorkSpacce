package com.vehicle;

public class Bus extends Vehicle {

	public Bus(String color, String model, int noOfWheels) {
		super(color, model, noOfWheels);
	}

	@Override
	public void start() {
		System.out.println(getNoOfWheels()+" wheels, "+getColor()+" "+ getModel()+" bus starts...");	}
	
	

}
