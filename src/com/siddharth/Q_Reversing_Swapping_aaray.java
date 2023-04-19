package com.siddharth;

import java.util.Arrays;

public class Q_Reversing_Swapping_aaray {
    public static void main(String[] args) {


        int[] arr = { 2,4,6,8,9,10};

        System.out.println(Arrays.toString(arr));//original array
        swap(arr ,0 , 5);

        System.out.println(Arrays.toString(arr)); // swapped array

        reversing(arr);

        System.out.println(Arrays.toString(arr)); // reversed array

    }


       // known as 2 pointer method


    private static void reversing(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
         swap(arr,start,end); // swapping elements at position start & end
         start++;               //increment from startss
         end--;                 //decrement from last
        }
    }


    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
       arr[index1] = arr[index2];      // swapping  of two arrays elements
        arr[index2] = temp;
    }
}
