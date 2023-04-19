package Sorting.SelectionSort;

import java.util.Arrays;

public class Selection_short {


    /*
         [4 ,5,1,2,3] ->  [4 ,3,1,2,5]  ->   [2 ,3,1,4,5]  ->  [2 ,1,3,4,5]  ->  [1 ,2,3,4,5]

         here , every time we find maximum element of current array and put it at its correct position like ,
         first we find max element within given array length and then swap it with last index of particular array
         and so on until we get our sorted array

     */
    public static void main(String[] args) {

        int[] arr = { 3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}



/*
      +time complexity +

      Best Case : O(N^2)                        // N is length of array  and input in O(N) is no. of comparison
      Worst Case : O(N^2)
      stable = NO


 */
