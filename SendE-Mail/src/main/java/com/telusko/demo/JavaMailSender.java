package com.telusko.demo;

import org.springframework.mail.SimpleMailMessage;

public interface JavaMailSender {

	void send(SimpleMailMessage message);

}
