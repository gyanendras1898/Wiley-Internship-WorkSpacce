package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Stations;

public class StationsDaoImpl implements StationsDao {

	@Override
	public ArrayList<Stations> getStations() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st = con.createStatement();
		
		String query = "select * from stations;";
		
		ResultSet rs = st.executeQuery(query);
		
		ArrayList<Stations> stations = new ArrayList<Stations>();
		while(rs.next()) {
			
			int sId = rs.getInt("sId");
			String sName = rs.getString("sName");
			
			Stations station = new Stations(sId, sName);
			stations.add(station);
		}
		con.close();
		
		
		return stations;
	}

}
