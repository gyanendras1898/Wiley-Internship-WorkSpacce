package com.demo;

public enum Coffee {
	LIBERICA(50,"Brazil"),ROBUSTA(100.20,"Vietnam"),ARABICA(80.45,"India");
	
	private double price;
	private String origin;
	
	private Coffee(double price, String origin) {
		this.price = price;
		this.origin = origin;
	}

	public double getPrice() {
		return price;
	}

	public String getOrigin() {
		return origin;
	}
	
}
