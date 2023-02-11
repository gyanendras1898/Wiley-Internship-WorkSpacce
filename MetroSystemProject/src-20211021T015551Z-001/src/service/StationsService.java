package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Stations;

public interface StationsService {
	ArrayList<Stations> getStations() throws ClassNotFoundException, SQLException;
}
