package org.animals;

public class Elephant extends Animal {

private String name;
	
	public Elephant(String name){
		this.name=name;
		setColor("Greyish Black");
		setWeight(4000);
		setAge(60);
	}
	
	public boolean isVegetarian() {
		return true;
	}
	public boolean canClimb() {
		return false;
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Elephant Sound";
	}
	public void displayProperties() {
		System.out.println(name);
		super.displayProperties();
	}


}

//
//public Elephant() {
//	this.color="Greyish Black";
//	this.weight=4000;
//	this.age=60;
//}
//
//public Elephant(String color,int weight,int age) {
//	this.color=color;
//	this.weight=weight;
//	this.age=age;
//}
//	
//public boolean isVegetarian() {
//	return true;
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
