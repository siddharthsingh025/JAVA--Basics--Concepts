package Leetcode_QNS;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class qns17 {

    public static void main(String[] args) {

       char[] letters = {'c','f','j'};

        System.out.println(nextGreatestLetter(letters,'d'));
    }

    static public char nextGreatestLetter(char[] letters, char target) {


        int start =0;
        int end = letters.length-1;

        //loop for every level of comparison

        while(start<=end){

            //finding middle element
//            int mid = (start + end ) / 2;                                                  // we don't use this formula because this may happen that the integer ( int ) value may be exceeded

            int mid = start + (end - start)/2 ;

            if(target < letters[mid])
            {
                end = mid-1;
            }
            else if ( target > letters[mid])
            {
                start = mid +1;
            }

            else
            {
                // answer found return mid , if mid == target

                return letters[mid+1];

            }

        }
        return letters[start];

    }
}
