package Leetcode_QNS;

import java.util.Scanner;

public class qns23 {
    public int getDecimalValue(ListNode head) {

        int p = lengthCal(head);
        ListNode temp = head;

        int ans =0;

        if(temp==null)
        {
            return -1;
        }

     Scanner input= new Scanner(System.in);



        if(p==1)
        {
            if(temp.val==0)
            {
                return 0;
            }
        }

        while(temp!=null)
        {

            ans += toDec(temp.val,p);
            if(temp.next==null){ break; }
            temp=temp.next;
            p--;
        }

        return ans;
    }



    public int toDec(int val , int pos)
    {
        return(int) (val*( Math.pow(2,pos)));
    }





    public int lengthCal(ListNode head)
    {
        int l=0;
        ListNode temp = head;
        if(head==null){return l;}

        while (temp.next!=null){
            temp=temp.next;
            l++;
        }

        return l;
    }
}
