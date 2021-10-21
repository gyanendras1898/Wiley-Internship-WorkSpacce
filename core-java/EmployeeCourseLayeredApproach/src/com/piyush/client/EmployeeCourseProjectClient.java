package com.piyush.client;

import java.util.Scanner;


import com.piyush.presentation.EmployeePresentation;
import com.piyush.presentation.EmployeePresentationImpl;

public class EmployeeCourseProjectClient {
	
	public static void main(String args[]) {
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);
			
		}
	}

}
