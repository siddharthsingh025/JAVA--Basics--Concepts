package Sorting.CycleSort;

import static Sorting.SWAP.swap;

//// https://leetcode.com/problems/find-the-duplicate-number/


public class FindOneDuplicateNum {

    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,5};
            int n = findDuplicate(arr) ;
            System.out.println(n);
    }
     public  static int findDuplicate(int[] nums) {
         int i=0;
         while (i<nums.length) {

             if(i+1!=nums[i]) { // weather the current index has correct element or not , if not then proceed if yes then skip to next index

                 int index = nums[i] - 1;
                 if (nums[i] != nums[index]) {  // this will check weather the current element  and the element at correct index of current element is same or not ,
                                                  // if yes then its our duplicated element if not then swap it to its correct index.
                     swap(nums, i, index);

                 } else {
                     return nums[i];
                 }
             }

                 else {
                     i++;
                 }

         }

         return -1;
    }
}
