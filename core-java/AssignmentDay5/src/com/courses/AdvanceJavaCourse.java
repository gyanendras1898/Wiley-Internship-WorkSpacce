package com.courses;

public class AdvanceJavaCourse extends Course{
	
	public AdvanceJavaCourse() {
		super("Advance Java", 999d);
	}

	@Override
	String platform() {
		return "classroom delivered";
	}

	@Override
	String courseType() {
		return "full-time";
	}


}
