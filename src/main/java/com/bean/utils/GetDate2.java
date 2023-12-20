package com.bean.utils;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GetDate2 {
    static void getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dtf.format(localDateTime));
    }
    public static void main(String[] args) {
        getDate();
    }
}
