package CP;

import java.util.Scanner;

//https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4a94/0000000000b5503a
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t= input.nextInt();
        System.out.println("");

        int i=1;
        while (i<=t){

            int N = input.nextInt();
            System.out.print(" ");
            int M= input.nextInt();
            System.out.println(" ");
            int sum=0;

            for (int j = 0; j < N; j++) {

              sum=sum+input.nextInt();
            }

            int a,b,c;

            a=sum/M;
            b=a*M;
            c=sum-b;

            System.out.println("#"+i+":"+c);
            i++;
        }
    }

}


//
//
//import java.util.*;
//        import java.io.*;
//public class Solution {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//
//        int t= input.nextInt();
//        System.out.println("");
//
//        int i=1;
//        while (i<=t){
//
//            int N = input.nextInt();
//            System.out.print(" ");
//            int M= input.nextInt();
//            System.out.println(" ");
//            int sum=0;
//
//            for (int j = 0; j < N; j++) {
//
//                sum=sum+input.nextInt();
//            }
//
//            int a,b,c;
//
//            a=sum/M;
//            b=a*M;
//            c=sum-b;
//
//            System.out.println("#"+i+":"+c);
//            i++;
//        }
//    }
//}
//
