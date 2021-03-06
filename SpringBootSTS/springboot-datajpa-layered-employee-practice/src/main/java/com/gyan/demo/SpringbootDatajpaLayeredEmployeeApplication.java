package com.gyan.demo;

import java.util.Scanner;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gyan.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.gyan")
@EnableJpaRepositories(basePackages = "com.gyan.persistence")
@EntityScan(basePackages = "com.gyan.bean")

public class SpringbootDatajpaLayeredEmployeeApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeePresentation employeePresentation;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaLayeredEmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
			
		}	
		
	}

}
