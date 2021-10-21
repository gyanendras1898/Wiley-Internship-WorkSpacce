package com.piyush.client;

import java.util.Scanner;

import com.piyush.presentation.TelephoneDirectoryPresentation;

public class TelephoneMain {
	
	public static void main(String args[]) {
		TelephoneDirectoryPresentation telephonePresentation=new TelephoneDirectoryPresentation();
		Scanner sc=new Scanner(System.in);
		while(true) {
			telephonePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			telephonePresentation.performMenu(choice);
		}
			
	}

}
