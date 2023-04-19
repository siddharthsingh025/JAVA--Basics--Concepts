package Leetcode_QNS;

import com.siddharth.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qns2 {


    public static void main(String[] args) {

        int[] num ={8,1,2,2,3};

        int[] ans = smallerNumbersThanCurrent(num);
        System.out.println(Arrays.toString(ans));

    }


    static public int[] smallerNumbersThanCurrent(int[] nums) {


       int[] answer = new int[nums.length];



        for (int i = 0; i <nums.length; i++) {

            int count =0;

            for (int j = 0; j <nums.length ; j++) {

                if(nums[i]>nums[j])
                {
                    count++;

                }
            }

            answer[i]=count;
        }

        return answer;
    }

}
