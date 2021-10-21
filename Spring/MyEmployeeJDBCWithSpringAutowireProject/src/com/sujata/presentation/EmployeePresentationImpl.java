package com.sujata.presentation;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

//	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
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
		switch (choice) {
		case 1:
			try {
				ArrayList<Employee> employees=employeeService.getAllEmployees();
				for(Employee employee:employees) {
					System.out.println(employee);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			break;
		}

	}

}
