package com.bean.inherit;

import java.lang.reflect.Array;
import java.util.List;

public final class D extends B
{
    static int i;
    static float f;
    static boolean b;
    static char ch;
    static Array[] ar;
    static List<Object> lst;

    public static void main(String[] args)
    {
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(ar);
        System.out.println(new D());
        System.out.println(lst);
    }
}
