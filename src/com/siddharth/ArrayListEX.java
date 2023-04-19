package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Syntax

        ArrayList<Integer>  list = new ArrayList<>(5); // here Arraylist is a class
                                                                    // and Integer in wrapper class (type of data you want to store in list )
                                                                    // , and ArrayList<>(10) is constructor

        list.add(32);
        list.add(4);
        list.add(4532);
        list.add(45);
        list.add(345352);
        list.add(433);

        System.out.println(list.contains(45)); // check weather that particular number is present or what

        System.out.println(list); // toString method is inbuilt inside Arraylist

        list.set(0,9);
        System.out.println(list); // see 0th index element get changed

        list.remove(3);
        System.out.println(list); // see 3rd index get removed

        //input
        for (int i = 0; i < 5; i++) {

            list.add(input.nextInt());
        }


        //output -- get item at any index

        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i)); // pass index here , list[index] syntax will not work here
        }
    }
}
