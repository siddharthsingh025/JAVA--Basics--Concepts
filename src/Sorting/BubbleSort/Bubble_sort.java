package Sorting.BubbleSort;

import java.util.Arrays;

public class Bubble_sort {
    /*
    1. [ 3 , 1, 5 , 4 ,2 ] ->  [ 1 ,3 , 5 , 4 ,2 ] ->  [ 1 ,3 , 4 , 5 ,2 ] ,  [ 1 ,3 , 4 , 2 ,5 ]
                //with the first pass through the array , the largest element came to end

    2. [ 1 ,3 , 4 , 2 ,5 ] -> [ 1 ,3 , 2 , 4 ,5 ]
                //with pass no. 2  , 2nd  largest element is at the 2nd from last index

                .......continue

                // also known as SYNCING short or EXCHANGE short

     */

    public static void main(String[] args) {

//        int[] arr = { 3,1,5,4,2};
        int[] arr = { 4,9,8,2};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(bubble(arr));
    }
//
//    static void bubble(int[] arr) {
//        boolean swapped;
//        // run the steps n-1 times
//        for (int i = 0; i < arr.length; i++) {
//            swapped = false;
//            // for each step, max item will come at the last respective index
//            for (int j = 1; j < arr.length - i; j++) {
//                // swap if the item is smaller than the previous item
//                if (arr[j] < arr[j - 1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                    swapped = true;
//                }
//            }
//            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
//            if (!swapped) { // !false = true
//                break;
//            }
//
//        }
//    }



    static int bubble(int[] arr) {
        boolean swapped;
        int x=0;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                    x++;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }

        }

        return x;
    }



}




/*
      +time complexity +

      Best Case : O(N) = sorted                         // N is length of array  and input in O(N) is no. of comparison
      Worst Case : O(N^2) = Sorted in opposite


 */