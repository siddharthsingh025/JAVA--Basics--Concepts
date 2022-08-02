package com.siddharth;

import java.util.Scanner;

public class Switch_Statements {

    /*

                 what is the difference between ' == ' and ' .equal '

              // == checks reference where . equal check only values
              Ex :: if a and b has value "sidd" which is a single object where both identifier a and b pointing the
                    same value/ object called " sidd" with same reference , BUT if there are two objects
                     "sidd" 1 and "sidd" 2  with different reference 1 & 2 so in this case '==' gives false but
                     ' .equal ' gives true bcoz its only check value not reference
     */



    // Switch Statements

    /*  Syntax :

         Switch (expression)
         {
           case 1:  //to do
                       break;   // used for terminating the sequence
           case 2:  //to do
                       break;
           case 3:  //to do
                       break;
           case n:  //to do
                       break;
           Default :
                    // to do if no case match

         }


  NOTE :: If break is not provided than it will execute all the line until the last case including default or until
          another break is comes
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         while(true)
         {
        String fruit = input.next();



        switch ( fruit)
        {
            case "Mango" :
                System.out.println("Colour is yellow");
                break;
            case "Apple" :
                System.out.println("Colour is Red");
                break;
            case "Orange" :
                System.out.println("Colour is orange");
                break;
            case "Lichi" :
                System.out.println("Colour is White + red");
                break;

            default:
                System.out.println("!! Nothing to show !!");
        }


        // # Alternative #   { press option / alt  + enter to change it new syntax

             /*

             switch (fruit) {
                 case "Mango" -> System.out.println("Colour is yellow");
                 case "Apple" -> System.out.println("Colour is Red");
                 case "Orange" -> System.out.println("Colour is orange");
                 case "Lichi" -> System.out.println("Colour is White + red");
                 default -> System.out.println("!! Nothing to show !!");
             }



              */



             if(fruit.equals("x") || fruit.equals("X"))
        {
            break;
        }


    }




        //Identify weekends or weekdays

        int n = input.nextInt();

        switch (n)
        {
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("Weekends");
        }








    }

}

