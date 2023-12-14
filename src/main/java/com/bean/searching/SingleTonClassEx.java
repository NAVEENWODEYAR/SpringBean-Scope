package com.bean.searching;

public class SingleTonClassEx
{
    // static instance,
    private static SingleTonClassEx instance;

    // private constructor,
    private SingleTonClassEx()
    {

    }

    public static SingleTonClassEx getInstance()
    {
        if(instance == null)
        {
            instance = new SingleTonClassEx();
        }
        return instance;
    }

    public static void main(String[] args)
    {
        System.out.println("\n******");
        System.out.println(new SingleTonClassEx().hashCode());
        System.out.println(new SingleTonClassEx().hashCode());
    }
}
