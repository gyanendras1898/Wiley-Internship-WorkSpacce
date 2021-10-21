package com.piyush.persistance;

import java.util.HashMap;

import com.piyush.beans.Customer;
import com.piyush.database.CustomerDatabase;
import com.piyush.database.TelephoneDatabase;

public class TelephoneDirectoryDao {
	
	private HashMap<String,Customer> telephoneDirectory;
	

	public TelephoneDirectoryDao() {
		super();
		this.telephoneDirectory=TelephoneDatabase.getTelephoneDB();
	}
	
	public Customer search(String phnNo) {
		Customer customer=telephoneDirectory.get(phnNo);
		return customer;
	}
	
	public boolean addTelephone(String phNo, Customer customer) {
		telephoneDirectory.put(phNo, customer);
		return true;
	}
	
	public boolean deleteRecord(String phNo) {
		telephoneDirectory.remove(phNo);
		return true;
	}
	
	

}
