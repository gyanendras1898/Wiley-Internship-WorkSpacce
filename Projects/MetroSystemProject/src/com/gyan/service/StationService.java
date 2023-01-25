package com.gyan.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gyan.beans.Station;

public interface StationService {
	ArrayList<Station> getStations() throws ClassNotFoundException, SQLException;

}
