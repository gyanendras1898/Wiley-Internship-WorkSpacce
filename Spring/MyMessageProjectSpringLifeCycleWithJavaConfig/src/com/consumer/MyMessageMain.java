package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MessageConfiguration;
import com.producer.Message;

public class MyMessageMain {

	public static void main(String[] args) {
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
		
//		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
//		springContainer.registerShutdownHook();
		
		AbstractApplicationContext springContainer=new AnnotationConfigApplicationContext(MessageConfiguration.class);
		springContainer.registerShutdownHook();
		
		Message sms=(Message) springContainer.getBean("sms");
		Message mail=(Message) springContainer.getBean("email");
		Message mail2=(Message) springContainer.getBean("email");
		
		System.out.println("Mail 1 : "+mail);
		System.out.println("Mail 2 : "+mail2);
		
//		sms.send();
		mail.send();

	}

}
