package com.siddharth;

import java.util.Scanner;

public class InputsOutputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter some input :: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is ::  " + rollno);

        String name = input.next();
        System.out.println("Your name is :: " + name );

        float marks = input.nextFloat();
        System.out.println(" marks = " + marks);

    }
}
