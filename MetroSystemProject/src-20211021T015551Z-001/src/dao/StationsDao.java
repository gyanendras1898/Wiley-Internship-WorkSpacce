package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Stations;

public interface StationsDao {
	ArrayList<Stations> getStations() throws ClassNotFoundException, SQLException;
}
