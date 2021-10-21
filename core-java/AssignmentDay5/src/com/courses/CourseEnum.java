package com.courses;

public enum CourseEnum {
	
	JAVA("Java",500d,"Online","Full time"),PYTHON("Python",400d,"Online","part time"),
	ADVANCE_JAVA("Advance Java",999d,"Classroom","Full time");
	
	private String name;
	private double price;
	private String platform;
	private String courseType;
	
	private CourseEnum(String name, double price, String platform, String courseType) {
		this.name = name;
		this.price = price;
		this.platform = platform;
		this.courseType = courseType;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getPlatform() {
		return platform;
	}
	public String getCourseType() {
		return courseType;
	}


}
