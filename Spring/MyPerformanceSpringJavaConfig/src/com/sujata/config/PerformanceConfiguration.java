package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Drum;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformanceConfiguration {

	@Bean("singer")
	public Singer getSinger() {
		return new Singer("huu Lalal");
	}

	@Bean
	public Juggler getJuggler() {
		Juggler juggler = new Juggler();
		juggler.setBalls(17);
		return juggler;
	}

	@Bean("tabla")
	public Tabla getTabla() {
		Tabla tabla = new Tabla();
		return tabla;
	}
	
	@Bean("drum")
	public Drum getDrum() {
		return new Drum();
	}

	@Bean("instrumentalist")
	public Instrumentalist getIntrumentalist() {
		Instrumentalist instrumentalist = new Instrumentalist();
		instrumentalist.setInstrument(getDrum());
		return instrumentalist;			
	}
}
