package com.piyush.database;

import com.piyush.beans.Address;
import com.piyush.beans.Customer;

public class CustomerDatabase {
	
	private static Customer[] customers=new Customer[4];

	static {
		Address address1=new Address("Varanasi","UP","India");
		Address address2=new Address("Delhi","Delhi","India");
		Address address3=new Address("Mumbai","Maharashtra","India");
		Address address4=new Address("Pune","Maharashtra","India");
		customers[0]=new Customer("Arun",address1);
		customers[1]=new Customer("Amit",address2);
		customers[2]=new Customer("Ankit",address3);
		customers[3]=new Customer("Anurag",address4);
		
	}

	public static Customer[] getCustomers() {
		return customers;
	}

	public static void setCustomers(Customer[] customers) {
		CustomerDatabase.customers = customers;
	}
	

}
