package com.mailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mailservice.service.EmailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class MailServiceApplication {

	public static void main(String[] args) throws MessagingException {
		ConfigurableApplicationContext app = SpringApplication.run(MailServiceApplication.class, args);

		EmailService emailService = app.getBean(EmailService.class);

		String to = "shivamsingh061100@gmail.com";
		String subject = "Test Subject";
		String body = "Hi! This is a test message";
		String user = "TestUser";

//		emailService.sendMail(to, subject, body);
		emailService.sendMailWithAttachment(to, subject, user);
	}

}
