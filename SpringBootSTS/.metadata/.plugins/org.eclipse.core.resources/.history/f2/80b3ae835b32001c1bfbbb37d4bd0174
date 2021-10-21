package com.sujata.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
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
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			ArrayList<Employee> employees = employeeService.getAllEmployees();
			for (Employee employee : employees) {
				System.out.println(employee);
			}

			break;
		case 2:
			System.out.println("Enter Employee ID to be Searched for : ");
			int eId = scanner.nextInt();
			Employee emp = employeeService.searchEmployee(eId);
			System.out.println(emp);
			break;
		case 3:
			Employee employee = new Employee();
			System.out.println("Enter Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			employee.setName(scanner.next());
			System.out.println("Enter Employee Department : ");
			employee.setDepartment(scanner.next());
			System.out.println("Enter Employee Designation : ");
			employee.setDesignation(scanner.next());
			System.out.println("Enter Employee Salary : ");
			employee.setSalary(scanner.nextDouble());
			if (employeeService.insertEmployee(employee))
				System.out.println("Employee Added Succesfully");
			else
				System.out.println("Employee Record Not Added");

			break;
		case 4:
			System.out.println("Enter Employee ID whoes Record you want to delete : ");
			int empId = scanner.nextInt();

			if (employeeService.deleteEmployee(empId))
				System.out.println("Employee Deleted Successfully");
			else
				System.out.println("Employee Record Deletion Failed");

			break;
		case 5:
			System.out.println("Enter Employee ID : ");
			int emId = scanner.nextInt();
			System.out.println("Enter New Salary : ");
			double newSal = scanner.nextDouble();
			if (employeeService.updateSalary(emId, newSal))
				System.out.println("Salary Updated");
			else
				System.out.println("Updation Failed");
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			break;
		}

	}

}
