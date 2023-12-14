package com.bean.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    static void binarySearch(int arr[], int left, int right, int element)
    {
        int mid = left+right / 2;

        while(left <= right) {
            if (arr[mid] < element) {
                left = mid + 1;
            } else if (arr[mid] == element) {
                System.out.println("Element found at the index," + mid);
                break;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
            }
            if (left > right)
            {
                System.out.println("Element not found,");
            }
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
        binarySearch(arr,0,arr.length-1,ele);
    }
}
