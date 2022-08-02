package com.siddharth;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    static int x = 90;
    public static void main(String[] args) {

        // Shadowing

        System.out.println(" value of x = " + x);
        int x = 10;
        System.out.println("shadowing happened , X = " + x);        //this is called shadowing when a global variable defined previously and then a local variable override on it


        // Function overloading

        /*
        when two function of same named are defined then compiler
         decide which functional were called by the parameters that passed in function call
         */

        fun(68);
        fun("Sidd");


        // Variable length Arguments

        /*

        these are the variable  that are defined when we don't know how many inputs we want
        it's a type of array whose length was not defined

        + Declaration +

        int ...v

         */
     VarArgs(1,2,3,4,5,6,7);



     //In java there is only Pass by value not pass by reference bcoz its doesn't have pointers

        /*
        when we use primitive data  type ( like int , char , short , boolean ) then , we pass the arguments by value , where function do not change original value
        so it doesn't effect on reference variable like :

         */

        int a =10;
        int b= 20;
        swap(10,20);  // so this will never swap the values of a and b bcoz here value of reference variable will pass
                            //and function creat copy of that values and swap them into the function that will not effect outside it
                            //bcoz the reference value not change any way


        // But when we work with NON - primitive data type ( like arrays , String , complex data dtypes )
        /*
         , here we also passed arguments by value not reference but via arguments declared
         in function we modify the reference  values , like :

         */
        int[] arr = { 1, 2, 3, 4 ,4};
        moddify(arr);// here we modified the arr[0]th index value by passing its value through function then function modify
                        // 0 th index value Via function variables , here we change original/ reference  value by
                         //reference of function variables which also pointing the value of reference variable



    }


     static void moddify(int[] arr) {
        arr[0]= 99;
    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a=b;
        b=temp;
    }

    static void fun ( int x){
        System.out.println("number is = "+ x);
    }
   static void fun ( String x){
        System.out.println("name is = "+ x);
    }

    static void VarArgs(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}


// what is primitive & non-primitive

//+ Primitive : that can not be breakdown like int can not be breakdown
//+ Non-primitive : that can be breakdown like strings are breakdown into characters, array can be breakdown into objects