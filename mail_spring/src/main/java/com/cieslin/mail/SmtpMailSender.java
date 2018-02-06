package com.cieslin.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class SmtpMailSender implements IMailSender {

    private static Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " + to
                + " \nwith subject " + subject
                + " \nand body " + body);
    }
}
