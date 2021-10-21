package com.vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle tataUltra= new Truck("Brown","Tata-Ultra",14);
		Vehicle ashokLeyland= new Truck("Grey","Ashok-Leyland4220",18);
		
		Vehicle bus= new Bus("yellow","Volvo-B11R",6);
		
		Vehicle hyundaiI20= new Car("blue","Hyundai-i20",4);
		Vehicle maybach= new Car("black","Mercedes-Maybach",4);
		
		
		Vehicle[] vehicles= {tataUltra,ashokLeyland,bus,hyundaiI20,maybach};
		
		Road road=new Road();
		road.setVehicles(vehicles);
		
		road.startEngine();
			
	}

}
