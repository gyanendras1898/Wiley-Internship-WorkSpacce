package com.gyan.producer;

public class Evening implements Greet {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void wish() {
		System.out.println("Good Evening "+name);
	}

}
