package org.animals;

public class Monkey extends Animal {
	private String name;
	
	public Monkey(String name){
		this.name=name;
		setColor("Brown");
		setWeight(7);
		setAge(22);
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Monkey Sound";
	}
	
	public boolean isVegetarian() {
		return true;
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
//public Monkey() {
//	this.color="Brown";
//	this.weight=7;
//	this.age=22;
//}
//
//public Monkey(String color,int weight,int age) {
//	this.color=color;
//	this.weight=weight;
//	this.age=age;
//}
//	
//public boolean isVegetarian() {
//	return true;
//}
//public boolean canClimb() {
//	return true;
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