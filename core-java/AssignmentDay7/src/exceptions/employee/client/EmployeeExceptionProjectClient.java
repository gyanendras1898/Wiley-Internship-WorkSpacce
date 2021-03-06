package exceptions.employee.client;

import java.util.Scanner;

import exceptions.employee.exceptions.InvalidInputException;
import exceptions.employee.presentation.EmployeePresentation;
import exceptions.employee.presentation.EmployeePresentationImpl;

public class EmployeeExceptionProjectClient {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
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
			catch(InvalidInputException exception) {
				System.out.println(exception.getMessage());
			}
		}
		
	}

}

