package com.bean.utils;

import java.time.LocalDate;
import java.util.Date;

public class GetDate1 {
    static void getDate()
    {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }
    public static void main(String[] args) {
        getDate();
    }
}
