package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimentional_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*   2D-array

           2 3 4
           4 5 6
           7 8 9


         */

         /* int[][] arr = new int[3][9];  // in 2-D array , RxC we have in where Defining R ( row ) is must/ Compulsory  */
        /*
             also you can define array like that ::  int Arr[][] = new int[3][3];
                                                        int arr[] = new int[8];
         */


        int[][] arr = {
                {1,2,3,4,5,6}, // 0th index
                {3,5,6,8,80,90}, //1st index
                {2,45,7,89,4}  // 2nd index           // if you display arr[2] = { 2,45,7,89,4 }    // if you display arr[2][3] = 89
        };

        //if you want to display length of 2d array then it gives you no. of rows
        System.out.println(arr.length); // no. of rows


        // INPUT

        int[][] Arr = new int[3][3];

        for (int row = 0; row <Arr.length; row++) {

            // for each col. in every row of array

            for (int colm = 0; colm < Arr[row].length; colm++) {

                Arr[row][colm] = input.nextInt();

            }

        }

        // OUTPUT

        for (int row = 0; row <Arr.length; row++) {

            // for each col. in every row of array

            for (int colm = 0; colm < Arr[row].length; colm++) {

                System.out.print(Arr[row][colm] + " ");

            }

            System.out.println(" ");

        }

        // + alternative +

        for (int[] ints : Arr) { // when we use enhanced for loop for  1d-array then we declare variable as integer bcoz it contains integers inside it ,
                                   // so , now here we declare a 2d-array that means its array of arrays so ,it contains array then the data type of declared variable is also array  EX: int[] ints : Arr

            // for each col. in every row of array

            System.out.println(Arrays.toString(ints));

        }



        int[][] array = {
                {1,2,3,4}, // 0th index / also row no.
                {3,5,6,8,80,90}, //1st index / also row no.
                {2,4}  // 2nd index        / also row no.
        };

        // output for No fixed size of column 2d-array

        for (int row = 0; row < array.length; row++) {

            for (int colm = 0; colm <array[row].length; colm++) {
                System.out.print(array[row][colm] + " ");

            }
            System.out.println();
        }

    }
}
