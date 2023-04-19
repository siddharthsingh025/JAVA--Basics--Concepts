package com.siddharth;

import java.util.Scanner;

public class Q_ArmstrongNumber {

    public static void main(String[] args) {


        // check whether the given number is Armstrong or not

//        Scanner input = new Scanner(System.in);
//        int num= input.nextInt();
//       boolean ans =  isArmstrong(num);
//        System.out.println(ans);

        //Print all 3 digits Armstrong numbers

        for (int i = 100; i < 1000; i++) {

            if(isArmstrong(i))
            {
                System.out.print(i + " ");
            }

        }

    }

     static boolean isArmstrong(int num) {

        int original = num;
        int sum =0;

        while(num>0){

            int rem = num % 10;
            num = num/10;
            sum = sum + (rem*rem*rem);
        }

        return sum==original;
    }
}
