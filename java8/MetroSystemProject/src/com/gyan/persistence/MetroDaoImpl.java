package com.gyan.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.gyan.beans.Card;

public class MetroDaoImpl implements MetroDao {

	@Override
	public boolean addUser(Card card) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_system_db","root","admin");
		
		return false;
	}

	@Override
	public boolean checkIn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double checkOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
	}


	
}
