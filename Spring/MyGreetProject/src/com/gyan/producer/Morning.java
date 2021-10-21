package com.gyan.producer;

public class Morning implements Greet {
	
	private String name;
	
	

	public Morning(String name) {
		super();
		this.name = name;
	}



	@Override
	public void wish() {
		System.out.println("Good Morning "+name);
	}

}
