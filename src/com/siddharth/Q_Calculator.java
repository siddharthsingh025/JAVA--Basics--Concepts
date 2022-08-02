package com.siddharth;

import java.util.Scanner;

public class Q_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input form user until user don't press 'X' or 'x'

        int ans = 0;
        while (true) {
            //take the operator as input
            System.out.print(" Enter the operator : ");
            char op = input.next().trim().charAt(0);
            System.out.println();


            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                // take  two input  from user
                System.out.println("Enter two Numbers :: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();


                if (op == '+') {
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;

                    }
                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '%') {
                    ans = num1 % num2;

                }

            }
            else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation !!");
            }

            System.out.println(" result = " + ans);

        }
    }
}
