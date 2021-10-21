package com.gyan.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dancer implements Performer {

	private String style;
	
	
	public Dancer(@Value("Break Dance") String style) {
		super();
		this.style = style;
	}


	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" Style!");

	}

}
