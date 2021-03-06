package com.gyan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gyan.producer.Performer;

@SpringBootApplication(scanBasePackages = "com.gyan.producer")
public class PerformerSpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(PerformerSpringbootProjectApplication.class, args);
		
		Performer jugg=(Performer) springContainer.getBean("dancer");
		
		jugg.perform();
		
	}

}
