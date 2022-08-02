package Recursion.Intro.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {

        subseq("","abc");
//        subseqASCII("","abc");
//        System.out.println( subseqRASCII("","abc"));
    }


    static void subseq(String p , String up )
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);

        subseq(p+ch ,up.substring(1));
        subseq( p , up.substring(1));
    }


    // if you want to array list of all subsequence

    static ArrayList<String> subseqR(String p , String up )
    {
        if(up.isEmpty())
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left =   subseqR(p+ch ,up.substring(1));
        ArrayList<String> right =  subseqR( p , up.substring(1));

        left.addAll(right); // hey will you take me with you to above recursion call , yes i will

        return left; // return to above recursion call with adding left + right recursive ans
    }



    // if you wanna add ASCII value print

    static void subseqASCII(String p , String up )
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqASCII(p+ch ,up.substring(1));
        subseqASCII( p , up.substring(1));
        subseqASCII(p+(ch+0),up.substring(1));
    }



    // if you wanna add ASCII value too in subset

    static ArrayList<String> subseqRASCII(String p , String up )



    {
        if(up.isEmpty())
        {
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> f =   subseqRASCII(p+ch ,up.substring(1));
        ArrayList<String> s =  subseqRASCII( p , up.substring(1));
        ArrayList<String> t =  subseqRASCII( p + (ch+0), up.substring(1));

        f.addAll(s);
        f.addAll(t);

        return f;
    }




}
