package Sorting.CycleSort;

//// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

import static Sorting.SWAP.swap;

public class Missmatch {

    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }


    public  static int[] findErrorNums(int[] nums) {

        int i =0;
        while (i<nums.length) {

            int index = nums[i]-1;
            if( nums[i] != nums[index])
            {
                swap(nums ,i , index);

            }

            else {
                i++;
            }
        }


        //just find missing number
//        int[] arr = new int[2];

        for (int a = 0 ; a<nums.length ; a++) {

            if(a+1!=nums[a])
            {
               // adding in our array
//                arr[0]=nums[a];    //  new int[] { nums[a],a+1} ;
//                arr[1]=a+1;

                return new int[] { nums[a],a+1} ;
            }

        }

        return new int[] { -1,-1};

    }

    }
