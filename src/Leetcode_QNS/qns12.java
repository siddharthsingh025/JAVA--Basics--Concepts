package Leetcode_QNS;
//https://leetcode.com/problems/sqrtx/
public class qns12 {

    public static void main(String[] args) {

        System.out.println(mySqrt(40));

    }

    static int mySqrt(int n)
    {
        int s = 0;
        int e=n;
        while (s<=e)
        {
            int mid = s + (e-s)/2;

            if(mid*mid == n)
            {
                return mid;

                //or
//                you can also write root = mid;
//                then return root;
            }
            else if(mid*mid >n)
            {
                e=mid -1;
            }
            else
            {
                s=mid+1;
            }
        }

        return e;
    }
}

