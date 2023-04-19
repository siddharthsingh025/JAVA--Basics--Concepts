package Leetcode_QNS;
//https://leetcode.com/problems/arranging-coins/
public class qns16 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

  static   public int arrangeCoins(int n) {

        int r=n;
        for (int i = 1; i <=n; i++) {
            r = r-i;
            if(r<0)
            {
                return i-1;
            }

        }

        return 1;
    }
}
