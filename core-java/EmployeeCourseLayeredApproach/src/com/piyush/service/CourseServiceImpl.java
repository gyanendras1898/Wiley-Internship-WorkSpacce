package com.piyush.service;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;
import com.piyush.persistence.CourseDao;
import com.piyush.persistence.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao=new CourseDaoImpl();
	
	@Override
	public Course[] getAllCoursesForEmployee() {
		
		return courseDao.getAllCourses();
	}

	@Override
	public boolean registerEmployeeForCourse(String cId,Employee employee) {
		return courseDao.addEmployeeForCourseId(cId, employee);
	}

	@Override
	public boolean deregisterEmployeeForCourse(String cID,Employee employee) {
		return courseDao.removeEmployeeCourseId(cID, employee);
	}

	@Override
	public Employee[] listOfEmployeesForCourse(String cID) {
		return courseDao.searchCourseById(cID).getEmployees();
	}

}
