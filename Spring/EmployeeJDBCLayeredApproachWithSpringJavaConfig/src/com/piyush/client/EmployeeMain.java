package com.piyush.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.piyush.config.EmployeeConfiguration;
import com.piyush.presentation.EmployeePresentation;
import com.piyush.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("employee.xml");
		
		ApplicationContext springContainer= new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter choice");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
