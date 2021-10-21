package com.vehicle;

public class Road {
	private Vehicle[] vehicles;

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}
	
	public void startEngine() {
		for(Vehicle v: vehicles) {
			v.start();
		}
	}

}
