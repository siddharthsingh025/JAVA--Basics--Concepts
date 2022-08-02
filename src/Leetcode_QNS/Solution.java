package Leetcode_QNS;

import java.util.ArrayList;
import java.util.List;

class Solution {


    public static void main(String[] args) {
        int[] can = { 2,3,5,1,3};
        int extra = 3;
        List<Boolean> ans = kidsWithCandies(can,extra);
        for (int i = 0; i < ans.size(); i++) {

            System.out.println(ans.get(i));
        }
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int i=0 , max=getmax(candies);

        while (i<candies.length)
        {
            if(candies[i]+extraCandies>=max)
            {
                list.add(true);
            }
            else {
                list.add(false);
            }
            i++;
        }
        

        return list;
    }


    static int getmax(int[] arr)
    {
        int max = Integer.MIN_VALUE , i=0;

        while (i<arr.length)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            i++;
        }
        return max;
    }


}