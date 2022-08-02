package com.siddharth;

import java.util.Scanner;

public class Q_Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.println(" Enter temperature in C :: ");
        float tempC= input.nextFloat();
        float tempF = ( tempC * 9/5) + 32;

        System.out.println("temperature in F :: " + tempF);


    }
}
