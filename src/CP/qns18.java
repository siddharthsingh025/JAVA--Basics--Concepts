package CP;

import java.util.ArrayList;
import java.util.List;

public class qns18 {

    public static void main(String[] args) {
        List<List<Integer>> pairs = subset(6,5);

        for (List<Integer> num:pairs) {

            System.out.println(num);
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
