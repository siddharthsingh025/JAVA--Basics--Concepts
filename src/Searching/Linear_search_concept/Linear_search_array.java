package Searching.Linear_search_concept;

import java.util.Arrays;

public class Linear_search_array {

    // QUES:: Search in the array :: return the index if  target found
    //         otherwise  if target not found return -1


    public static void main(String[] args) {

     int[] arr = { 22, 4 , 65, 8, 50, 23, 454, 7, 30 , 46 , 15 , 34};
     String srt = "siddharth";
     int target1= 15;
      char target2 = 'h';
      int ans = linear_search_array(arr,target1);
      boolean ANS = liner_search_string(srt,target2);
        System.out.println(ans);
        System.out.println(ANS);


        // *********************************************************************************************************************
        System.out.println(Arrays.toString(srt.toCharArray()));
        /*
           output of above statement ::
                                         [s, i, d, d, h, a, r, t, h]

         */
        // *********************************************************************************************************************
    }





    //Function for linear search in array

    static int linear_search_array(int[] array, int target ){
        if(array.length == 0){
            return -1;
        }

        else {

            //for loop
            for (int index = 0; index < array.length; index++) {

                    // check for element at every index of given array
                if(array[index]== target)
                {
                    return index;
                }

            }

        }

        // if none of the above returns run then it means target not found || then return -1
        return -1;
    }




    //Function for linear search in string

    static boolean liner_search_string(String sr , char target){

        if(sr.length() == 0)
        {
            return false;
        }

        else
        {
            for (int i = 0; i < sr.length(); i++) {

                if(target==sr.charAt(i)){
                    return true;
                }

            }
        }
        return false;
    }

}
