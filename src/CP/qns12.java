package CP;

import java.util.Scanner;

public class qns12 {


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int t = input.nextInt();

        while(t>0) {

            int N = input.nextInt();
            String A = input.next();

            String Con = isVowel("",A);

            int c=0;

            for (int i = 0; i < Con.length(); i++) {

              if(c<4)
              {
                  if(Con.charAt(i)=='0')
                  {
                      c=0;
                  }
                  else
                  {
                      c++;
                  }
              }
            }


            if(c<4)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            t--;
        }
    }


    static String isVowel(String p , String up)
    {
        if(up.isEmpty())
        {
            return p;
        }

        char ch = up.charAt(0);
        if(ch =='a' ||ch =='e'  ||ch =='i' ||ch =='o' ||ch =='u')
        {
            return   isVowel(p+'0',up.substring(1));
        }

        return  isVowel(p + ch,up.substring(1));
    }
}
