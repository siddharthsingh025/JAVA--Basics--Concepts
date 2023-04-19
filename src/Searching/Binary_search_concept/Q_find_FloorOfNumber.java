package Searching.Binary_search_concept;

public class Q_find_FloorOfNumber {
    /*
     + What do you mean my Ceiling of a Number?
        -> the greatest number that is smaller than equal to target element

        ex: arr = { 3, 4, 8, 9, 14, 16 , 17 , 18 }
        if target is , tar= 15;

        then 14 is the number that is greatest  no. that is smaller than equal to target '15';

     */

    public static void main(String[] args) {

        int[] arr = { -21, -13 , -8 , 0 ,3 , 7 , 23 , 32 , 45 , 80 , 89 , 99 , 103 , 200 , 234 , 300 };
        int target = 90;

        //function calling
        int ans = binarySearch(arr , target);

        System.out.println( "Target found at index :: " + ans);
    }






    // function ::  Return Index if target found  else return -1

    static int binarySearch(int[] arr, int target){

        int start =0;
        int end = arr.length-1;

        //loop for every level of comparison

        while(start<=end){

            //finding middle element
//            int mid = (start + end ) / 2;                                                  // we don't use this formula because this may happen that the integer ( int ) value may be exceeded

            int mid = start + (end - start)/2 ;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if ( target > arr[mid])
            {
                start = mid +1;
            }

            else
            {
                // answer found return mid , if mid == target

                return mid;

            }

        }
        return end;
    }
}
