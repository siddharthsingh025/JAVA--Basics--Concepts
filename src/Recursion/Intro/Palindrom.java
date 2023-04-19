package Recursion.Intro;

public class Palindrom {

    public static void main(String[] args) {

        System.out.println(coutnZ(23000320));
    }


static int coutnZ(int n)
{
    return helper(n,0);

}


    private static int helper(int n , int c)
    {
        if(n==0)
        {
            return c;
        }

        int rem = n%10;

        if(rem==0)
        {
            return helper(n/10,c+1);
        }

        else
        {
            return helper(n/10 , c);
        }
    }


}
