package com.gyan.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CardDaoImpl implements CardDao {

	@Override
	public int addCard(double balance) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_system_db","root","admin");
		
		String query = "insert into cards values (?,?);";
		
		PreparedStatement ps = connection.prepareStatement(query); 
		ps.setDouble(2, balance);
		int i=ps.executeUpdate();
		
		if(i==1)
			return lastCardAdded();
		return -1;
	}

	@Override
	public int viewBalance(int cardId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addBalance(int cardId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCardPresent(int cardId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void allCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public int lastCardAdded() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_system_db","root","admin");
		
		Statement statement = connection.createStatement();
		
		String query = "select cId from card order by registered_on desc limit 1;";
		
		
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) {
			
			return rs.getInt(1);
		}
		return 0;
	}

}
