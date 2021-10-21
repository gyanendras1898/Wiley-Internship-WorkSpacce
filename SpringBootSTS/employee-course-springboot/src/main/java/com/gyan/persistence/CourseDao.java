package com.gyan.persistence;

import com.gyan.beans.Course;
import com.gyan.beans.Employee;

public interface CourseDao {
	
	Course[] getAllCourses();
	Course searchCourseById(String cId);
	boolean addEmployeeForCourseId(String cID,Employee employee);
	boolean removeEmployeeCourseId(String cID, Employee employee);

}
