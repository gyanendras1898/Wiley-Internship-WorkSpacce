package com.piyush.persistence;

import java.util.ArrayList;

import com.piyush.beans.Course;

import com.piyush.beans.Employee;
import com.piyush.database.CourseDataBase;
import com.piyush.exceptions.CourseNotFoundException;
import com.piyush.exceptions.CourseRegistraionFullException;
import com.piyush.exceptions.EmployeeNotFoundException;

public class CourseDaoImpl implements CourseDao {

	private CourseDataBase courseDataBase=new CourseDataBase();
	
	@Override
	public ArrayList<Course> getAllCourses() {
		return courseDataBase.getCourses();
	}

	@Override
	public ArrayList<Employee> searchCourseById(String cId) throws CourseNotFoundException {
		
		ArrayList<Course> courses=courseDataBase.getCourses();
		for(Course c: courses) {	
			if(c.getCourseId().equals(cId))
				return c.getEmployees();
		}
		throw new CourseNotFoundException("Course with course id "+cId+" does not exist");
	}
		
//		for(Course course:courseDataBase.getCourses()) {
//			if(course.getCourseId().equals(cId))
//				return course;
//		}
		
	
	

	@Override
	public boolean addEmployeeForCourseId(String cID, Employee employee) throws CourseNotFoundException, CourseRegistraionFullException{
		
		ArrayList<Employee> employees=this.searchCourseById(cID);
		employees.add(employee);
		return true;
		
		
//		int empCount=course.getEmpCount();
//		
//		if(empCount<Course.maxEmpCount) {
//			ArrayList<Employee> employees=course.getEmployees();
//			employees.add(employee);	
//			course.setEmployees(employees);
//			course.setEmpCount(empCount+1);
//			return true;
//		}
//		throw new CourseRegistraionFullException("Registration to "+cID+" course is full");
	}

	@Override
	public boolean removeEmployeeCourseId(String cID, Employee employee) throws CourseNotFoundException, EmployeeNotFoundException {
		
		ArrayList<Employee> employees=this.searchCourseById(cID);
		
		if(employees.contains(employee)) {
			employees.remove(employee);
			return true;
		}
		else
			throw new EmployeeNotFoundException("employee with id "+employee.getEmpId()+" does not exist!");
			}
		
		
//		for(int idx=0;idx<employees.length;idx++) {
//			if(employees[idx]==employee) {	
//				while(idx<employees.length-1 && employees[idx+1]!=null) {
//					employees[idx]=employees[idx+1];
//					idx++;
//				}
//				employees[idx]=null;
//				int count=course.getEmpCount();
//				course.setEmpCount(count-1);
				
//			}
//		}
	
//	}	
}
