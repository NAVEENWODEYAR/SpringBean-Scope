package com.debug;

public class Calculator {
    public int add(int a, int b){
        System.out.println("Addition,");
        return a+b;
    }

    public int dif(int a, int b){
        System.out.println("Difference,");
        return a-b;
    }

    @Override
    public String toString() {
        return "@Override";
    }
}
