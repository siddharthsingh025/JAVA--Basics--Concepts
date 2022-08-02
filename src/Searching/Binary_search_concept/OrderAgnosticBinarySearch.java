package Searching.Binary_search_concept;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = { -21, -13 , -8 , 0 ,3 , 7 , 23 , 32 , 45 , 80 , 89 , 99 , 103 , 200 , 234 , 300 };
        int[] arr2 = { 454 , 300 , 200 , 99 , 88 , 46 , 36 , 20 , 9 , 0 , -2 , -9};
        int target = 99;

        //function calling
        int ans = binarySearch(arr , target);
        int ans2 = binarySearch(arr2 , target);

        System.out.println( " ASCENDING :: Target found at index :: " + ans);
        System.out.println( " DESCENDING :: Target found at index :: " + ans2);

    }







    static int binarySearch(int[] arr, int target){

        int start =0;
        int end = arr.length-1;



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
