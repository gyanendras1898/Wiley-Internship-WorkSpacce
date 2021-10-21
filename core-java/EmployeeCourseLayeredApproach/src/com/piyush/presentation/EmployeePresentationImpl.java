package com.piyush.presentation;

import java.util.Scanner;
import com.piyush.beans.Course;
import com.piyush.beans.Employee;
import com.piyush.service.CourseService;
import com.piyush.service.CourseServiceImpl;
import com.piyush.service.EmployeeService;
import com.piyush.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private CourseService courseService=new CourseServiceImpl();
	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Courses");
		System.out.println("2. Register For Course");
		System.out.println("3. DeRegister For Course");
		System.out.println("4. List the participants of Specific Course");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			Course[] courses=courseService.getAllCoursesForEmployee();
			for(Course course:courses) {
				System.out.println(course);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID: ");
			int empId=scanner.nextInt();
			Employee employee=employeeService.searchEmployeeById(empId);
			System.out.println("Enter Course ID : ");
			String cId=scanner.next();
			boolean status=courseService.registerEmployeeForCourse(cId, employee);
			if(status)
				System.out.println("Employee Registered Successfully!");
			else
				System.out.println("Employee Cannot Register for Course this time");
			break;
		case 3:
			System.out.println("Enter Employee ID: ");
			empId=scanner.nextInt();
			employee=employeeService.searchEmployeeById(empId);
			System.out.println("Enter Course ID : ");
			cId=scanner.next();
			status=courseService.deregisterEmployeeForCourse(cId, employee);
			if(status)
				System.out.println("Employee deRegistered Successfully!");
			else
				System.out.println("Employee Cannot deRegister for Course this time");
			break;
		case 4:
			System.out.println("Enter Course ID whoes Employee Registration you want to see :");
			String courseId=scanner.next();
			Employee empls[]=courseService.listOfEmployeesForCourse(courseId);
			for(Employee emp:empls) {
				if(emp==null)	break;
				System.out.println(emp);
			}
			break;
		case 5:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
		}

	}

}
