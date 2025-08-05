package com.mailservice.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(String to, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);

		javaMailSender.send(message);
		System.out.println("Mail sent");
	}

	@Autowired
	private TemplateEngine templateEngine;

	public void sendMailWithAttachment(String to, String subject, String user) throws MessagingException {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true); // to add the attachments, use true
		
		Context context = new Context();
		context.setVariable("username", user);
		String body = templateEngine.process("welcome-page", context);
		
		mimeMessageHelper.setTo(to);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.setText(body,true); // if body contains html code then pass true
		
		mimeMessageHelper.addAttachment("java", new File("D:\\Downloads\\java.jpg"));
		javaMailSender.send(mimeMessage);
		System.out.println("Mail sent with template!");
	}

}
