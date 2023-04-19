package Leetcode_QNS;
//https://leetcode.com/problems/search-insert-position/

public class qns19 {

    public int searchInsert(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;

        if(nums[e]<target)
        {
            return nums.length;
        }

        while (s<=e)
        {
            int m = s + (e-s)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]>target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }

        return s+1;
    }

}
