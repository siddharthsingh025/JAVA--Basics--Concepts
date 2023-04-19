package CP;

import java.util.Scanner;

public class QNS3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        System.out.println(" ");

        while (T!=0)
        {
            int c=0;
            int s = input.nextInt();
            System.out.print(" ");
            int x = input.nextInt();
            System.out.print(" ");
            int y= input.nextInt();
            System.out.print(" ");
            int z = input.nextInt();

          int r = s-(x+y);

          if(z<=r)
          {
              System.out.println(0);
          }
          else {
                  if(x>y)
                  {
                      r=r+x;
                      c++;

                      if(z>r)
                      {
                          c++;
                      }

                      System.out.println(c);
                  }

                  else
                  {
                      r=r+y;
                      c++;

                      if(z>r)
                      {
                          c++;
                      }

                      System.out.println(c);
                  }
          }

            T--;
        }
    }
}
