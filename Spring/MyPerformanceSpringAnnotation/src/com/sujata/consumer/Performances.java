package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import com.sujata.producer.Instrument;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

public class Performances {

	public static void main(String[] args) {
//		ApplicationContext springContainer= new ClassPathXmlApplicationContext("performer.xml");
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("performanceAnnotation.xml");
		Performer singer = (Performer) springContainer.getBean("juggler");
		singer.perform();
		
		Instrument instument = (Instrument) springContainer.getBean("tabla");
		
		instument.play();
	}

}
