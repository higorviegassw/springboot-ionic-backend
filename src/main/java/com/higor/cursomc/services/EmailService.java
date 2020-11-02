package com.higor.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.higor.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
