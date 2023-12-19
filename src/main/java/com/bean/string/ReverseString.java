package com.bean.string;

public class ReverseString
{
    static String stReverse(String st)
    {
        return new StringBuffer(st).reverse().toString();
    }

    public static void main(String[] args)
    {
        System.out.println("\n Reversing String");
        var string = stReverse("String");
        System.out.println(string);
        System.out.println("*********");
        var string1 = new Vowels().strContainsVowels("string");
        System.out.println(string1);
    }
}
