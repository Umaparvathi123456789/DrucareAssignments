package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEMailApplication {
	@Autowired(required=false) 
	private SenderService senderService;
	

	public static void main(String[] args) {
		SpringApplication.run(SendEMailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendmail(String body, String eMail, String subject) {
		senderService.sendEmail(eMail, body, subject);
	}

}
