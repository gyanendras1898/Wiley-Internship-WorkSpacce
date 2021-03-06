package com.gyan.service;

import com.gyan.beans.Course;
import com.gyan.beans.Employee;

public interface CourseService {

	Course[] getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee);
	boolean deregisterEmployeeForCourse(String cID,Employee employee);
	Employee[] listOfEmployeesForCourse(String cID);
}
