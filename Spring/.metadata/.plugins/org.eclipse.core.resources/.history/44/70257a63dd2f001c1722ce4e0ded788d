package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class Performances {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomance.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Waqar");
		performer1.perform();
		
		Performer performer2=(Performer)springContainer.getBean("Shalini");
		
//		Performer performer3=(Performer)springContainer.getBean("Shafi");
		
		performer2.perform();
//		performer3.perform();

	}

}
