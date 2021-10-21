package com.gyan.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Transaction {
	
	private int number;
	private Card card;
	private int boardingStationNo;
	private String boardingTime;
	private int destinationStationNo;
	private String arrivalTime;
	private double fair;
	
}
