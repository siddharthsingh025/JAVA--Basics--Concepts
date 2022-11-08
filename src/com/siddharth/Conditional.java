package com.siddharth;

public class Conditional {

    public static void main(String[] args) {

        /*
           Syntax for conditional statements

           if (  Boolean expression  t or f )
                  {
                     //body
                  }
           else  {
                   //do this
                  }
         */
//
//        int salary = 24589;
//
//        if ( salary > 10000)
//        {
//            salary = salary + 2000;
//        }
//        else
//        {
//            salary = salary +1000;
//        }
//
//        System.out.println(salary);
//    }


        // multiple if-else statements

        int salary = 24589;

        if (salary > 10000) {
            salary += 2000;
        }
        else if ( salary < 20000)
        {
            salary += 3000;
        }
            else {
            salary  += 1000;
        }

        System.out.println(salary);
    }


}
