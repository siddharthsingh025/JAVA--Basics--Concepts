package CP;

import java.util.Scanner;

public class qns11 {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner input= new Scanner(System.in);
        int t = input.nextInt();

        while(t>0)
        {

            int N = input.nextInt();
            String A = input.next();

            StringBuilder st = new StringBuilder();
            st.append(A);

            if(isPalindrom(st.toString()))
            {
                System.out.println("YES");
            }

            else{

                for (int i=0;i<A.length()-3 ;i++ )

                {
                    char temp = st.charAt(i);
                    st.setCharAt(i,st.charAt(i+2));
                    st.setCharAt(i+2,temp);
                }


                if(isPalindrom(st.toString()))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }


            t--;
        }



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
            help(str, s++, e--);
        }

        return false;
    }

}
