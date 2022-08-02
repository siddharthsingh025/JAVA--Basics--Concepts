package Searching.Binary_search_concept;

public class Binary_search {

    //  let assume we have shorted array in ascending order , arr = [ 2,4,5,6,8,9,13,32,42,48]
    /*
        TARGET element = 32;

        + Algorithm +                    ( simply means steps taken in program )
        1. Find the middle  element ( initial + last / 2 )
        2. if target > middle => { search in the right side }
            else => { search in the left side }
        3. if middle element == target element // answer found

     */


    //  How binary search work ??
/*                                  ::  first star elem. will be 2 at 0 & last will be 48 at 9, then middle elem. = s+L/2 = 0+9/2= 4.5 = 4 that is 8
                                         { also check whether middle element is target elm or not } if Not then ,
                                         now program will check , whether target element (32) is > then middle element or not
                                            if Yes , then  it will search again on right side
                                               {   i.e.   now start elem. is 9 at 5 and last elem. is 48 at 9 , then middle elem . = 5+9/2 = 7 that is 32
                                                    // target found return 7th location
                                               }
                                            else {
                                                   search on left side same procedure
                                                  }

 */


    public static void main(String[] args) {

        int[] arr = { -21, -13 , -8 , 0 ,3 , 7 , 23 , 32 , 45 , 80 , 89 , 99 , 103 , 200 , 234 , 300 };
        int target = 99;

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
    return -1;
    }

}




/* *****************************************************************

           formula for finding total comparison binary search will make by number of elements  shorted array has

                      K = log( base 2) N ;

                                 also written as ::  K =  log N / log 2 ;
                                                     K = log N / 0.3010 ;


 ****************************************************************** */