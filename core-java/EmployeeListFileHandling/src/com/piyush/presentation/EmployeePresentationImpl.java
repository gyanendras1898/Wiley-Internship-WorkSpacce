package com.piyush.presentation;

import java.util.Scanner;

import com.piyush.beans.Employee;
import com.piyush.exceptions.EmployeeNotFoundException;
import com.piyush.service.EmployeeService;
import com.piyush.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {
	

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	
	@Override
	public void showMenu() {
		System.out.println("1. Insert new employee");
		System.out.println("2. Delete existing employee");
		System.out.println("3. Update existing employee");
		System.out.println("4. Display all the employee");
		System.out.println("5. Search employee by id");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice){
		try {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter EmployeeID");
			int empID=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter Employee name");
			String name=scanner.nextLine();
			System.out.println("Enter Employee designation");
			String desig=scanner.nextLine();
			System.out.println("Enter Employee department");
			String depart=scanner.nextLine();
			System.out.println("Enter Employee salary");
			int salary=Integer.parseInt(scanner.nextLine());
			
			Employee employee=new Employee(empID,name,desig,depart,salary);
			
			employeeService.insertEmployee(employee);
			
			
			
//			Course[] courses=courseService.getAllCoursesForEmployee();
//			for(Course course:courses) {
//				System.out.println(course);
//			}
			break;
//		case 2:
//			System.out.println("Enter Employee ID: ");
//			int empId=scanner.nextInt();
//			Employee employee=employeeService.searchEmployeeById(empId);
//			System.out.println("Enter Course ID : ");
//			String cId=scanner.next();
//			boolean status=courseService.registerEmployeeForCourse(cId, employee);
//			if(status)
//				System.out.println("Employee Registered Successfully!");
//			break;
//		case 3:
//			System.out.println("Enter Employee ID: ");
//			empId=scanner.nextInt();
//			employee=employeeService.searchEmployeeById(empId);
//			System.out.println("Enter Course ID : ");
//			cId=scanner.next();
//			status=courseService.deregisterEmployeeForCourse(cId, employee);
//			if(status)
//				System.out.println("Employee deRegistered Successfully!");
//			break;
		case 4:
			Employee[] employees=employeeService.listOfEmployees();
			if(employees[0]==null) System.out.println("Empty! No one registered yet");
			
			for(Employee emp : employees) {
				if(emp==null)	break;
				System.out.println(emp);
			}
			break;
//		case 5:
//			System.out.println("Thanks for using our System, kindly visit us again!");
//			System.exit(0);
		case 6:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
