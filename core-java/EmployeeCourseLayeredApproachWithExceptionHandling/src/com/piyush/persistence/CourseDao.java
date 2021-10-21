package com.piyush.persistence;

import java.util.ArrayList;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;
import com.piyush.exceptions.CourseNotFoundException;
import com.piyush.exceptions.CourseRegistraionFullException;
import com.piyush.exceptions.EmployeeNotFoundException;

public interface CourseDao {
	
	ArrayList<Course> getAllCourses();
	ArrayList<Employee> searchCourseById(String cId) throws CourseNotFoundException;
	boolean addEmployeeForCourseId(String cID,Employee employee) throws CourseNotFoundException, CourseRegistraionFullException;
	boolean removeEmployeeCourseId(String cID, Employee employee) throws CourseNotFoundException, EmployeeNotFoundException;

}
