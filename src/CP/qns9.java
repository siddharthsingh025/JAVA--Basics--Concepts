package CP;

import java.util.Scanner;

public class qns9 {


    public static void main(String[] args) {
        try{

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t>0)
        {
            String Instr = input.next();
            if(isYes(Instr))
            {
                System.out.println("YES");
            }

            else {
                System.out.println("NO");
            }
            t--;
        }


        }catch(Exception e){
            return;
        }


    }



   static public boolean isYes(String str)
    {
        StringBuilder s = new StringBuilder();
        s.append(str);

        if(s.charAt(0)=='y'|| s.charAt(0)=='Y')
        {
            if(s.charAt(1)=='e'|| s.charAt(1)=='E')
            {
                if(s.charAt(2)=='s'|| s.charAt(2)=='S')
                {
                    return true;
                }
            }
        }

        return false;
    }
}
