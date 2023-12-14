package com.bean.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1
{
    // binary Search using recursion,
    static int binarySearch(int arr[], int left, int right, int element)
    {
        if(right >= left)
        {
            int mid = left + (right-left)/2;
            if (arr[mid] == element)
                return mid;

            if(arr[mid] > element)
                return binarySearch(arr,0,mid-1,element);
            else
                return binarySearch(arr,mid+1,right,element);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println("\n Data has to be in sorted order before Binary search,");
        int arr[] = {5,2,3,6,8,1};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to search,");
        int ele = sc.nextInt();

        var i = binarySearch(arr, 0, arr.length - 1, ele);

        if(i == -1)
            System.out.println("Element not found,");
        else
            System.out.println("Element found at index,"+i);
    }
}
