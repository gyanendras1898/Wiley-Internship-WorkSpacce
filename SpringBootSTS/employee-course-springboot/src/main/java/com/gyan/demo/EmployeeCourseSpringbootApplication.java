package com.gyan.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gyan.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.gyan")
public class EmployeeCourseSpringbootApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeePresentation employeePresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCourseSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);
			
		}
		
	}
	
	

}
