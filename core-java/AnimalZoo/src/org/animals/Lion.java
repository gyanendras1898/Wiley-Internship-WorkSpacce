package org.animals;

public class Lion extends Animal{
	private String name;
	
	public Lion(String name){
		this.name=name;
		setColor("Ash brown");
		setWeight(180);
		setAge(7);
	}
	
	
	
	public boolean isVegetarian() {
		return false;
	}
	public boolean canClimb() {
		return false;
	}
	@Override
	public String sound() {
		return "Lion sound";
	}

	
	public void displayProperties() {
		System.out.println(name);
		super.displayProperties();
	}

}


//public Lion() {
//this.color="Ash brown";
//this.weight=180;
//this.age=7;
//}
//
//public Lion(String color,int weight,int age) {
//this.color=color;
//this.weight=weight;
//this.age=age;
//}
//
////behaviors
//public boolean isVegetarian() {
//return false;
//}
//public boolean canClimb() {
//return false;
//}
//public String sound() {
//return "yes";
//}
//
////set properties
//public void setColor(String color) {
//this.color = color;
//}
//
//public void setWeight(int weight) {
//this.weight = weight;
//}
//
//public void setAge(int age) {
//this.age = age;
//}
//
////get properties
//public String getColor() {
//return color;
//}
//public int getWeight() {
//return weight;
//}
//public int getAge() {
//return age;
//}
//