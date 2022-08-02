package Sorting.CycleSort;

import java.util.ArrayList;
import java.util.List;

import static Sorting.SWAP.swap;



public class FindAllDuplicateNums {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        for (int i = 0; i < ans.size(); i++) {

            System.out.println(ans.get(i));
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {

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

        List<Integer> ans = new ArrayList<>(); // declaration of array list  ,
        // we are using this we didn't know the output of our array

        for (int a = 0 ; a<nums.length ; a++) {

            if(a+1!=nums[a])
            {
                ans.add(nums[a]);  // adding in our array list
            }

        }

        return ans;

    }
}
