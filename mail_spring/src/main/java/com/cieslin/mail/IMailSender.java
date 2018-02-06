package com.cieslin.mail;

public interface IMailSender {

    void send(String to, String subject, String body);
}
