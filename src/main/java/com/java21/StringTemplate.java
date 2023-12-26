package com.java21;

import java.util.concurrent.atomic.AtomicBoolean;

import static java.lang.StringTemplate.STR;

public class StringTemplate {
    public static void main(String[] args) {
        System.out.println("StringTemplate in java 21");
        int a = 0;
        int b = 1;
        String st = "StringTemplate";
        AtomicBoolean bl = new AtomicBoolean(false);

        System.out.println(STR."value of a:\{a}");
        System.out.println(STR."value of b:\{b}");
        System.out.println(STR."value of st:\{st}");
        System.out.println(STR."value of bl:\{bl}");

    }
}
