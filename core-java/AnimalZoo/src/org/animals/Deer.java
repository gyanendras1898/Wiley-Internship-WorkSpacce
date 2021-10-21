package org.animals;

public class Deer extends Animal{
private String name;
	
	public Deer(String name){
		this.name=name;
		setColor("reddish brown");
		setWeight(50);
		setAge(9);
	}
	
	public boolean isVegetarian() {
		return true;
	}
	public boolean canClimb() {
		return false;
	}

	@Override
	public String sound() {
		return "Deer Sound";
	}
	
	public void displayProperties() {
		System.out.println(name);
		super.displayProperties();
	}


}

//public Deer() {
//	this.color="reddish brown";
//	this.weight=50;
//	this.age=9;
//}
//
//public Deer(String color,int weight,int age) {
//	this.color=color;
//	this.weight=weight;
//	this.age=age;
//}
//
//
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
