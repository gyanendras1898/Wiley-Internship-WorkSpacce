package com.courses;

public class Coordinator {
		
	public void register(Course course,Employee employee) {
		course.getEmployeeList().add(employee);
	}
	public void deregister(Course course,Employee employee) {
		course.getEmployeeList().remove(employee);
	}
	public void displayList(Course course) {
		System.out.println("Employees registered to "+course.getName());
		for(Employee emp: course.getEmployeeList()) {
			System.out.println(emp.getName());
		}
	}
}





//System.out.println(employee.getName()+" successfully registered for "+course.getName());
//else
//System.out.println("error...");
//if(course.getEmployeeList().remove(employee))
//System.out.println("Thankyou");
//else
//System.out.println("error...");
