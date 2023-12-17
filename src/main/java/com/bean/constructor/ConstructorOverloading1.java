package com.bean.constructor;

public class ConstructorOverloading1
{
    ConstructorOverloading1()
    {
        this(1);
        System.out.println("Constructor:1");
    }

    ConstructorOverloading1(int a)
    {
        System.out.println("Constructor:2");
    }

    ConstructorOverloading1(boolean b)
    {
        System.out.println("Constructor:3");
    }

    public static void main(String[] args)
    {
        new ConstructorOverloading1();
//        new ConstructorOverloading(1);
        System.out.println(new ConstructorOverloading1(true).hashCode());
    }
}
