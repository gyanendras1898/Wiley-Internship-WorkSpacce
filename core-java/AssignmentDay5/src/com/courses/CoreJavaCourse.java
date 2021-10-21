package com.courses;

public class CoreJavaCourse extends Course{
	
	public CoreJavaCourse() {
		super("Core Java", 500d);
	}

	@Override
	String platform() {
		return "online";
	}

	@Override
	String courseType() {
		return "full-time";
	}


}
