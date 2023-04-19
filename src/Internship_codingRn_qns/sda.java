package Internship_codingRn_qns;

import java.util.ArrayList;
import java.util.List;

public class sda {


    public static void main(String[] args) {
       ArrayList<String> q =new ArrayList<>();
       q.add("1001");
       q.add("11001");
        List<String> ans =findWinner(q);
        System.out.println(ans);

    }




    public static List<String> findWinner(List<String> specialStrings) {

        int r1=0;
        int r2=0;
        int o =1;
        int i=1;

List<String> ans = new ArrayList<>();

        for (String str : specialStrings) {


            while(!check(str))
            {

                if(i%2!=0) // i odd (BERT turn)
                {
                    if(isPalindrom(str))
                    {

                        if(o==1)
                        {
                            // reverse the stirng
                            str = reverse(str);
                            o=2;
                            r1=r1+0;
                        }

                        else

                        {//remove

                           str = remove(str);
                            o=1;
                            r1=r1+1;


                        }
                    }
                }
                else // Ernie turn
                {

                    if(isPalindrom(str))
                    {

                        if(o==1)
                        {
                            // reverse the stirng
                            str = reverse(str);
                            o=2;
                            r2=r2+0;
                        }

                        else

                        {//remove

                            str = remove(str);
                            o=1;
                            r2=r2+1;


                        }
                    }

                }
            }

            if(r1>r2)
            {
                ans.add("Ernie");
            }
            else
            {
                ans.add("BERT");
            }

        }


return ans;
    }










    static  String remove(String str)
    {
        return help2("",str);
    }

    static  String help2(String p , String up)
    {
        if(up.charAt(0)=='0')
        {
            return p +'1'+ up.substring(1);
        }

        char ch = up.charAt(0);

        return help2(p+ch, up.substring(1));
    }



    static  String reverse(String str)
    {
        return help1("",str);
    }

    static  String help1(String p , String up)
    {
        if(up.isEmpty())
        {
            return p;
        }

        int e = up.length()-1;

        char ch = up.charAt(e);

        return help1(p+ch, up.substring(0,e));
    }





    static  boolean check(String s)
    {

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='0')
            {
                return false;
            }
        }

        return true;
    }





    static  boolean isPalindrom(String str )
    {
        return  help( str , 0, str.length()-1);
    }

    static  boolean help(String str , int s, int e)
    {

        if(s>e)
        {
            return true;
        }

        if(str.charAt(s)==str.charAt(e))
        {
            return help(str, ++s, --e);
        }

        return false;
    }



}
