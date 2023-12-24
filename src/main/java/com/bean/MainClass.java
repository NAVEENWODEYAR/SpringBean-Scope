package com.bean;

import com.bean.entity.Student;
import com.bean.service.Phone;
import com.bean.utils.Messages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("\n The scientific name of common bean is Phaseolus vulgaris L");

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        var bean = context.getBean("msg", Messages.class);
        var bean1 = context.getBean("msg", Messages.class);

        var bean2 = context.getBean("phone", Phone.class);
        var bean2a = context.getBean("phone", Phone.class);
        System.out.println(bean.hashCode()+"=="+bean1.hashCode());
        System.out.println(bean2.hashCode()+"=="+bean2a.hashCode());

        System.out.println("***********");
        var bean3 = context.getBean("stu", Student.class);
        var bean3a = context.getBean("stu", Student.class);
        System.out.println(bean3.hashCode()+"=="+bean3a.hashCode());
        System.out.println(Thread.currentThread());
    }
}
