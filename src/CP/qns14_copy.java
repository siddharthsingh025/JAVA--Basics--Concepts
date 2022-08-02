package CP;

import java.util.Scanner;

public class qns14_copy {


    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();

            while (t > 0) {



                int x = input.nextInt();
                int y = input.nextInt();
                int n = input.nextInt();
                int r = input.nextInt();

                if ((r / y) >= n) {
                    System.out.println(0+" "+n);

                } else if ((r / x) < n) {
                    System.out.println(-1);
                } else {

                    int g = (y * n);
                    int f = (x - y);

                    int m = (r - g) / (f);
                    if ((r - g) % f != 0) {
                        m = m + 1;
                    }
                    System.out.println(m+ " " + (n-m));
                }

              t--;
            }
        } catch (Exception e) {
            return;
        }

    }

}
