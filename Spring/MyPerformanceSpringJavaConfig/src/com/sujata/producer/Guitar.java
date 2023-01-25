package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("guitar")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("TIN TIN TIN");

	}

}
