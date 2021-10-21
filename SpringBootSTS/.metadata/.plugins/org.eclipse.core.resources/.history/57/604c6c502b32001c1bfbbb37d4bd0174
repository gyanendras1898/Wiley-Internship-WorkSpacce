package com.piyush.database;

import com.piyush.beans.Course;

public class CourseDataBase {

	private static Course[] courses=new Course[5];

	static {
		courses[0]=new Course("C001", "JAVA", 20000, true, true);
		courses[1]=new Course("C002", "Spring", 30000, true, false);
		courses[2]=new Course("C003", "Hibernate", 25000, true, false);
		courses[3]=new Course("C004", "React JS", 40000, true, true);
		courses[4]=new Course("C005", "Angular JS", 50000, true, true);
		
	}
	public static Course[] getCourses() {
		return courses;
	}

	public static void setCourses(Course[] courses) {
		CourseDataBase.courses = courses;
	}
	
}
