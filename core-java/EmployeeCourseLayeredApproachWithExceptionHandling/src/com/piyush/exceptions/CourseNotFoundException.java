package com.piyush.exceptions;

@SuppressWarnings("serial")
public class CourseNotFoundException extends Exception {

	public CourseNotFoundException(String message) {
		super(message);
	}
}
