package Searching.Binary_search_concept;

import java.util.ArrayList;

public class Q_Find_in_Mountain {

    // https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {

       int[] array = {1,2,3,4,5,3,1};

       int target = 3;

       int result = search(array ,target);
        System.out.println(result);
    }

    static public int search(int[] arr , int target){

        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr , target , 0 , peak);
        if(firstTry != -1)
        {
            return firstTry;
        }
        else  // to search in 2nd half
        {
             return binarySearch(arr , target , peak , arr.length-1);
        }
    }

     static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =

    }



    static int binarySearch(int[] arr, int target , int start , int end){

        // check given array is in ascending or descending order

        boolean IsAsc = arr[start] > arr[end];

//loop for every level of comparison

        while(start<=end){

            //finding middle element

            int mid = start + (end - start)/2 ;


            if(arr[mid] == target)
            {
                // answer found return mid , if mid == target

                return mid;

            }


            if(IsAsc)
            {
                if(target < arr[mid])
                {

                    start = mid +1;

                }
                else if ( target > arr[mid])
                {
                    end = mid-1;
                }
            }

            else {

                if(target < arr[mid])
                {
                    end = mid-1;
                }
                else if ( target > arr[mid])
                {
                    start = mid +1;
                }

            }



        }


        return -1;
    }
}





