package Recursion.Intro.sorts;


import com.siddharth.Array;

import java.util.Arrays;

import static Sorting.SWAP.swap;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ar = { 4,3,2,1};

        sort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }



    static void sort(int[] arr, int r, int c)
    {
        if(r==0)
        {
            return;
        }

        if(r>c)
        {
            if(arr[c]>arr[c+1])
            {
                swap(arr,c,c+1);  // with every call we just create new reference variable to a same object so if we
                                            // swap elements via  a any reference variable then original object will change
                                            // that's why same array will get sorted after function calling
            }
            sort(arr,r,c+1);
        }
        else
        {
            sort(arr,r-1,0);
        }
    }

}
