package Leetcode_QNS;

import java.util.LinkedList;
//https://leetcode.com/problems/kth-missing-positive-number/submissions/

public class qns18 {

    static public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while(start < end){
            int mid = start + ((end - start)/2);

            int x= arr[mid] - (mid  + 1);
            if(x>= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start + k ;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11},5));
    }
}


//  for(int i=0;i<arr.length;i++)
//        {
//            int x=arr[i]-(i+1);
//            if(x>=k)
//                return i+k;
//        }
//        return arr.length+k;


