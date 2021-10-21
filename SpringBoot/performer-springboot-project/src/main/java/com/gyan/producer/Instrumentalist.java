package com.gyan.producer;

public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
