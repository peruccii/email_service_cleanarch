package com.perucci.email_service.core;

public interface IEmailInterface {
    void sendEmail(String to, String subject, String body); // Void return nothing
    // TODO: sendEmail(Entity body)
}
