package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JourneyDaoImpl implements JourneyDao {

	
	@Override
	public boolean swipeIn(int cId, int sId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "insert into journey(cId, sId, dId) values ("+cId+","+sId+",-1);";
		
		int i = st.executeUpdate(query);
		
		con.close();
		
		if(i==1) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	@Override
	public boolean swipeOut(int cId, int dId, int fare) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "UPDATE journey SET dId= "+dId+", swipeOutTime=now(), fare="+fare+" WHERE cId="+cId+" order by swipeInTime desc limit 1;";
		
		int i = st.executeUpdate(query);
		
		if(i==1) {
			return true;
		}
		else {
			return false;
		}
	}



	@Override
	public int getSourceStation(int cId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "select sId from journey where cId="+cId+" order by swipeInTime desc limit 1;";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			return rs.getInt(1);
		}
		return 0;
	}



	@Override
	public int getFare(int cId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "select fare from journey where cId="+cId+" order by swipeOutTime desc limit 1;";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			return rs.getInt(1);
		}
		return 0;
	}



	@Override
	public boolean isJourneyOngoing(int cId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = " select cId from journey where cId="+cId+" and dId=-1 order by swipeInTime desc limit 1;";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			if (rs.getInt(1) == cId) {
			return true;
			}
		}
		return false;
	}



	@Override
	public boolean getDuration(int cId) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "SELECT TIMESTAMPDIFF(second, swipeInTime, swipeOutTime) from journey where cId="+cId+" order by swipeOutTime desc limit 1;";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			if (rs.getInt(1)>20) {
			return true;
			}
		}
		return false;
	}

}
