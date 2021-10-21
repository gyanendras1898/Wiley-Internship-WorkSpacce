package com.piyush.database;

import java.util.ArrayList;

import com.piyush.beans.Course;

public class CourseDataBase {

	private static ArrayList<Course> courses=new ArrayList<>();

	static {
		courses.add (new Course("C001", "JAVA", 20000, true, true));
		courses.add(new Course("C002", "Spring", 30000, true, false));
		courses.add(new Course("C003", "Hibernate", 25000, true, false));
		courses.add(new Course("C004", "React JS", 40000, true, true));
		courses.add(new Course("C005", "Angular JS", 50000, true, true));
		
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		CourseDataBase.courses = courses;
	}
	
}
