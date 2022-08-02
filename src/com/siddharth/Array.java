package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        *****************************************************************
/*
            Objects of array in heap memory in java are not located in series or consecutive sequences like C++ and python

             { _,_,_,_,_,_,_ }
               0 1 2 3 4 5 6   : INDEX
 */
//        *****************************************************************


        /*
                + ARRAY OF PRIMITIVES +
       */

        //Syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll number :
    //  int[] rno = new int[5];
        // # or directly #
    // int[] rno2 = { 23 ,12 , 45 ,32 , 15 };

//         int[] rons; // declaration of array. ros is getting defined in the stack
        int [] rons = new int[5]; // initialisation : actually here object is being created in the memory( heap)
        rons[0] = 32;
        rons[1] = 34;
        rons[2] = 432;
        rons[3] = 332;
        rons[4] = 3;

        // rons = [ 32,34,432,332,3]
        System.out.println(rons[4]);

        //for loop for input in array

        for (int i = 0; i < rons.length; i++) {
            rons[i] =input.nextInt();
        }

        //for loop for output in array

        for (int i = 0; i < rons.length; i++) {
            System.out.print(rons[i] + " ");        }


        //for each loop ( enhanced form of above loop )

        for (int n : rons) { // for every element of array , print the element
            System.out.print(n + " "); // here n represents the every element of array
        }


        //easiest way to display arrays items

        System.out.println(Arrays.toString(rons));



        // *********
        System.out.println(rons[5]); // ERROR , index out of bound



        /*
               +  ARRAY of Objects +

         */

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {

            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        str[1]="kunal";

        System.out.println(Arrays.toString(str));



    }
}
