package Recursion.Intro.sorts.MergeSort;

import java.util.Arrays;

public class MergeSort_InPlace {


    public static void main(String[] args) {

        int[] arr = {3,2,1};
        SortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void SortInplace(int[] arr , int s , int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid =(s+e)/2;

      SortInplace(arr,s,mid);
      SortInplace(arr,mid,e);

       mergeInPlace(arr,s,mid,e);

    }

     static void mergeInPlace(int[]arr, int s, int mid,int e) {

        int[] mix = new int[e-s];
            int i= s,
                j= mid,
                k= 0;

        while (i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k] = arr[i];
                i++;
            }

            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }


        // any of them is still remaining then copy it all to mix
        // so only 1 of them will run
        while (i<mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<e)
        {

            mix[k] = arr[j];
            j++;
            k++;
        }

        // till now , we get our sorted merged array in mix now what we have to day is that , we replace our mix array within
         // the range of array we have now that is s to e we get

        for (int l = 0; l < mix.length; l++) {

            arr[s+l]  = mix[l];   //here we are replaced our original array from s by elements of sorted array we have as mix
        }

        // after this now our array is sorted the range of s to e we have
         }
}
