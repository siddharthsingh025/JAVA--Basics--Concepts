package CP;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class qns10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

        while (t>0)
        {
            int n = in.nextInt();
            String s = in.next();
            StringBuilder str = new StringBuilder();
            str.append(s);

            ArrayList<Boolean> list = new ArrayList<Boolean>(26);
            int ans =0;
            for (int i = 0; i <n; i++) {
                char ch = str.charAt(i);
                if(isSolved(ch,list)==0)
                {
                    ans+=1;
                }

                else
                {
                    ans+=2;
                }
            }

            System.out.println(ans);

            t--;
        }
    }


    static int  isSolved(char ch , ArrayList<Boolean> list)
    {


        if(list.size()==0)
        {
            for (int i = 0; i < 26; i++) {
                list.add(i,false);
            }
        }
       int x = ch;
       int y=x-65;
       if(!list.get(y))
       {
         list.set(y,true);
           return -1;

       }
       else
       {
           return 0;
       }
    }
}
