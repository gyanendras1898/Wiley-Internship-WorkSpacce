package com.piyush.service;

import java.util.ArrayList;

import com.piyush.beans.Course;

import com.piyush.beans.Employee;
import com.piyush.exceptions.CourseNotFoundException;
import com.piyush.exceptions.CourseRegistraionFullException;
import com.piyush.exceptions.EmployeeNotFoundException;

public interface CourseService {

	ArrayList<Course> getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee)throws CourseNotFoundException, CourseRegistraionFullException;
	boolean deregisterEmployeeForCourse(String cID,Employee employee) throws CourseNotFoundException, EmployeeNotFoundException;
	ArrayList<Employee> listOfEmployeesForCourse(String cID) throws CourseNotFoundException;
}
