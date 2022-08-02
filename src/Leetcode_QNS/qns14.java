package Leetcode_QNS;

public class qns14 {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

  static   public int firstBadVersion(int n) {

        int s=0;
        int e=n;

        while (s<=e)
        {
            int m= s + (e-s)/2;
            boolean res = isBadVersion(m);

            if(res && !isBadVersion(m - 1))
            {
                return m;
            }

            else if(!res)
            {
                s=m+1;
            }
            else if(res)
            {
                e=m-1;
            }
        }

        return -1;
    }

   static private boolean isBadVersion(int num) {

        int p=8;
        if(num==p)
            return true;

        return false;
    }
}

