package Leetcode_QNS;

import java.util.ArrayList;

public class qns1 {

    public static void main(String[] args) {


        int[] arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }


    public  static int numIdenticalPairs(int[] nums) {

       int count =0;

        for (int i=0;i<=nums.length-2;i++)

        {


            for (int j=i+1;j<=nums.length-1;j++)
            {
                if(i<j && nums[i]==nums[j])
                {
                    ++count;
                }


            }
        }

        return count;
    }
}
