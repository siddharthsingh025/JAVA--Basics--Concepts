package Leetcode_QNS;
//https://leetcode.com/problems/guess-number-higher-or-lower/
public class qns13 {

    public static void main(String[] args) {
        System.out.println(guessNumber(40));

    }

   static public int guessNumber(int n) {

        int s=0;
        int e=n;

        while (s<=e)
        {
            int m= s + (e-s)/2;
            int res = guess(m);

            if(res==0)
            {
                return m;
            }

            else if(res==1)
            {
                s=m+1;
            }
            else if(res==-1)
            {
                e=m-1;
            }
        }

        return -1;
    }


   static int guess(int num)
    {
        int p=6;
        if(num==p)
        return 0;
        else if (num>p)
            return -1;
        return 1;
    }

}
