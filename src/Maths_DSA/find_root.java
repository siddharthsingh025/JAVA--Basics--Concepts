package Maths_DSA;

public class find_root {

    public static void main(String[] args) {


        System.out.println(BS_sqrt(40,6));
    }

    static double BS_sqrt(int n, int p)
    {
        int s = 0;
        int e=n;

        double root = 0.0;

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

        double inc =0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n)
            {
                root+=inc;
            }

            root-=inc;
            inc/=10;
        }

        return root;
    }
}
