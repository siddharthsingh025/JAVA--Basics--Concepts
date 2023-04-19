package Leetcode_QNS;
//https://leetcode.com/problems/valid-perfect-square/submissions/
public class qns15 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));

    }
  static   public boolean isPerfectSquare(int num) {

        for(int i=1;i<=num/i;i++)
        {
            if(num/i==i && num%i==0)
            {
                return true;
            }
        }
        return false;
    }
}
