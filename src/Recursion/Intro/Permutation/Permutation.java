package Recursion.Intro.Permutation;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

        permutation("","abc");

        ArrayList<String>  ans  = permutationList("","abc");
        System.out.println(ans);
    }



    static void permutation(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i=0; i<=p.length() ; i++)    // see i  as position  , where we add our ch into processed string
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s ,up.substring(1));  // see f as left of processed string where ch add
                                                        // s as its right elements that remaining
        }
    }





    // returning array list

    static ArrayList<String> permutationList(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans =new ArrayList<>();

        for (int i=0; i<=p.length() ; i++)    // see i  as position  , where we add our ch into processed string
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           ans.addAll(permutationList(f+ch+s ,up.substring(1))) ;  // see f as left of processed string where ch add
            // s as its right elements that remaining
        }

        return ans;
    }


    // count how many ans you got , without passing count as argument

    static int permutationCount(String p , String up)
    {

        if(up.isEmpty())
        {
            return 1;
        }

        char ch = up.charAt(0);

        int count =0;
        for (int i=0; i<=p.length() ; i++)    // see i  as position  , where we add our ch into processed string
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count = count+ permutationCount(f+ch+s ,up.substring(1));  // see f as left of processed string where ch add
            // s as its right elements that remaining
        }

        return count;
    }


    // count how many ans you got , with passing count as argument

    static int permutationCount2(String p , String up , int c)
    {

        if(up.isEmpty())
        {
            return 1;
        }

        char ch = up.charAt(0);
        for (int i=0; i<=p.length() ; i++)    // see i  as position  , where we add our ch into processed string
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            c = c+ permutationCount(f+ch+s ,up.substring(1));  // see f as left of processed string where ch add
            // s as its right elements that remaining
        }

        return c;
    }

}
