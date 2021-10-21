package com.gyan.presentation;

import java.util.Scanner;

import com.gyan.beans.Card;
import com.gyan.service.MetroService;
import com.gyan.service.MetroServiceImpl;

public class MetroPresentationImpl implements MetroPresentation {
	Scanner sc=new Scanner(System.in);
	MetroService metroService=new MetroServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("1. Register new User");
		System.out.println("2. Log in");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			int chance=3;
			double balance;
			do {
				System.out.println("Enter Initail Balance");
				balance=sc.nextDouble();
				
				if(balance<100)
				System.out.println("Deposit Initial Balance of minimum 100 : "+(chance-1)+" remaining");
				
			}while(chance-->0);
			
			if(balance<100) {
				System.out.println("Thanks for using our System, kindly visit us again!");
				System.exit(0);
			}
			
			Card card=metroService.registerUser(balance);
				
			
			
			
			break;
		case 2:
			break;
		case 3:
			System.out.println("Thanks for using our System, kindly visit us again!");
			System.exit(0);
		default:
			System.out.println("Enter Valid Choice!");
			
		}

	}

}
