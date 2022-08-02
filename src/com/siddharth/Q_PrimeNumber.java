package com.siddharth;

import java.util.Scanner;

public class Q_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);

    }

     static boolean isPrime(int num) {
   int c=2;
        if(num<=1){
            return  false;
        }
       while(c*c<=num)
        {
            if(c%num ==0)
            {
                return false;
            }
            c++;
        }
       return c*c > num; // this is only an extra step which tell us that , if the number id not divisible by c and loop will ends
                            // then definitely value of c will exceed then num and loop will terminate so that means
                            // given number is prime number so that's why it check whether is c*c is > num so its not prime number
                            // if that condition is false so number is no prime ,   ** really we do not need this return statement
    }
}

//Root method is depend on
/*
There exists a point where the factors start repeating themselves.
 We had 4 x 9 and then 9 x 4 appears.  The spot where the factor pairs repeat is after 6 x 6.
 36 is a perfect square and 6 is it's square root.  For every factor of 36 less than 6,
 it has a "partner" factor which is greater than 36.
 Since 36 is a perfect square, 6, the square root acts as it's own partner.

 */
