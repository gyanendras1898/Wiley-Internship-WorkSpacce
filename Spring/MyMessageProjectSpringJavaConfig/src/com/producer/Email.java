package com.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("email")
public class Email implements Message {
	
	private String senderMail;
	private String receiverMail;

	public Email(@Value("sender@gmail.com")String senderMail,@Value("receiver@gmail.com") String receiverMail) {
		super();
		this.senderMail = senderMail;
		this.receiverMail = receiverMail;
	}


	@Override
	public void send() {
		System.out.println("Sending mail from "+senderMail+" to "+receiverMail);

	}

}
