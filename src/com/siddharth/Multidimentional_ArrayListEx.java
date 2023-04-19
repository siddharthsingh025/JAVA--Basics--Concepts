package com.siddharth;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimentional_ArrayListEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Syntax

        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();

        // initialisation  of 2D array list with  an Arraylist

        for (int i = 0; i < 3; i++) {

            list.add(new ArrayList<>());
        }

        // add elements

        for (int i = 0; i <3; i++) {
            list.get(i).add(input.nextInt());
            
        }
    }
}
