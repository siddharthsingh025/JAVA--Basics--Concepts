package Internship_codingRn_qns;

import java.util.ArrayList;


// solved microsoft sre qns1
public class solution3 {

    public static void main(String[] args) {


        ArrayList<String> list1 =new ArrayList<>();
        ArrayList<String> list2 =new ArrayList<>();
        ArrayList<String> list3 =new ArrayList<>();
        System.out.println(cost("","dddd" ,list1));
                System.out.println(cost("","cycle",list2));
        System.out.println(cost("","world",list3));

    }


    static ArrayList<String> cost( String p,String up ,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }

        char current = up.charAt(0);

            if(check(p,current))
            {
                   list.add(p);
               return cost(p ="",up,list);
            }

     return cost(p+current ,up.substring(1),list);
    }
    


    static  boolean check(String s , char ch)
    {
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)==ch)
            {
                return true;

            }
        }

        return false;
    }


}
