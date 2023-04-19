package Internship_codingRn_qns;

import java.util.LinkedList;

public class Worthy_King_II_trilogy {

    public static void main(String[] args) {
        int[] arr= {3,4,6,7};

        int ans = Kingdom(arr);
        System.out.println(ans);
    }

    public static int Kingdom(int[] A)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {

            list.addLast(A[i]);
        }

        int X=1 ,y=0,count=0;
        while (list.size()!=0)
        {
            y +=X;
            for (int i = 0; i < list.size(); i++) {

                if(y==list.get(i))
                {
                    X++;
                    list.remove(i);
                    y=0;
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if(y>list.get(i))
                {
                    X++;
                    list.remove(i);
                    y=0;
                }
            }
            count++;
        }

        return count;
    }


}
