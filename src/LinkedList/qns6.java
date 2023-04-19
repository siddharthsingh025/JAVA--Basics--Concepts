package LinkedList;
//https://leetcode.com/problems/happy-number/

public class qns6 {

    public boolean isHappy(int n) {

        int s= n;
        int f = n;
        do
        {
           s = funSqr(s);
           f = funSqr(funSqr(f));     // two pointers method;
        }while (f!=s);

        if(s==1)
        return true;

        return false;
    }

    private int funSqr(int num)
    {
        int ans=0;
        while (num>0)
        {
            int rem = num%10;
            ans += rem * rem;
            num/=10;
        }
        return ans;
    }

}

