package Leetcode_QNS;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class qns11 {

    public static void main(String[] args) {
        int[] ar = {2, 3, 4};
        System.out.println(Arrays.toString(twoSum(ar, 6)));
    }

    static public int[] twoSum(int[] numbers, int target) {

        int i = 0, mid = 0;

        for (; i < numbers.length; i++) {
            int one = numbers[i];
            int s = i + 1;
            int e = numbers.length - 1;

            while (s <= e) {
                mid = s + (e - s) / 2;

                if (one + numbers[mid] == target) {
                    break;
                } else if (one + numbers[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            }
            if (one + numbers[mid] == target) {
                break;
            }
        }

        return new int[]{i+1,mid+1};
    }
}
