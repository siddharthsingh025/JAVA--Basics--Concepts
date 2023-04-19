package CP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QNS1copy {

   // https://www.codechef.com/submit-v2/INCREAR?tab=statement


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t!=0)
        {
            int x = input.nextInt();
            int y =input.nextInt();
            System.out.println(Fun(x,y));
            t--;
        }

    }





    static int Fun(int x , int y)
    {
        int count =0 ,z;

        if(x<y)

        {

           count = y-x;
        }

        else {
            while (x!=y) {
                if (y+2> x) {
                    x = x + 1;
                    count++;
                } else {
                    y = y + 2;
                    count++;
                }
            }

            }

        return count;
    }
}
