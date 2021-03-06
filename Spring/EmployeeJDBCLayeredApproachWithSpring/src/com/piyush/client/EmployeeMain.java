package com.piyush.client;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.piyush.presentation.EmployeePresentation;
//import com.piyush.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("emp.xml");
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter choice");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
