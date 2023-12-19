package com.bean.string;

public class Vowels
{
    public boolean strContainsVowels(String st)
    {
        return st.toLowerCase().matches(".*[aeiou].*");
    }
}
