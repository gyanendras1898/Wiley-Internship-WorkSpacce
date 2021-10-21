package org.animals;

abstract public class Animal {
	private String color;
	private int weight;
	private int age;
	
	abstract public boolean isVegetarian();
	abstract public boolean canClimb();
	abstract public String sound();
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//get properties
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	
	public void displayProperties() {
		System.out.print("color:"+getColor()+", weight:"+getWeight()+", age:"+getAge()+" ");
		System.out.println("Veg: "+isVegetarian()+",  canClimb: "+canClimb()+",  sound: "+sound());
	}
	
}
