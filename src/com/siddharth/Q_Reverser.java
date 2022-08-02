package com.siddharth;

import java.util.Scanner;

public class Q_Reverser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int rem, temp=0;

        while(num>0)
        {
            rem = num%10;
            temp =  temp*10 + rem;
            num= num/10;
        }

        System.out.println(temp);

    }
}

//3456543
//3456543