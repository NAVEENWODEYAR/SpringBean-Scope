package com.bean.debug;

public class MainDebugger {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a=2;
        int b=2;
        System.out.println("\nDebug Point");
        var add = c.add(a, b);
        var sub = c.sub(a, b);
        System.out.println(add+"-"+sub);
    }
}
