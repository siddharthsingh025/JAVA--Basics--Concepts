package com.siddharth;

import java.util.Scanner;

public class Q_Largestnumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(b > max)
        {                                  //  int max = Math.max( c , Math.max(a,b) ) ;
            max=b;
        }

        if(c > max)
        {
            max=c;
        }

        System.out.println("Maximum numbers among these you Entered :: " + max);

    }
}


/*

      we can also use  Math.max()  as substitute against if-statements
      Ex::

      int max = Math.max(57,38);  gives  57

      =>
         int max = Math.max( c , Math.max(a,b) ) ;
 */