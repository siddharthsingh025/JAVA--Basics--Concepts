package Leetcode_QNS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qns_meeting {

    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here

        int cnt=0;
        List<Pair> ls = new ArrayList<Pair>();

        int temp=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ls.add(new Pair(start[i],end[i]));
        }

        Pair p= new Pair(0,0);
        for(int i = 0; i< ls.size() ; i++){
            if( i <ls.size()-1 &&(ls.get(i).x > p.y)){
                p = ls.get(i);
               cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] a = { 1 ,3, 0, 5 ,8, 5};
        int[] b = { 2, 4, 6 ,7 ,9, 9};
        System.out.println(maxMeetings(a,b,6));
    }

}
