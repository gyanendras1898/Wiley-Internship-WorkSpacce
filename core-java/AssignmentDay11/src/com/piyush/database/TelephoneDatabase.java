package com.piyush.database;

import java.util.HashMap;

import com.piyush.beans.Customer;

public class TelephoneDatabase {
	
	private static HashMap<String,Customer> telephoneDB=new HashMap<>();
	private static Customer[] customers;
	
	static {
		customers=CustomerDatabase.getCustomers();
		telephoneDB.put("101", customers[0]);
		telephoneDB.put("103", customers[1]);
		telephoneDB.put("102", customers[0]);
		telephoneDB.put("103", customers[2]);
		telephoneDB.put("104", customers[3]);
	}

	public static HashMap<String, Customer> getTelephoneDB() {
		return telephoneDB;
	}

	public static void setTelephoneDB(HashMap<String, Customer> telephoneDB) {
		TelephoneDatabase.telephoneDB = telephoneDB;
	}
	
	

}
