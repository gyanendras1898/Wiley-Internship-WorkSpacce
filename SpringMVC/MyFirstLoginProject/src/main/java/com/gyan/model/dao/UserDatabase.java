package com.gyan.model.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Getter;


@Component
public class UserDatabase {
	
	private static Map<String, String> users = new HashMap<>();
	
	static {
		users.put("gyan","singh");
		users.put("gyanendra","singh");
		users.put("piyush", "singh");
	}
	
	public Map<String, String> getUsers(){
		return users;
	}

}
