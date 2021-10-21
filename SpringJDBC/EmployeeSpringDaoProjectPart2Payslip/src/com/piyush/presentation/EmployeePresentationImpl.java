package com.piyush.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.piyush.bean.Employee;
import com.piyush.service.EmployeeService;
import com.piyush.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

//	private EmployeeService employeeService=new EmployeeServiceImpl();
	private EmployeeService employeeService;
	
	public EmployeePresentationImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee");
		System.out.println("3. Add Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		try {
			Scanner sc=new Scanner(System.in);
			switch (choice) {
			case 1:
				ArrayList<Employee> employees=employeeService.getAllEmployees();
				for(Employee employee:employees) 
					System.out.println(employee);
				
			
				break;
			case 2:
				System.out.println("Enter Employee ID");
				int id=sc.nextInt();
				Employee employee=employeeService.searchEmployee(id);
				System.out.println(employee);
				break;
				
			case 3:
				System.out.println("Enter employee Id");
				id=Integer.parseInt(sc.nextLine());
				System.out.println("Enter employee name");
				String name=sc.nextLine();
				System.out.println("Enter employee department");
				String department=sc.nextLine();
				System.out.println("Enter employee designation");
				String designation=sc.nextLine();
				System.out.println("Enter employee salary");
				int salary=sc.nextInt();
				
				employee=new Employee(id,name,department,designation,salary);
				if(employeeService.insertEmployee(employee))
					System.out.println("Successfully added employee");
				break;
				
				
			case 4:
				System.out.println("Enter Employee ID");
				id=sc.nextInt();
				if(employeeService.deleteEmployee(id))
					System.out.println("Successfully removed employee record");
				break;
				
				
			case 5:
				System.out.println("Enter Employee ID");
				id=sc.nextInt();
				System.out.println("Enter new Salary");
				salary=sc.nextInt();
				if(employeeService.updateSalary(id, salary))
					System.out.println("Successfully updated salary");
				break;
				
			
			
			
			case 6:
				System.out.println("Thanks for using Employee Management System");
				System.exit(0);
			default:
			break;
		}
	} catch ( SQLException e) {
		e.printStackTrace();
	}

	}

}
