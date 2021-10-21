package org.animals;

public class Giraffe extends Animal{
	private String name;
	public Giraffe(String name){
		this.name=name;
		setColor("light tan");
		setWeight(720);
		setAge(26);
	}
	
	public boolean isVegetarian() {
		return true;
	}
	public boolean canClimb() {
		return false;
	}
	@Override
	public String sound() {
		return "Giraffe Sound";
	}
		
	
	public void displayProperties() {
		System.out.println(name);
		super.displayProperties();
	}

}


//private String color;
//private int weight;
//private int age;
//
//public Giraffe() {
//	this.color="light tan";
//	this.weight=720;
//	this.age=26;
//}
//
//public Giraffe(String color,int weight,int age) {
//	this.color=color;
//	this.weight=weight;
//	this.age=age;
//}
//
//public boolean canClimb() {
//	return false;
//}
//public String sound() {
//	return "yes";
//}
//public void setColor(String color) {
//	this.color = color;
//}
//
//public void setWeight(int weight) {
//	this.weight = weight;
//}
//
//public void setAge(int age) {
//	this.age = age;
//}
//public String getColor() {
//	return color;
//}
//public int getWeight() {
//	return weight;
//}
//public int getAge() {
//	return age;
//}
