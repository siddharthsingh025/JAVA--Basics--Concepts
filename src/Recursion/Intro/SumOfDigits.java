package Recursion.Intro;

public class SumOfDigits {


    public static void main(String[] args) {

        System.out.println(SumOfD(1342));
    }


    static  int SumOfD(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return (n%10) + SumOfD(n/10);
    }
}
