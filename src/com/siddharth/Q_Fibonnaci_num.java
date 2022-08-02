package com.siddharth;

import java.util.Scanner;

public class Q_Fibonnaci_num {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = 0;
        int b= 1;

        int num=2;

        while(num <= n)
        {
          int temp = b;
          b = b+a;
          a= temp;
            num++;
        }
        System.out.println(b);
    }
}
