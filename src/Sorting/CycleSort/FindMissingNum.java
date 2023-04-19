package Sorting.CycleSort;

import static Sorting.SWAP.swap;

public class FindMissingNum {


    // https://leetcode.com/problems/missing-number/
     // Amazon Question

    public static void main(String[] args) {
        int[] arr = {0,2,1,4};
       int n = missingNumber(arr);
        System.out.println(n);
    }

    public static int missingNumber(int[] nums) {

        int i=0;
        while (i<nums.length)
        {
            if( nums[i] < nums.length && nums[i] != nums[nums[i]])
            {
                swap(nums, i , nums[i]);
            }

            else
            {
                i++;
            }
        }

        for (int a = 0 ; a<nums.length ; a++) {

            if(a!=nums[a])
            {
                return a;
            }

        }

        return nums.length;
    }


}
