package com.piyush.client;

import java.util.Scanner;

import com.piyush.exceptions.InvalidInputException;
import com.piyush.presentation.EmployeePresentation;
import com.piyush.presentation.EmployeePresentationImpl;

public class EmployeeCourseProjectClient {
	
	public static void main(String args[]) {
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			String choice=sc.next();
			if((int)choice.charAt(0)-48>=0 && (int)choice.charAt(0)-48<=9) {
				employeePresentation.performMenu(Integer.parseInt(choice));
				System.out.println();
			}		
			else
				throw new InvalidInputException("Warning!!! Please input integer only");
			}
			catch(InvalidInputException exception ) {
				System.out.println(exception.getMessage());
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}

}

