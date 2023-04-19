package com.siddharth;

import java.util.Scanner;

public class Q_Identify_character_case {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if( ch>='a' && ch <='z')
        {
            System.out.println("Lower Case Character");
        }
        else if( ch>='A' && ch <='Z')
        {
            System.out.println("Upper Case Character");
        }
        else {

            System.out.println("Its not a character");
        }
    }
}
