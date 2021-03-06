package com.config;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.producer.Email;
import com.producer.InitProcessForMessages;
import com.producer.SMS;
@Configuration
public class MessageConfiguration {
	
	@Bean
	@Lazy(value =true)
	public SMS sms() {
		return new SMS(1234567890,987654321);
	}
	
	@Bean(initMethod = "customInitForBean1", destroyMethod = "customDestroyForBean1")
//	@Scope(scopeName = "prototype")
	
	public Email email() {
		return new Email("sender@gmail.com", "receiver@gmail.com");
	}
	
	@Bean
	public InitProcessForMessages commonInit() {	
		return new InitProcessForMessages();	
	}
	

}
