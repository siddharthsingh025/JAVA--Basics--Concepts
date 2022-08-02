package CP;

import java.util.Scanner;

public class qns14 {


    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int t = input.nextInt();

        while(t>0)
        {

            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();
            int r = input.nextInt();

            if(r==0 || x>r || n*x>r)
            {
                System.out.println(-1);
                continue;
            }


            int ans[] = fun(n,r,x,y,new int[]{0,0});

            if(ans[0]+ans[1] < n)
            {
                System.out.println(-1);
                continue;
            }
            System.out.println(ans[0] + " " + ans[1]);

            t--;
        }
    }


//    static int[] fun(int N, int R, int x , int y,int[] ans)
//    {
//
//        if(N==0||R==0)
//        {
//         return ans;
//        }
//
//        if((N-1)*x <= R-y)
//        {
//            ans[1]=ans[1]+1;
//           return   fun(N-1,R-y,x,y,ans);
//        }
//
//        ans[0]=ans[0]+1;
//      return   fun(N-1,R-x,x,y,ans);
//    }




    static int[] fun(int N, int R, int x , int y,int[] ans)
    {


        for (int i=1;N>0 && R>0 ;i++ )
        {
            if((N-1)*x <= R-y)
            {
                ans[1]=ans[1]+1;
                N=N-1;
                R=R-y;
                continue;
            }
            ans[0]=ans[0]+1;
            N=N-1;
            R=R-x;

        }

        return ans;
    }
}
