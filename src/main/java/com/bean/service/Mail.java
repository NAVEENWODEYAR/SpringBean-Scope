package com.bean.service;

import org.springframework.stereotype.Component;

@Component("phone")
public class Mail
{
    public void m1()
    {
        System.out.println("Changing to prototype scope,");
    }
    public void m2() {System.out.println("Changing to prototype scope,");}
}
