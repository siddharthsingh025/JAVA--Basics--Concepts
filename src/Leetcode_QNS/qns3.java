package Leetcode_QNS;

import java.util.Arrays;
public class qns3 {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4} ;
        int[] index = { 0,1,2,2,1};
        System.out.println(
                Arrays.toString(createTargetArray(arr,index))
        );
    }

   static public int[] createTargetArray(int[] nums, int[] index) {


        for (int i = 0; i < nums.length; i++) {

            int first = i;
            int second = index[i];

            if(first!=second)
            {
             while (first!=second)
             {

                 if(first<second)
                 {
                     swap(nums,first, first+1);
                     first++;
                 }

                 else
                 {
                     swap(nums,first, first-1);
                     first--;
                 }
             }

            }

        }

        return nums;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
