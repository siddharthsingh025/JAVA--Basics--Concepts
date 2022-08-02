package Recursion.Intro;

public class FibbonaciSeries_recursion {

    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

    }

    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }

        return fibo(n-1)+ fibo(n-2);  // not  tail recursion bcoz its wait for output of these two fibo() functiojn call then it add them to done its functioning
    }

}
