package Recursion.Intro.leetcode;

public class CountSteps {

    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

    public static void main(String[] args) {

        System.out.println(numberOfSteps(41));

    }

  static   public int numberOfSteps(int num) {

        return helper(num , 0);
    }

   static private int helper(int n, int s) {

            if(n==0) {return s;}

            if(n%2==0)
            {
                 return helper(n/2 ,s+1);
            }

            return helper(n-1 , s+1);
    }


}
