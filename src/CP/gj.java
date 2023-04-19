package CP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gj {


    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        try{
            // your code goes here

            Scanner input= new Scanner(System.in);
            int t = input.nextInt();

            while(t>0)
            {
                int N = input.nextInt();
                int M = input.nextInt();


                List<List<Integer>> pairs = subset(M,N);
                int max = Integer.MIN_VALUE;
                List<Integer> ans = new ArrayList<>();

                for (int i=0;i < pairs.size();i++ )
                {

                    List<Integer> arr = pairs.get(i);
                    int sub = arr.get(0)-arr.get(1);
                    if(sub<0){sub *= -1;}

                    if(sub>max)
                    {
                        ans.set(0,arr.get(0));
                        ans.set(1,arr.get(1));
                        max=sub;
                    }
                }
                System.out.println(ans);
                t--;

            }
        }catch (Exception e)
        {
            return;
        }
    }






    static List<List<Integer>> subset(int M, int N)
    {
        List<List<Integer>> outer = new ArrayList<>();

        for (int i=1;i<=M;i++) {
            for (int j =1 ; j<=M; j++) {

                int num = gcd(i,j);
                if(num>=N)
                {
                    List<Integer> internal = new ArrayList<>();
                    internal.add(i);
                    internal.add(j);
                    outer.add(internal);
                }
            }
        }
        return outer;
    }


    static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
}
