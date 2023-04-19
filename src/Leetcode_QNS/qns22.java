package Leetcode_QNS;

import java.util.Arrays;

//https://leetcode.com/problems/search-a-2d-matrix/submissions/

public class qns22 {
        public static void main(String[] args) {
            int [][] array = {
                    {10 , 20 , 30 , 40},
                    {11 , 25 , 35 , 45},
                    {28 , 29 , 37 , 49},
                    {33 , 34 , 38 , 50}
            };

            boolean ans = searchMatrix(array , 37);
            System.out.println(ans);

        }


   static public boolean searchMatrix(int[][] matrix, int target)
    {
        int r =0;
        int c = matrix[0].length-1;
        while (r < matrix.length && c >=0)
        {
            if(matrix[r][c]==target)
            {
                // target found return it
                return true;
            }

            if(matrix[r][c]< target){
                r++;
            }
            else
            {
                c--;
            }
        }
        return false;
    }
}
