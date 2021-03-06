package com.piyush.config;

import org.springframework.context.annotation.Bean;

import com.producer.Email;
import com.producer.SMS;

public class MessageConfiguration {
	
	@Bean
	public SMS sms() {
		return new SMS(1234567890,987654321);
	}
	
	@Bean
	public Email email() {
		return new Email("sender@gmail.com", "receiver@gmail.com");
	}

}
