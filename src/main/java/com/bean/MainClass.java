package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("\n The scientific name of common bean is Phaseolus vulgaris L");

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
                            context.getBean();
    }
}
