package com.bean;

import com.bean.utils.Messages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("\n The scientific name of common bean is Phaseolus vulgaris L");

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        var bean = context.getBean("bean", Messages.class);
        var bean1 = context.getBean("bean", Messages.class);
        System.out.println(bean.hashCode()+"=="+bean1.hashCode());
    }
}
