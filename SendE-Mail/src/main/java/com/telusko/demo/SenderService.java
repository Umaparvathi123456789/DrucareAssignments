package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SenderService {
@Autowired(required=false)
private JavaMailSender mailSender;

public void sendEmail(String eMail, String body, String subject) {
SimpleMailMessage message=new SimpleMailMessage();
message.setFrom("umaveerapeni@gmail.com");
message.setTo(eMail);
message.setText(body);
message.setSubject(subject);
mailSender.send(message);
System.out.println("mail sent sucessfully....");
}

}
