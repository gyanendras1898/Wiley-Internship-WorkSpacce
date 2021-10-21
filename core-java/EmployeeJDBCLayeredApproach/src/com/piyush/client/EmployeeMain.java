package com.piyush.client;

import java.util.Scanner;

import com.piyush.presentation.EmployeePresentation;
import com.piyush.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter choice");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
