package com.cieslin.controllers;

import com.cieslin.mail.IMailSender;
import com.cieslin.mail.MockMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private IMailSender mailSender = new MockMailSender();

    @RequestMapping("/mail")

    public String mail(){
        mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
        return "Mail sent";
    }
}
