package com.siddharth;

import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//                float nu1 = input.nextFloat(); // in this  if you give integer
//                                              // then it will convert into float
//                                              // bcoz size of float is greater then int
//                                               //  or you can say float contains all intergers + decimal values
//
//        int num2 = input.nextInt();          // in this if you give float value then
//                                            // it will show error bcoz size
//                                             // of interger is smaller then float nd it can't be converted
//
//        // Type Casting
//
//        int num3 =  (int ) (45.89f);    // this is called narrow type casting means , Explicit conversion of data to small size data
////                                           // i.e.  bigger float value convert into small size integer value called type casting
//
//        // automatic type promotion in expression
//
//        int a = 257;
//        byte b =  (byte) (a);
//
//        System.out.println(b); //  here its give 1 bcoz range of byte is 256 max
//                                  // nd here we want to store 257
//                                // thats why after type casting its display 256 % 257 = 1
//
//        // now lets
//
//        byte a1 = 40;
//        byte b1 = 50;
//        byte c1 = 100;
//
//        int s = a1 * b1 /100; // here we know bytes data type has range upto 256 max.
//                                       // and on multiplying a1 * b1 we get 2000
//                                       // which is exceed the range 256
//                                       // that's not possible to store it so
//                                       //   java automatic promote it
//                                 // in the expression to integer and then get evaluate
//
//        System.out.println(s);
//
//
//        // #Rule
//        // 1. All the " byte " , " char " , " short "  are promoted to " integer " ,
//        // then if any one of the operands is " long " the whole operation will be promoted to long
//        // if it is " float " then whole operation will be promoted to " float "
//        // if it is " double "  then whole operation will be promoted to " double "
//
//        // example

        System.out.println( 3 * 5.6f);

        // example 2

        byte b2 = 42;
        char c2 = 'a';
        short s2 = 1024;
        int i = 50000;
        float f = 5.67f;
        double d =  0.1234;

        double result = (f * b2) + (i / c2) - (d * s2);

        //float + integer - double = double

        System.out.println(  (f * b2)  + " "  + (i / c2)  + " " + (d * s2));
        System.out.println(result);


    }
}
