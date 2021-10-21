package com.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sms")
public class SMS implements Message {
	
	private long senderNo;
	private long receiverNo;
	
	

	public SMS(@Value("1234567890") long senderNo,@Value("0987654321") long receiverNo) {
		super();
		this.senderNo = senderNo;
		this.receiverNo = receiverNo;
	}



	@Override
	public void send() {
		System.out.println("Sending sms from "+senderNo+" to "+receiverNo);

	}

}
