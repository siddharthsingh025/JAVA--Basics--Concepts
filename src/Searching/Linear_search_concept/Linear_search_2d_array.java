package Searching.Linear_search_concept;

import java.util.Arrays;

public class Linear_search_2d_array {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4,5},
                {32,4,6,7,90,3,45,43},
                {332,43}
        };

        int target = 7;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {

        for (int row= 0; row < arr.length; row++) {

            //search for every element of each rows
            for (int col = 0; col < arr[row].length; col++) {


                if(target == arr[row][col])
                {
                    return new int[]{row,col};  // here we declare and initializing the array
                }
            }

        }

        return new int[]{-1 ,-1};// here we declare and initializing the array
    }
}
