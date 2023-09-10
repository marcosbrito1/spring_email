package com.ms.email.services;

import java.time.LocalDateTime;
import java.util.List;

import com.ms.email.enums.StatusEmail;
import com.ms.email.models.Email;
import com.ms.email.repositories.EmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public List<Email> listEmail(){
		List<Email> listProducts = emailRepository.findAll();
		return listProducts;
	}

    public Email sendEmail(Email email) {
        email.setDataEnvio(LocalDateTime.now());
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject(email.getTitulo());
            message.setText(email.getMensagem());
            message.setFrom(email.getEmailOrigem());
            message.setTo(email.getEmailDestino());
            emailSender.send(message);
        } catch (MailException ex) {
            email.setStatusEmail(StatusEmail.ERRO);
        } finally {
            return emailRepository.save(email);
        }
    }
}
