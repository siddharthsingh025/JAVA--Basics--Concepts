package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort{



    /*   here array is divided in two part first one is sorted that is LHS and another one is unsorted that is RHS ,
    here first we sorted LHS or you can say in first pass ,first pair of two nums get sorted and make a small LHS array that is sorted ,
    now element from RHS is inserted in LHS by comparing with all element to its right position in sorted array

       1. [ 3 , 1, 5 , 4 ,2 ]    //  now here first 3 and 1 will compare and then get sorted like  [ 1 , 3, 5 , 4 ,2 ]  in first pass
                                //now in second pass we have LHS that is 1,3 in sorted manner so now we take 3rd element and
                                // insert it between LHS array on its correct position by comparing it with all element like
                                // our 3rd element is now j then 2nd element is j-1 and if j<j-1 then swap will occur , if it is not then break; occur and next element to j will be our new j

     */
    public static void main(String[] args) {
        int[] arr = { 3,1,5,4,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}



/*
      +time complexity +

      Best Case : O(N)-linear = Array is already sorted                         // N is length of array  and input in O(N) is no. of comparison
      Worst Case : O(N^2) = Sorted in descending


 */




/*
      +Why use it +

      - Adaptive : steps get reduced if array is sorted , No. of swaps reduced as compared to bubble sort.
      - Stable sorting
      - Used for smaller value of N
      - Work good when array is partially sorted
      - also takes part in hybrid sorting algorithm


 */