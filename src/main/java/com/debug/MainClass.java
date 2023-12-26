package com.debug;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("***********");
        var c = new Calculator();   
        int a = 1;
        int b = 3;

        System.out.println("Sum of numbers="+c.add(a,b));
        System.out.println("Difference in numbers="+c.dif(a,b));
        System.out.println(c.getClass().toString());
    }
}
