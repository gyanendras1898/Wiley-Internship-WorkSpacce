package com.gyan.service;

import com.gyan.beans.Course;
import com.gyan.beans.Employee;
import com.gyan.persistence.CourseDao;
import com.gyan.persistence.CourseDaoImpl;

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
