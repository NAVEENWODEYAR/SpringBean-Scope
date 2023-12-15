package com.bean.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreq
{
    static void charFreq(String st)
    {
        Arrays.stream(st.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .forEach(System.out::print);
    }

    public static void main(String[] args)
    {
        System.out.println("/n Character frequency using Java8");
        charFreq("String");
        charFreq("Daily@");
    }
}
