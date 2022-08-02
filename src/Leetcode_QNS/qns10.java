package Leetcode_QNS;

import java.util.ArrayList;

//https://leetcode.com/problems/max-value-of-equation/
//not accepted yet
public class qns10 {

    public static void main(String[] args) {

        int[][] ar= {
                {-19,-12},
                {-13,-18},
                {-12,18},
                {-11,-8},
                {-8,2},
                {-7,12},
                {-5,16},
                {-3,9},
                {1,-7},
                {5,-4},
                {6,-20},
                {10,4},
                {16,4},
                {19,-9},
                {20,19}
        };

        int ans = findMaxValueOfEquation(ar,6);
        System.out.println(ans);

    }

   static public int findMaxValueOfEquation(int[][] points, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <points.length-1; i++) {

            for (int j = i+1; j <points.length; j++) {

                int x = points[i][0]-points[j][0];

                if(x<=k)
                {
                    int n =  points[i][1]+points[j][1]+x;
                    list.add(n);
                }
            }

        }

       for (int i = 0; i < list.size(); i++) {

           if(max<list.get(i))
           {
               max=list.get(i);
           }
       }
        return max;
    }
}
