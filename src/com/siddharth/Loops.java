package com.siddharth;

public class Loops {
    public static void main(String[] args) {

        /*
             Syntax of for loop ::

              for ( initialisation ; conditional ; increment/decrement )
              {
                  //body
               }

         */

        // Q: print numbers from 1 to 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


         /*
             Syntax of While loop ::

              while ( conditional )
              {
                  //body
               }

         */

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }


        // Use while loop when you don't know how many times loop will run or  you can use for loop


     /*
             Syntax of  do While loop ::

            do
              {
                  //body

               }  while ( conditional )

         */
        int number = 1;

        do{
            System.out.println("Hello world");
        } while(number != 1);

    }
}

