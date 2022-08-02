package Searching.Binary_search_concept;

public class Q_Split_Array_Largest_sum {
    public static void main(String[] args) {

        int[] arr = { 7 , 2, 5, 8 , 10};
        int m=2;
        int ans = splitArray(arr , m);

        System.out.println(ans);

    }

     static  public int splitArray(int num[] , int m){
        //initially our start and end will be 0
        int start = 0;
        int end = 0;
 //now we find two things , 1st :: max no. in array which was our minimum of range of potential answer
        //                         2nd :: sum of no. of array which will become our maximum of range of potential answer
        for (int i = 0; i < num.length; i++) {

            start = Math.max(start , num[i]);  // In the end of loop it will have our
            end = end+ num[i];
        }

        while (start < end){

            int mid = start + (end - start)/2;

            int sum =0;
            int pieces = 1 ;

            for (int n :num) {
                if(sum + n > mid){
                    //it means sum of array will exceed the limit of potential ans. that will be mid then , go for new array

                    sum = n;
                    pieces++;
                }
                else {
                    sum += n;
                }
            }

            /* now after this , we got our pieces then we check if our piece is less than equal to  m or not
               if yes , then  end = mid;
               if not then  start = mid +1;
             */

            if(pieces > m)
            {
                start = mid +1;
            }
            else {
                end = mid;
            }
        }

        return end ;
    }
}
