package com.vehicle;

public class Car extends Vehicle {

	public Car(String color, String model, int noOfWheels) {
		super(color, model, noOfWheels);
	}

	@Override
	public void start() {
		System.out.println(getNoOfWheels()+" wheels, "+getColor()+" "+ getModel()+" car starts...");	}
	

}
