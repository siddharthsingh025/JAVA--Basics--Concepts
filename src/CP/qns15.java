package CP;

import java.util.LinkedList;
import java.util.Scanner;

public class qns15 {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();

            while (t > 0) {



                int a = input.nextInt();
                int b = input.nextInt();
                int n = input.nextInt();

                if(a%b==0)
                {
                    System.out.println(-1);
                    continue;
                }
                else
                {
                    if(n%a==0)
                    {
                        int temp=n/a;
                        if(n%b==0)
                        {
                            temp++;
                        }
                        System.out.println(temp*a);
                    }
                    else if(n%a!=0)
                    {
                        int temp=n/a;
                        temp++;
                        if((temp*a)%b==0)
                        {
                            temp++;
                        }
                        System.out.println(temp*a);
                    }

                }
                t--;
            }
        } catch (Exception e) {
            return;
        }
    }
}
