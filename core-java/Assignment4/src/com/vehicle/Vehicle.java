package com.vehicle;

public class Vehicle {
	
	private String color, model;
	private int noOfWheels;
	
	public Vehicle(String color, String model, int noOfWheels) {
		super();
		this.color = color;
		this.model = model;
		this.noOfWheels = noOfWheels;
	}
	
	public void start() {
		System.out.println("Vehicle starts...");
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	

}
