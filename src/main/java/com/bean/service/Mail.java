package com.bean.service;

import org.springframework.stereotype.Component;

@Component("phone")
public class Mail
{
    public void m1(String toMail)
    {
        System.out.println("Mail sent to "+toMail+" successfully");
    }
}
