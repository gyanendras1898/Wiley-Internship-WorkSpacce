package exceptions.employee.presentation;

import java.util.Scanner;

import exceptions.employee.beans.Employee;
import exceptions.employee.exceptions.EmployeeAgeOutOfRangeException;
import exceptions.employee.exceptions.EmployeeAlreadyExistException;
import exceptions.employee.exceptions.EmployeeListOverflowException;
import exceptions.employee.service.EmployeeService;
import exceptions.employee.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {
	Scanner sc=new Scanner(System.in);
	
	EmployeeService employeeService=new EmployeeServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("1. View Employees lis");
		System.out.println("2. Add Employee");
		System.out.println("3. To Exit");
	}

	@Override
	public void performMenu(int choice) {
		try {
			switch(choice) {
			case 1:
				for(Employee emp: employeeService.getAllEmployee()) {
					if(emp==null) break;
					System.out.println(emp);
				}
				break;
			case 2:
				System.out.println("Enter name of employee");
				String name=sc.nextLine();
				System.out.println("Enter age of employee");
				int age=Integer.parseInt(sc.nextLine());
				Employee employee=new Employee(name,age);
				
				employeeService.validateAge(employee);
				employeeService.addEmployee(employee);
				break;
			case 3:
				System.out.println("Thanks for using our System, kindly visit us again!");
				System.exit(0);
			default:
				System.out.println("Enter Valid Choice!");
			}
		}
		catch(EmployeeAlreadyExistException | EmployeeAgeOutOfRangeException | EmployeeListOverflowException exception) {
			System.out.println(exception.getMessage());
		}

	}

}
