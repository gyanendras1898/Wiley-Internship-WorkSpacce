package com.gyan.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.beans.User;
import com.gyan.model.persistence.UserDao;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(User user) {
		String password = userDao.getPassword(user.getUserName());		
		return user.getPassword().equals(password);
	}

}
