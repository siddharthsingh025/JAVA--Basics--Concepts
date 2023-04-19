package com.siddharth;

import java.util.Scanner;

public class Q_SameOccurance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int rem, count = 0;

        while(num>0)
        {
            rem= num % 10 ;
            if(rem == 3)
            {
                count++;
            }
            num = num/10;
        }




        System.out.println(" in given number 3 occurs " + count + " times");
    }
}
