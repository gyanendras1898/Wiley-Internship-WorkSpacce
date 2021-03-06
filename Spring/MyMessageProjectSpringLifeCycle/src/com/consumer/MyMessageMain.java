package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.producer.Message;

public class MyMessageMain {

	public static void main(String[] args) {
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("message.xml");
		springContainer.registerShutdownHook();
		
//		Message sms=(Message) springContainer.getBean("sms");
		Message mail=(Message) springContainer.getBean("email");
		
//		sms.send();
		mail.send();

	}

}
