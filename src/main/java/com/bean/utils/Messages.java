package com.bean.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Messages
{
    public void m1()
    {
        System.out.println("Default bean scope is,Singleton");
    }
}
