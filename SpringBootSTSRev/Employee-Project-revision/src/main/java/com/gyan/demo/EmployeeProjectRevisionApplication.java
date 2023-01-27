package com.gyan.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gyan.bean.Employee;
import com.gyan.persistence.EmployeeDao;
import com.gyan.presentation.EmployeePresentation;

@EntityScan(basePackages = "com.gyan.bean")
@EnableJpaRepositories(basePackages = "com.gyan.persistence")
@SpringBootApplication(scanBasePackages = "com.gyan")
public class EmployeeProjectRevisionApplication implements CommandLineRunner{
	@Autowired
	private EmployeePresentation employeePresentation;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectRevisionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			int choice = sc.nextInt();
			if(choice == 6) break;
			employeePresentation.performMenu(choice);
		}
		System.out.println("Thankyou !!");
		
	}

}
