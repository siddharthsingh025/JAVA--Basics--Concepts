package Searching.Binary_search_concept;

public class Q_InfiniteArray_search {

    public static void main(String[] args) {

        int []  arr = { 3 , 5 , 7 , 9 , 10 , 90 , 100 , 130 , 140 , 160 , 170};
        int target = 10;
        System.out.println(ans(arr , target));
        
    }


    /*

    below we check whether the target is greater than current end element or not ,
     if yes then loop will proceed else we get out of loop and our new start and end will assign

     Q : how start and end will decide?
     --> start will always be the next element to previous end , so it will be " end + 1"
     --> end will be , previous end + twice of ( size of previous considered array ) .i.e. , end = end + 2 * ( end-start +1)

      when loop is terminate it means our target  is less than our end so ,
      now it's time to use BINARY SEARCH for our " new _ Final _sorted _ array "
      then , our new array start, end and target are passes to Binary search FUNCTION, and we get our location of target after this
      HERE we don't use any length of array Function so , every function of this Program will infinite array.


     */
    static int ans(int[] arr , int target){
        //first find the range
        // first start with a box of size 2

        int start =0;
        int end = 1;

        // condition for the target to lie in the range
        while( target> arr[end])
        {
            int temp = end +1;

            //double the box value

            end = end + (end - start +1) * 2;   // end = previous end + (  sizeOfBox ) *2 ;
            start = temp;

        }

        return binarySearch(arr , target , start , end);

    }

    static int binarySearch(int[] arr , int target , int start , int end ){

        while(start<=end){

            //finding middle element
//            int mid = (start + end ) / 2;                          // we don't use this formula because this may happen that the integer ( int ) value may be exceeded

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
