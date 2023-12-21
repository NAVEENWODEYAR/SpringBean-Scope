package com.bean.string;

import java.util.Arrays;

public class Anagram
{
    static void anagramTest(String st, String st2)
    {
        char[] s = st.toLowerCase().toCharArray();
        char[] s1 = st2.toLowerCase().toCharArray();

        Arrays.sort(s);
        Arrays.sort(s1);

        var equals = Arrays.equals(s, s1);
        System.out.println(equals);
    }
    public static void main(String[] args)
    {
        System.out.println("\n two strings are considered anagrams if they have the same characters with the same frequency, " +
                "but the order of the characters may be different.");

        anagramTest("String","String");
        anagramTest("anagram","sangram");
        anagramTest("keep","peek");
        anagramTest("debug","bedbug");
    }
}
