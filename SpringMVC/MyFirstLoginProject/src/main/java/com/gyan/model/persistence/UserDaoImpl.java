package com.gyan.model.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gyan.model.dao.UserDatabase;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserDatabase userDatabase;
	@Override
	public String getPassword(String userName) {
		String password = userDatabase.getUsers().getOrDefault(userName, null);
		return password;
	}

}
