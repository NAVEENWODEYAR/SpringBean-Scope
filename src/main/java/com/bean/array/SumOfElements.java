package com.bean.array;

public class SumOfElements
{
    static void sumOfElements(int arr[])
    {
        int sum = 0;
        for (int i=0; i<arr.length-1; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        System.out.println("*********");
        sumOfElements(new int[]{4,5,6,7,8,9});
    }
}
