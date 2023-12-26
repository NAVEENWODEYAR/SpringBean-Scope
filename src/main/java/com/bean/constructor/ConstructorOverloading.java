package com.bean.constructor;

public class ConstructorOverloading
{
    ConstructorOverloading()
    {
        this(1);
        System.out.println("Constructor:1");
    }
    ConstructorOverloading(int a)
    {
        System.out.println("Constructor:2");
    }
    public static void main(String[] args)
    {
        new ConstructorOverloading();
        new ConstructorOverloading(1);
    }
}
