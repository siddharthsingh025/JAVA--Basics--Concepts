package com.siddharth;

import java.util.Scanner;

public class Main {         // class must have same name as file name ,
                            // in java all codes are written as class
                             //  we use "public " keyword for make it accessible for all

    public static void main(String[] args) {
        System.out.println("Hello world");    // here system is class contain out variable
                                              // that has println function  , you can say out is used for
                                              // printing output into commandline ( you can also out to a file )

        Scanner input = new Scanner(System.in); // here we define object of scanner class that's provide many functions
                                                // and we pass system.in ( " keyboard input " ) to  "input" object

        System.out.println(input.nextLine()); // here we do output ,
                                               // we call function " nextline()" on object / input
                                               // to get system.in and display it on command line

    }
}
