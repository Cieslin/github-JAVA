package com.cieslin.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MockMailSender implements IMailSender {

    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending Mock mail to " + to
                + " \nwith subject " + subject
                + " \nand body " + body);
    }
}
