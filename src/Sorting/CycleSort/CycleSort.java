package Sorting.CycleSort;

import java.util.Arrays;

import static Sorting.SWAP.swap;

public class CycleSort{
    public static void main(String[] args) {

        int[] arr = { 3,2,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void cyclicSort(int[] arr)
    {

        int i =0;
       while (i<arr.length) {

           int index = arr[i]-1;
           if(arr[i] != arr[index])     // if ( arr[i] != arr[index]
                                                                      // i!= index ( this will not work with duplicates
           {
               swap(arr ,i , index);

           }

           else {
               i++;
           }
       }

    }



}

