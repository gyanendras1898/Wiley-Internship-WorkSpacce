package com.piyush.service;

import com.piyush.beans.Course;

import com.piyush.beans.Employee;
import com.piyush.exceptions.CourseNotFoundException;
import com.piyush.exceptions.CourseRegistraionFullException;
import com.piyush.exceptions.EmployeeNotFoundException;

public interface CourseService {

	Course[] getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee)throws CourseNotFoundException, CourseRegistraionFullException;
	boolean deregisterEmployeeForCourse(String cID,Employee employee) throws CourseNotFoundException, EmployeeNotFoundException;
	Employee[] listOfEmployeesForCourse(String cID) throws CourseNotFoundException;
}
