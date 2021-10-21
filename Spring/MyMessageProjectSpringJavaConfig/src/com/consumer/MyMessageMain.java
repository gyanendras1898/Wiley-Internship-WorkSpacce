package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.piyush.config.MessageConfiguration;
import com.producer.Message;

public class MyMessageMain {

	public static void main(String[] args) {
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("messageAnnotation.xml");
		
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(MessageConfiguration.class);
		
		Message sms=(Message) springContainer.getBean("sms");
		Message mail=(Message) springContainer.getBean("email");
		
		sms.send();
		mail.send();

	}

}
