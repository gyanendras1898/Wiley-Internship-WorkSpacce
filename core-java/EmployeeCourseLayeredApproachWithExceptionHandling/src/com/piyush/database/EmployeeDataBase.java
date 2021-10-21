package com.piyush.database;

import java.util.ArrayList;

import com.piyush.beans.Employee;

public class EmployeeDataBase {
	private static ArrayList<Employee> employees=new ArrayList<>();
	static {
		employees.add(new Employee(101, "Akash", "IT", "Sr. Manager", 250000));
		employees.add(new Employee(102, "Bharat", "IT", "Associate", 100000));
		employees.add(new Employee(103, "Charu", "IT", "Sr. Associate", 120000)) ;
		employees.add(new Employee(104, "Disha", "IT", "Executive", 50000));
		employees.add(new Employee(105, "Esha", "IT", "Team Lead", 150000));
	}
	public static ArrayList<Employee> getEmployees() {
		return employees;
	}
	public static void setEmployees(ArrayList<Employee> employees) {
		EmployeeDataBase.employees = employees;
	}
	
	

}
