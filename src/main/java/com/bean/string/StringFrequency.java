package com.bean.string;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency
{
    static void charFreq(String st)
    {
        char[] ch = st.toLowerCase().toCharArray();
        Map<Character,Integer> hm = new HashMap<>();

        for (char c:ch)
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
                hm.put(c,1);
        }
        System.out.println(hm);
    }

    public static void main(String[] args)
    {
        System.out.println("\n Frequency of String");
    }
}
