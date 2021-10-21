package com.courses;

public class PythonCourse extends Course{
	
	public PythonCourse() {
		super("Python", 300d);
	}

	@Override
	String platform() {
		return "classroom delivered";
	}

	@Override
	String courseType() {
		return "part-time";
	}


}
