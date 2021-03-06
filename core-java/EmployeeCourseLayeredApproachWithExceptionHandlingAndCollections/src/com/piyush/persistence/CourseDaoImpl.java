package com.piyush.persistence;

import com.piyush.beans.Course;

import com.piyush.beans.Employee;
import com.piyush.database.CourseDataBase;
import com.piyush.exceptions.CourseNotFoundException;
import com.piyush.exceptions.CourseRegistraionFullException;
import com.piyush.exceptions.EmployeeNotFoundException;

public class CourseDaoImpl implements CourseDao {

	private CourseDataBase courseDataBase=new CourseDataBase();
	
	@Override
	public Course[] getAllCourses() {
		return courseDataBase.getCourses();
	}

	@Override
	public Course searchCourseById(String cId) throws CourseNotFoundException {
		for(Course course:courseDataBase.getCourses()) {
			if(course.getCourseId().equals(cId))
				return course;
		}
		throw new CourseNotFoundException("Course with course id "+cId+" does not exist");
	}

	@Override
	public boolean addEmployeeForCourseId(String cID, Employee employee) throws CourseNotFoundException, CourseRegistraionFullException{
		
		Course course= this.searchCourseById(cID);
		int empCount=course.getEmpCount();
		
		if(empCount<Course.maxEmpCount) {
			Employee[] employees=course.getEmployees();
			employees[empCount]=employee;	
			course.setEmployees(employees);
			course.setEmpCount(empCount+1);
			return true;
		}
		throw new CourseRegistraionFullException("Registration to "+cID+" course is full");
	}

	@Override
	public boolean removeEmployeeCourseId(String cID, Employee employee) throws CourseNotFoundException, EmployeeNotFoundException {
		Course course= this.searchCourseById(cID);
		Employee[] employees=course.getEmployees();
		
		for(int idx=0;idx<employees.length;idx++) {
			if(employees[idx]==employee) {	
				while(idx<employees.length-1 && employees[idx+1]!=null) {
					employees[idx]=employees[idx+1];
					idx++;
				}
				employees[idx]=null;
				int count=course.getEmpCount();
				course.setEmpCount(count-1);
				return true;
			}
		}
		throw new EmployeeNotFoundException("employee with id "+employee.getEmpId()+" does not exist!");
	}	
}
