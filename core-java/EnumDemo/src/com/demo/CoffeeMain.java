package com.demo;

public class CoffeeMain {
	
	public static void main(String[] args) {
		
		Coffee coffee=Coffee.ARABICA;
		
		System.out.println("Price: "+coffee.getPrice());
		System.out.println("Origin: "+coffee.getOrigin());
	}
	
}
