package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Card;

public class CardDaoImpl implements CardDao {

	
	@Override
	public boolean addCard(Card card) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		//String query = "insert into card(cBalance) values ("+card.getcBalance()+");";
		//int i = st.executeUpdate(query);	
		
		String query = "insert into card(cBalance) values (?);";
		
		PreparedStatement ps = con.prepareStatement(query); 
		ps.setInt(1, card.getcBalance());
		int i=ps.executeUpdate();
		
		if(i==1) {
			return true;
		}
		else {
			return false;
		}

	}

	
	
	@Override
	public int viewBalance(int cId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "select cBalance from card where cId=?;";
		
		PreparedStatement ps = null;
		
		ps = con.prepareStatement(query);
		ps.setInt(1, cId);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			
			return rs.getInt(1);
		}
		return 0;
		
		
//		ResultSet rs = st.executeQuery(query);
//		
//		while(rs.next()) {
//			
//			return rs.getInt(1);
//		}
//		return 0;
		
	}

	@Override
	public boolean addBalance(int cId, int amount) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		//String query = "update card set cbalance="+ amount +" where cid="+cId+"";
		
		String query = "update card set cbalance=? where cid=?";
		PreparedStatement ps = null;
		
		ps = con.prepareStatement(query);
		ps.setInt(1, amount);
		ps.setInt(2, cId);
		
		
		int i = ps.executeUpdate();
		
		if(i==1) {
			return true;
		}
		else {
			return false;
		}
	}



	@Override
	public boolean isCardPresent(int cId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = " select cId from card where cId=?;";
		
		PreparedStatement ps = null;
		
		ps = con.prepareStatement(query);
		ps.setInt(1, cId);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			if (rs.getInt(1) == cId) {
			return true;
			}
		}
		return false;
	}



	@Override
	public int viewCardId() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "select cId from card order by createdOn desc limit 1;";
		
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			return rs.getInt(1);
		}
		return 0;
	}

}
