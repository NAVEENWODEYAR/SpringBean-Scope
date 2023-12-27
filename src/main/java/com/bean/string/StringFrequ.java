// How do you find frequency of each element in an array or a list?
package com.bean.string;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequ
{
    static void strFreq(List<String> list)
    {
            list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        System.out.println("****************");

        strFreq(Arrays.asList("One","Three","Two","One","Three"));
        strFreq(Arrays.asList("1","2","3","4","1","2"));
        strFreq(Arrays.asList("5.7","2.1","3.9","4","7.8","5.7"));
    }
}
