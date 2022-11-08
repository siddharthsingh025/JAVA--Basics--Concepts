package CP;

import java.util.ArrayList;
import java.util.List;

public class jn {


    public static void main(String[] args) {
        List<Integer> power = new ArrayList<>();
       power.add(2);
        power.add(3);
        power.add(3);
        power.add(4);
        power.add(4);
        power.add(1);
        power.add(8);
        power.add(7);
        System.out.println(power.toString());
        power.sort(null);
        System.out.println(power);
        System.out.println(getMaximumPower(power));
    }
    public static long getMaximumPower(List<Integer> power) {
        // Write your code here
        long sum =0;
        for(int i=0; i <power.size(); i++)
        {
            int c = power.get(i);
            sum += c;
            if(i<power.size()-1)
            {
                int n = power.get(i+1);
                if(n==c+1)
                {int j=i+1;
                    while (j<power.size()-1 && n==c+1)
                    {
                        n=power.get(++j);
                    }
                    i=j-1;
                }
            }
        }


        return sum;
    }
}
