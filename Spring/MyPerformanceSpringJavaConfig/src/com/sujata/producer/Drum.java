package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("drum")
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("Dum Dum Dum");

	}

}
