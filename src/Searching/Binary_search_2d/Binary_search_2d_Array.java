package Searching.Binary_search_2d;

import java.util.Arrays;

public class Binary_search_2d_Array {
    public static void main(String[] args) {
        int [][] array = {
                {10 , 20 , 30 , 40},
                {11 , 25 , 35 , 45},
                {28 , 29 , 37 , 49},
                {33 , 34 , 38 , 50}
        };

        int[] ans = search(array , 37);
        System.out.println(Arrays.toString(ans));

    }

    /*

    ## APPROACH 1 ##

   --> Here search functions::
       it always compares last element of first row that is r=0 , c = matrix.length-1 ;
       then it checks 3 things
       1st:: whether the element is equal to target of not , if yes then it will be our finding position
       2nd:: whether the element is  less than target or not , if yes then we ignore that row by r++; bcoz element before it are also gone be smaller than target
       3rd:: whether the element is greater than target or not , if yes then we ignore that column by c--; bcoz element after it are also gone be greater than target

       ## worst case ## target not found , time complexity O(N) bcoz total case are N*M or N^2 then log of it was 2logN then constant will ignore So, total case in Binary search O(N);

     */
    public static int[] search(int [][] matrix , int target)
    {
        int r =0;
        int c = matrix.length-1;
        while (r < matrix.length && c >=0)
        {
            if(matrix[r][c]==target)
            {
                // target found return it
                return new int[]{ r, c};
            }

            if(matrix[r][c]< target){
                r++;
            }
            else
            {
                c--;
            }
        }
    return new int []{-1,-1};
    }
}



// NOTE:: always in SEARCHING always try to Reduce the space of array or matrix by ignoring the elements or row or columns