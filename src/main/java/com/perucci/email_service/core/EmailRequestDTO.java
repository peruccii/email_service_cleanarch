package com.perucci.email_service.core;

public record EmailRequestDTO(String to, String subject, String body) {
}
