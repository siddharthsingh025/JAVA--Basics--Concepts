package Recursion.Intro.leetcode;

import java.util.ArrayList;

public class LetterCombOfPHN {

    public static void main(String[] args) {

//        numPad("","12");

//        System.out.println(numPadRet("","12"));
//        System.out.println(numPadCount("","12"));
        ArrayList<String> ans = solution("","179");
        System.out.println(ans);

    }


    static void numPad(String p , String up)
    {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0'; // this will convert '2' into 2

        // now we have to run for loop within the range for adding chars in processed

        for (int i = (digit-1)*3; i < digit*3  ; i++) {

            char ch = (char)('a'+i);
            numPad(p+ ch ,up.substring(1));
        }
    }



    // returning array list of all ans subsets

    static ArrayList<String> numPadRet(String p , String up)
    {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0'; // this will convert '2' into 2

        // now we have to run for loop within the range for adding chars in processed
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3  ; i++) {

            char ch = (char)('a'+i);
           ans.addAll(numPadRet(p+ ch ,up.substring(1)));
        }

        return ans;
    }

    // Count no of subsets

    static int numPadCount(String p , String up)
    {
        if(up.isEmpty()) {
          return 1;
        }
        int digit = up.charAt(0) -'0'; // this will convert '2' into 2

        // now we have to run for loop within the range for adding chars in processed

        int count =0;
        for (int i = (digit-1)*3; i < digit*3  ; i++) {

            char ch = (char)('a'+i);
            count = count + numPadCount(p+ ch ,up.substring(1));
        }

        return count;
    }





    // For leetcode submision


    static ArrayList<String> solution(String p , String up)
    {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';

        if(digit==1)
        {
          return solution(p,up.substring(1));
        }
        else if(digit==7)

        {
            ArrayList<String> ans = new ArrayList<>();

            for (int i = 15; i < 19  ; i++) {

                char ch = (char)('a'+i);
                ans.addAll(solution(p+ ch ,up.substring(1)));
            }
            return ans;

        }


       else if(digit ==9)

        {
            ArrayList<String> ans = new ArrayList<>();

            for (int i = 22; i < 26 ; i++) {

                char ch = (char)('a'+i);
                ans.addAll(solution(p+ ch ,up.substring(1)));
            }

            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = ((digit-1)*3)-3; i < (digit*3)-3  ; i++) {

            char ch = (char)('a'+i);
            ans.addAll(solution(p+ ch ,up.substring(1)));
        }


        return ans;

    }


}
