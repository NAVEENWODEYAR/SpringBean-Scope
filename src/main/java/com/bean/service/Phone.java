package com.bean.service;

import org.springframework.stereotype.Component;

@Component("phone")
public class Phone
{
    public void m1()
    {
        System.out.println("Changing to prototype scope,");
    }
}
