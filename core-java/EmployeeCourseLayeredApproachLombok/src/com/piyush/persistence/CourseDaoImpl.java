package com.piyush.persistence;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;
import com.piyush.database.CourseDataBase;

public class CourseDaoImpl implements CourseDao {

	private CourseDataBase courseDataBase=new CourseDataBase();
	
	@Override
	public Course[] getAllCourses() {
		return courseDataBase.getCourses();
	}

	@Override
	public Course searchCourseById(String cId) {
		for(Course course:courseDataBase.getCourses()) {
			if(course.getCourseId().equals(cId))
				return course;
		}
		return null;
	}

	@Override
	public boolean addEmployeeForCourseId(String cID, Employee employee) {
		Course[] courses=courseDataBase.getCourses();
		for(Course course:courses) {
			if(course.getCourseId().equals(cID)) {
				Employee[] employees=course.getEmployees();
				
				employees[course.getEmpCount()]=employee;	
				course.setEmployees(employees);
				
				int count=course.getEmpCount();
				course.setEmpCount(count+1);
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeEmployeeCourseId(String cID, Employee employee) {
		Course[] courses=courseDataBase.getCourses();
		for(Course course: courses) {
			if(course.getCourseId().equals(cID)) {
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
					
				}
			}
		return false;
	}

	
}
//
//
//for(int i=idx;i<employees.length-1;i++) {
//	if(employees[i+1]!=null)
//	employees[i]=employees[i+1];
//	else
//		employees[i]=null;