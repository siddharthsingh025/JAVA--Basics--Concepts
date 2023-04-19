package Recursion.Intro.sorts.MergeSort;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(Sort(arr)));
    }


    static int[] Sort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = Sort(Arrays.copyOfRange(arr,0,mid));   // it will create new object everytime
                                                                    // no change will take place with original array
        int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);


    }

    private static int[] merge(int[] first, int[] second) {

         int[] mix = new int[first.length + second.length];
         int i= 0 , j=0,k=0;

         while (i<first.length && j<second.length)
         {
             if(first[i]<second[j])
             {
                 mix[k] = first[i];
                 i++;
             }

             else
             {
                 mix[k] = second[j];
                 j++;
             }
             k++;
         }


         // any of them is still remaining then copy it all to mix
        // so only 1 of them will run
         while (i<first.length)
         {
             mix[k] = first[i];
             i++;
             k++;
         }

        while (j<second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }

return mix;
    }
}
