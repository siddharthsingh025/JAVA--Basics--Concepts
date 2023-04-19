package Internship_codingRn_qns;

import java.util.Scanner;

public class d {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t>0)
        {
            int r = input.nextInt();
            int c = input.nextInt();

            int r1=r;
            int c1 =c;


            if(r1==1 && c1==1)
            {

                System.out.println(1);
            }
            else
            {


              if( r1%2==0 && c1%2==0)
              {
                  System.out.println(0);
                  continue;
              }

                while(r1-2>=0 || c1-2>=0)
                {
                    if(r1-2>=0)
                    {
                        r1=r1-2;

                    }

                    if( c1-2>=0)
                    {
                        c1=c1-2;
                    }

                }


                if(r1==0 && c1==1)
                {
                    System.out.println(c1*r);
                }
                else if(r1==1 && c1==0)
                {
                    System.out.println(r1*c);
                }
                else if(r1==1 && c1==1)
                {
                    System.out.println(r1*c + c1*r);
                }
            }



            t--;
        }
    }


}
