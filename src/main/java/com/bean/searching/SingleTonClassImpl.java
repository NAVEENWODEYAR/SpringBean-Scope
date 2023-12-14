package com.bean.searching;

public class SingleTonClassImpl
{
    public static void main(String[] args)
    {
        System.out.println("\n******");
//        System.out.println(new SingleTonClassEx().hashCode());

        SingleTonClassEx s = SingleTonClassEx.getInstance();
        SingleTonClassEx s1 = SingleTonClassEx.getInstance();
        SingleTonClassEx s2 = SingleTonClassEx.getInstance();
        SingleTonClassEx s3 = SingleTonClassEx.getInstance();

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
