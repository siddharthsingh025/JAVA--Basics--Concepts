package CP;

import java.util.Scanner;

public class qns4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        System.out.println(" ");

        while (T!=0)
        {
            int x = input.nextInt();
            System.out.println(" ");
            int y = input.nextInt();

            if(x>y)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(y);
            }

            T--;
        }
    }
}
