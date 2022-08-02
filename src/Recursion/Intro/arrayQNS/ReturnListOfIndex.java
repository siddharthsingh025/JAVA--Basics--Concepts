package Recursion.Intro.arrayQNS;

import java.util.ArrayList;

public class ReturnListOfIndex {

    public static void main(String[] args) {

        int[] ar = {23,45,7,89,23,9,90,100,9,2,9,3};
ArrayList<Integer> ans = findNum(ar,9,0,new ArrayList<>());
        System.out.println(ans);

    }


    static ArrayList<Integer> findNum(int[] arr , int target , int index , ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==target)
        {
            list.add(index);
        }

        return findNum(arr,target,index+1,list);
    }


    // without using arraylist as argument

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
