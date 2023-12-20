package com.bean.utils;

import org.springframework.cglib.core.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GetDate2 {
    static void getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:SS");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dtf.format(localDateTime));
    }

    static void getDate1()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public static void main(String[] args) {
        getDate();
        System.out.println("*************");
        getDate1();
    }
}
