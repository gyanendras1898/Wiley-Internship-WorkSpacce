package com.courses;

import java.util.LinkedList;
import java.util.List;

public abstract class Course {
	private String name;
	private double courseFee;
	private List<Employee> employeeList;
	
	public Course(String name, double courseFee) {
		super();
		this.name = name;
		this.courseFee = courseFee;
		employeeList=new LinkedList<>();
	}
	abstract String platform();
	abstract String courseType();
	
	public String getName() {
		return name;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	
	
}
