package CP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QNS1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        List<Integer> list = new ArrayList<>();

        while (t!=0)
        {
            int x = input.nextInt();
            int y =input.nextInt();

            if(y>x)
            {
                list.add(Fun(x,y)) ;
            }
            else {
                list.add(Fun(y,x));
            }

            t--;
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

    }





    static int Fun(int a , int b)
    {
        int count =0 ,z;
        while (a!=b) {
            z = b-a;


                if(z>=2)
                {
                    a=a+2;
                    count++;
                }

                else {
                    a=a+1;
                    count++;
                }
        }

        return count;
    }
}
