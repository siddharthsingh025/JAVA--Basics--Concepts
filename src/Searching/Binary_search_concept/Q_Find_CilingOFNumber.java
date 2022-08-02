package Searching.Binary_search_concept;

public class Q_Find_CilingOFNumber {

    /*
     + What do you mean my Ceiling of a Number?
        -> Smallest number that is greater than equal to target element

        ex: arr = { 3, 4, 8, 9, 14, 16 , 17 , 18 }
        if target is , tar= 15;

        then 16 is the number that is smallest no. that is greater than equal to target '15';

     */


    public static void main(String[] args) {

        int[] arr = { -21, -13 , -8 , 0 ,3 , 7 , 23 , 32 , 45 , 80 , 89 , 99 , 103 , 200 , 234 , 300 };
        int target = 232;

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
        return start;
    }

}
