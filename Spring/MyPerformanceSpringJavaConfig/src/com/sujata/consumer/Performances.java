package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import com.sujata.config.PerformanceConfiguration;
import com.sujata.producer.Instrument;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

public class Performances {

	public static void main(String[] args) {
//		ApplicationContext springContainer= new ClassPathXmlApplicationContext("performer.xml");
		ApplicationContext springContainer = new AnnotationConfigApplicationContext(PerformanceConfiguration.class);
		Performer singer = (Performer) springContainer.getBean("getJuggler");
		singer.perform();
		
		Performer instrumentalist = (Performer) springContainer.getBean("instrumentalist");
		instrumentalist.perform();;
		
//		Instrument instument = (Instrument) springContainer.getBean("tabla");
//		
//		instument.play();
	}

}
