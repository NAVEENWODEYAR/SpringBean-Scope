package com.debug;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("***********");
        var c = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of numbers="+c.add(a,b));
        System.out.println("Difference in numbers="+c.dif(a,b));
    }
}
