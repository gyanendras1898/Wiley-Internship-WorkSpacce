package service;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.Stations;
import dao.StationsDao;
import dao.StationsDaoImpl;

public class StationsServiceImpl implements StationsService {
	
	private StationsDao stationsDao = new StationsDaoImpl();

	@Override
	public ArrayList<Stations> getStations() throws ClassNotFoundException, SQLException {
		return stationsDao.getStations();
	}

}
