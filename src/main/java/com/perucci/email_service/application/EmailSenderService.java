package com.perucci.email_service.application;

import com.perucci.email_service.adapter.EmailSenderGateway;
import com.perucci.email_service.core.IEmailInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements IEmailInterface {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired // constructor
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }

    @Override // methods
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
