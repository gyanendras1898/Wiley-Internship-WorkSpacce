package org.animals;

public class Tiger extends Animal {
	private String name;

	public Tiger(String name){
		this.name=name;
		setColor("White");
		setWeight(140);
		setAge(6);
	}
	
	@Override
	public String sound() {
		return "Tiger Sound";
	}
	
	public boolean isVegetarian() {
		return false;
	}
	public boolean canClimb() {
		return false;
	}
	public void displayProperties() {
		System.out.println(name);
		super.displayProperties();
	}

	
}



//
//private String color;
//private int weight;
//private int age;
//
//public Tiger() {
//	this.color="White";
//	this.weight=140;
//	this.age=6;
//}
//
//public Tiger(String color,int weight,int age) {
//	this.color=color;
//	this.weight=weight;
//	this.age=age;
//}
//
//public boolean isVegetarian() {
//	return false;
//}
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