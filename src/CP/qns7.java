package CP;

import java.util.Scanner;

public class qns7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner input= new Scanner(System.in);
        int t = input.nextInt();



        while(t>0)
        {
            int n = input.nextInt();
            int x = input.nextInt();


            if(x>=n)
            {
                System.out.println(0);
                continue;
            }
            else
            {

                int y = n-x;
                int pack=4;

                while(true)
                {
                    if(y<=pack)
                    {
                        break;
                    }

                    pack+=4;
                }

                System.out.println(pack/4);
            }

            t-=1;
        }
    }
}
